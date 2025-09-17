"""Build a feature-rich dataset from tweets for persona modeling."""
import argparse
import json
import math
import re
import time
from collections import Counter
from datetime import datetime
from pathlib import Path
from typing import Dict, List

import pandas as pd
import requests
from bs4 import BeautifulSoup
from sklearn.cluster import KMeans
from sklearn.feature_extraction.text import TfidfVectorizer
from vaderSentiment.vaderSentiment import SentimentIntensityAnalyzer


EMOJI_REGEX = re.compile(
    "[\U0001F300-\U0001F5FF"  # symbols & pictographs
    "\U0001F600-\U0001F64F"  # emoticons
    "\U0001F680-\U0001F6FF"  # transport & map symbols
    "\U0001F700-\U0001F77F"  # alchemical symbols
    "\U0001F780-\U0001F7FF"  # geometric shapes extended
    "\U0001F800-\U0001F8FF"  # supplemental arrows-c
    "\U0001F900-\U0001F9FF"  # supplemental symbols & pictographs
    "\U0001FA00-\U0001FA6F"  # chess symbols, symbols & pictographs extended-a
    "\U0001FA70-\U0001FAFF"  # symbols & pictographs extended-b
    "\U00002702-\U000027B0"  # dingbats
    "\U000024C2-\U0001F251"  # enclosed characters
    "]",
    flags=re.UNICODE,
)

URL_REGEX = re.compile(r"https?://\S+")
MENTION_REGEX = re.compile(r"@[A-Za-z0-9_]+")
HASHTAG_REGEX = re.compile(r"#[\w_]+")
FIRST_PERSON_REGEX = re.compile(r"\b(I|I'm|me|my|mine|myself)\b", re.IGNORECASE)

BASE_URL = "https://twstalker.com"
API_URL = f"{BASE_URL}/service/api"


def _to_plain_text(html_text: str) -> str:
    soup = BeautifulSoup(html_text, "html.parser")
    return soup.get_text(" ", strip=True)


def _parse_metric(value):
    if value is None:
        return None
    if isinstance(value, (int, float)):
        return value
    if isinstance(value, str):
        cleaned = value.replace(",", "").strip().upper()
        multiplier = 1.0
        if cleaned.endswith("K"):
            multiplier = 1_000.0
            cleaned = cleaned[:-1]
        elif cleaned.endswith("M"):
            multiplier = 1_000_000.0
            cleaned = cleaned[:-1]
        elif cleaned.endswith("B"):
            multiplier = 1_000_000_000.0
            cleaned = cleaned[:-1]
        try:
            return float(cleaned) * multiplier
        except ValueError:
            return None
    return None


def _fetch_user_metadata(session: requests.Session, username: str) -> Dict[str, str]:
    attempts = 0
    max_attempts = 10
    while True:
        response = session.get(f"{BASE_URL}/{username}", timeout=30)
        if response.status_code == 429:
            attempts += 1
            if attempts >= max_attempts:
                response.raise_for_status()
            delay = max(5, 2 * attempts)
            time.sleep(delay)
            continue
        response.raise_for_status()
        break
    soup = BeautifulSoup(response.text, "html.parser")
    load_more = soup.select_one("a.add-nw-event")
    if load_more is None:
        raise RuntimeError("Unable to locate profile metadata; the account may be protected or unavailable.")
    return {
        "user_id": load_more.get("data-query"),
    }


def scrape_tweets(username: str, limit: int) -> List[Dict]:
    session = requests.Session()
    session.headers.update({
        "User-Agent": "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0 Safari/537.36",
        "Referer": BASE_URL,
    })
    metadata = _fetch_user_metadata(session, username)
    user_id = metadata["user_id"]
    tweets: List[Dict] = []
    cursor = ""
    page = 1

    attempts = 0
    max_attempts = 10
    while True:
        payload = {
            "page": page,
            "cursor": cursor,
            "data": user_id,
            "action": "profile",
        }
        response = session.post(API_URL, data=payload, timeout=30)
        if response.status_code == 429:
            attempts += 1
            if attempts >= max_attempts:
                response.raise_for_status()
            delay = max(5, 2 * attempts)
            time.sleep(delay)
            continue
        response.raise_for_status()
        attempts = 0
        data = response.json()
        page_tweets = data.get("tweets") or {}
        if not page_tweets:
            break
        for tweet in page_tweets.values():
            record = {
                "id": int(tweet.get("conversation_id_str")),
                "url": f"https://x.com/{tweet['core']['screen_name']}/status/{tweet['conversation_id_str']}",
                "date": datetime.strptime(tweet["created_at"], "%a %b %d %H:%M:%S %z %Y").isoformat(),
                "content": _to_plain_text(tweet.get("full_text", "")),
                "replyCount": tweet.get("reply_count", 0),
                "retweetCount": tweet.get("retweet_count", 0),
                "likeCount": tweet.get("favorite_count", 0),
                "quoteCount": tweet.get("quote_count", 0),
                "viewCount": _parse_metric(tweet.get("view_count")),
                "bookmarkCount": tweet.get("bookmark_count"),
                "sourceLabel": "TwStalker",
                "isRetweet": bool(tweet.get("is_retweet")),
                "isQuote": bool(tweet.get("is_quote_status")),
            }
            tweets.append(record)
            if limit and len(tweets) >= limit:
                break
        print(f"Fetched {len(page_tweets)} tweets from page {page}; total collected: {len(tweets)}")
        if limit and len(tweets) >= limit:
            break
        cursor = data.get("cursor") or ""
        if not cursor:
            break
        page += 1
        time.sleep(2)
    return tweets


def compute_features(df: pd.DataFrame) -> pd.DataFrame:
    analyzer = SentimentIntensityAnalyzer()
    feature_rows = []
    for row in df.itertuples():
        text = row.content
        tokens = [t for t in re.split(r"\s+", text) if t]
        sentiment = analyzer.polarity_scores(text)
        emojis = EMOJI_REGEX.findall(text)
        urls = URL_REGEX.findall(text)
        mentions = MENTION_REGEX.findall(text)
        hashtags = HASHTAG_REGEX.findall(text)
        words = [re.sub(r"[^A-Za-z']", "", t) for t in tokens if re.sub(r"[^A-Za-z']", "", t)]
        upper_chars = sum(1 for c in text if c.isupper())
        alpha_chars = sum(1 for c in text if c.isalpha())
        avg_word_len = sum(len(w) for w in words) / len(words) if words else 0.0
        lexical_diversity = len(set(words)) / len(words) if words else 0.0
        question_ratio = text.count("?") / max(len(text), 1)
        exclamation_ratio = text.count("!") / max(len(text), 1)
        feature_rows.append(
            {
                "id": row.id,
                "content": text,
                "char_count": len(text),
                "word_count": len(tokens),
                "avg_word_length": avg_word_len,
                "lexical_diversity": lexical_diversity,
                "uppercase_ratio": (upper_chars / alpha_chars) if alpha_chars else 0.0,
                "has_question": int("?" in text),
                "has_exclamation": int("!" in text),
                "question_ratio": question_ratio,
                "exclamation_ratio": exclamation_ratio,
                "emoji_count": len(emojis),
                "hashtags_count": len(hashtags),
                "mentions_count": len(mentions),
                "urls_count": len(urls),
                "first_person_pronouns": int(bool(FIRST_PERSON_REGEX.search(text))),
                "sentiment_compound": sentiment["compound"],
                "sentiment_positive": sentiment["pos"],
                "sentiment_negative": sentiment["neg"],
                "sentiment_neutral": sentiment["neu"],
                "engagement": row.replyCount + row.retweetCount + row.likeCount + row.quoteCount,
                "reply_count": row.replyCount,
                "retweet_count": row.retweetCount,
                "like_count": row.likeCount,
                "quote_count": row.quoteCount,
                "bookmark_count": row.bookmarkCount,
                "is_retweet": row.isRetweet,
                "is_quote": row.isQuote,
                "view_count": row.viewCount if not (row.viewCount is None or (isinstance(row.viewCount, float) and math.isnan(row.viewCount))) else None,
                "source_label": row.sourceLabel,
                "tweet_url": row.url,
                "tweet_date": row.date,
            }
        )
    features_df = pd.DataFrame(feature_rows)
    features_df["tweet_date"] = pd.to_datetime(features_df["tweet_date"], utc=True)
    features_df["hour_utc"] = features_df["tweet_date"].dt.hour
    features_df["day_of_week"] = features_df["tweet_date"].dt.day_name()
    features_df["is_weekend"] = features_df["day_of_week"].isin(["Saturday", "Sunday"]).astype(int)
    return features_df


def assign_clusters(df: pd.DataFrame, cluster_count: int) -> pd.DataFrame:
    if df.empty:
        df["cluster"] = []
        df["cluster_keywords"] = []
        df["cluster_label"] = []
        return df

    vectorizer = TfidfVectorizer(stop_words="english", max_features=1000)
    tfidf = vectorizer.fit_transform(df["content"])
    kmeans = KMeans(n_clusters=cluster_count, random_state=42, n_init="auto")
    clusters = kmeans.fit_predict(tfidf)
    df = df.copy()
    df["cluster"] = clusters

    terms = vectorizer.get_feature_names_out()
    cluster_keywords: Dict[int, List[str]] = {}
    for idx in range(cluster_count):
        center = kmeans.cluster_centers_[idx]
        top_indices = center.argsort()[-8:][::-1]
        keywords = [terms[i] for i in top_indices]
        cluster_keywords[idx] = keywords

    df["cluster_keywords"] = df["cluster"].map(lambda c: ", ".join(cluster_keywords.get(c, [])))
    df["cluster_label"] = df.apply(
        lambda row: f"Cluster {row.cluster}: {', '.join(cluster_keywords.get(row.cluster, [])[:3])}",
        axis=1,
    )
    return df


def build_cluster_profiles(df: pd.DataFrame) -> List[Dict]:
    profiles = []
    for cluster_id, group in df.groupby("cluster"):
        sentiment_stats = {
            "compound_mean": group["sentiment_compound"].mean(),
            "positive_mean": group["sentiment_positive"].mean(),
            "negative_mean": group["sentiment_negative"].mean(),
            "neutral_mean": group["sentiment_neutral"].mean(),
        }
        temporal = {
            "most_common_day": group["day_of_week"].mode().iat[0] if not group["day_of_week"].mode().empty else None,
            "avg_hour": group["hour_utc"].mean(),
        }
        lexical = {
            "avg_lexical_diversity": group["lexical_diversity"].mean(),
            "avg_word_count": group["word_count"].mean(),
            "avg_hashtags": group["hashtags_count"].mean(),
            "avg_mentions": group["mentions_count"].mean(),
        }
        engagement = {
            "median_engagement": group["engagement"].median(),
            "mean_engagement": group["engagement"].mean(),
        }
        keywords = Counter(
            term.strip()
            for kw in group["cluster_keywords"].dropna().tolist()
            for term in kw.split(",")
            if term.strip()
        )
        profiles.append(
            {
                "cluster": int(cluster_id),
                "size": int(len(group)),
                "keywords": [term for term, _ in keywords.most_common(10)],
                "sentiment": {k: round(v, 4) for k, v in sentiment_stats.items()},
                "temporal": {"most_common_day": temporal["most_common_day"], "avg_hour": round(temporal["avg_hour"], 2)},
                "lexical": {k: round(v, 4) for k, v in lexical.items()},
                "engagement": {k: round(v, 2) for k, v in engagement.items()},
            }
        )
    return profiles


def save_outputs(df: pd.DataFrame, profiles: List[Dict], output_dir: Path) -> None:
    output_dir.mkdir(parents=True, exist_ok=True)
    feature_path = output_dir / "pranjal_tweets_features.csv"
    json_path = output_dir / "pranjal_tweets_records.json"
    profiles_path = output_dir / "pranjal_cluster_profiles.json"

    df.to_csv(feature_path, index=False)
    json_ready_df = df.copy()
    if "tweet_date" in json_ready_df.columns:
        json_ready_df["tweet_date"] = json_ready_df["tweet_date"].dt.strftime("%Y-%m-%dT%H:%M:%S%z")
    with json_path.open("w", encoding="utf-8") as f:
        records = json_ready_df.to_dict(orient="records")
        json.dump(records, f, ensure_ascii=False, indent=2)
    with profiles_path.open("w", encoding="utf-8") as f:
        json.dump(profiles, f, ensure_ascii=False, indent=2)



def main() -> None:
    parser = argparse.ArgumentParser(description="Build persona dataset from Twitter user timeline.")
    parser.add_argument("--username", default="PranjalVaswani", help="Twitter username without @")
    parser.add_argument("--limit", type=int, default=180, help="Maximum number of tweets to scrape")
    parser.add_argument("--clusters", type=int, default=5, help="Number of clusters to fit")
    parser.add_argument(
        "--output-dir",
        type=Path,
        default=Path("data/personality_dataset"),
        help="Directory to store dataset artifacts",
    )
    args = parser.parse_args()

    print(f"Scraping up to {args.limit} tweets from @{args.username}...")
    tweets = scrape_tweets(args.username, args.limit)
    if not tweets:
        raise RuntimeError("No tweets were retrieved; check the username or increase the limit.")

    print(f"Retrieved {len(tweets)} tweets. Computing features...")
    base_df = pd.DataFrame(tweets)
    features_df = compute_features(base_df)

    print("Assigning clusters and persona labels...")
    clustered_df = assign_clusters(features_df, args.clusters)
    profiles = build_cluster_profiles(clustered_df)

    print(f"Saving dataset to {args.output_dir} ...")
    save_outputs(clustered_df, profiles, args.output_dir)
    print("Done.")


if __name__ == "__main__":
    main()
