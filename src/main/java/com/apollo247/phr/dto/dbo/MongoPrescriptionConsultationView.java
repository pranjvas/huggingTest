package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;

public class MongoPrescriptionConsultationView extends DTO {

    private String hashCode;
    private String mobileNumber;
    private Long lastUpdatedDate;
    private List<MongoConsultationRecord> userRecords;

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Long lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public List<MongoConsultationRecord> getUserRecords() {
        return userRecords;
    }

    public void setUserRecords(List<MongoConsultationRecord> userRecords) {
        this.userRecords = userRecords;
    }
}
