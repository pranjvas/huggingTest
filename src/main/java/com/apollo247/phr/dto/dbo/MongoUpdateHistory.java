package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.Date;


public class MongoUpdateHistory extends DTO {

    public enum HealthRecordType {
        ALLERGY,
        PRESCRIPTION,
        LABTEST,
        INSURANCE,
        HEALTHCHECK,
        HOSPITALIZATION,
        BILL,
        MEDICALCONDITION,
        MEDICATION,
        FAMILYHISTORY,
        IMMUNIZATION,
        CLINICALDOCUMENTS,
        CONSULTATION
    }

    private ObjectId id;
    private HealthRecordType healthRecordType;
    private Date updatedDateTime;
    private String loginType;
    private ObjectId updatedRecord;
    private CustomDBRef dbUser;
    private String uhid;
    private String firstName;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public HealthRecordType getHealthRecordType() {
        return healthRecordType;
    }

    public void setHealthRecordType(HealthRecordType healthRecordType) {
        this.healthRecordType = healthRecordType;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public ObjectId getUpdatedRecord() {
        return updatedRecord;
    }

    public void setUpdatedRecord(ObjectId updatedRecord) {
        this.updatedRecord = updatedRecord;
    }

    public CustomDBRef getDbUser() {
        return dbUser;
    }

    public void setDbUser(CustomDBRef dbUser) {
        this.dbUser = dbUser;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
