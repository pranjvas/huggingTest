package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResult implements UIPojo {

    String healthrecordType;
    String title;
    String date;
    String highlight;
    String healthrecordId;
    String healthRecord;

    public String getHealthrecordType() {
        return healthrecordType;
    }

    public void setHealthrecordType(String healthrecordType) {
        this.healthrecordType = healthrecordType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getHealthrecordId() {
        return healthrecordId;
    }

    public void setHealthrecordId(String healthrecordId) {
        this.healthrecordId = healthrecordId;
    }

    public String getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }
}
