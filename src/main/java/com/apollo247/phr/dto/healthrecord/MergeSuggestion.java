package src.main.java.com.apollo247.phr.dto.healthrecord;

public class MergeSuggestion {

    private String title;
    private String msg;
    private Boolean shouldMerge = false;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getShouldMerge() {
        return shouldMerge;
    }

    public void setShouldMerge(Boolean shouldMerge) {
        this.shouldMerge = shouldMerge;
    }
}
