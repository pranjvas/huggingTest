package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class MongoLabTestView extends DTO {

    private ObjectId id;
    private String hashCode;
    private String uhid;
    private String mobileNumber;
    private Boolean isHashValid;
    private List<MongoUserLabRecord> userRecords = new ArrayList<>();
    private Long lastUpdatedDate;

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public Boolean getHashValid() {
        return isHashValid;
    }

    public void setHashValid(Boolean hashValid) {
        isHashValid = hashValid;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Long lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public List<MongoUserLabRecord> getUserRecords() {
        return userRecords;
    }

    public void setUserRecords(List<MongoUserLabRecord> userRecords) {
        this.userRecords = userRecords;
    }
}
