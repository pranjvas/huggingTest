# huggingTest

This repository now includes tooling for building a persona-focused dataset from the public timeline of [@PranjalVaswani](https://x.com/PranjalVaswani). The dataset is designed for downstream use in LangChain, LangGraph, or custom local LLM fine-tuning pipelines.

## Contents

- `scripts/build_pranjal_dataset.py` — Scrapes TwStalker for the latest tweets, engineers sentiment & stylistic features, and clusters the posts.
- `data/personality_dataset/` — Materialized artifacts containing features, JSON records, and cluster-level personas.

## Usage

1. Install Python dependencies (a virtual environment is recommended):
   ```bash
   pip install -r requirements.txt
   ```
   or manually install: `pandas scikit-learn vaderSentiment requests beautifulsoup4`.
2. Run the dataset builder (defaults scrape 180 tweets and fits five clusters):
   ```bash
   python scripts/build_pranjal_dataset.py --limit 180 --clusters 5
   ```
   Tune `--limit` and `--clusters` as needed.
3. Inspect the outputs in `data/personality_dataset/`:
   - `pranjal_tweets_features.csv` — Tabular feature matrix with engineered sentiment & engagement columns plus cluster assignments.
   - `pranjal_tweets_records.json` — JSON records ready for LangChain/LangGraph ingestion.
   - `pranjal_cluster_profiles.json` — Cluster summaries capturing sentiment, temporal patterns, and lexical fingerprints.

The script uses the public [TwStalker](https://twstalker.com) service for scraping and applies retry logic to gracefully handle rate limits.
