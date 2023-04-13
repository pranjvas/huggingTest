package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.Date;

public class MongoPrescriptionLead extends DTO {
    
    private ObjectId id;

    public enum ProcessStatus {
        PROCESSED,
        NOTPROCESSED
    }

    private CustomDBRef mongoUser;

    private CustomDBRef mongoPrescription;

    
    private String mobileNumber;

     private String uhid;

     private String hospitalId;

     private ProcessStatus processedStatus;

     private Date createdDate;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public CustomDBRef getMongoUser() {
        return mongoUser;
    }

    public void setMongoUser(CustomDBRef mongoUser) {
        this.mongoUser = mongoUser;
    }

    public CustomDBRef getMongoPrescription() {
        return mongoPrescription;
    }

    public void setMongoPrescription(CustomDBRef mongoPrescription) {
        this.mongoPrescription = mongoPrescription;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public ProcessStatus getProcessedStatus() {
        return processedStatus;
    }

    public void setProcessedStatus(ProcessStatus processedStatus) {
        this.processedStatus = processedStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
}
