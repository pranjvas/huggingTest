package src.main.java.com.apollo247.phr.dto.dbo;

public class RelatedFAQ {
    private String faqQuestion;
    private String faqAnswer;
    private String faqImg;

    public String getFaqQuestion() {
        return faqQuestion;
    }

    public void setFaqQuestion(String faqQuestion) {
        this.faqQuestion = faqQuestion;
    }

    public String getFaqAnswer() {
        return faqAnswer;
    }

    public void setFaqAnswer(String faqAnswer) {
        this.faqAnswer = faqAnswer;
    }

    public String getFaqImg() {
        return faqImg;
    }

    public void setFaqImg(String faqImg) {
        this.faqImg = faqImg;
    }
}
