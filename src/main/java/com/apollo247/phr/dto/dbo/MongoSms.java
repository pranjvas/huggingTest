package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.Date;

public class MongoSms extends DTO{
    private ObjectId id;
    private CustomDBRef dbUser;
    private String mobileNumber;
    private String uhid;
    private String siteKey;
    private String smsPurpose;
    private String accessCode;
    private String accessCodeStatus;
    private Date sendAt;
    private Date accessCodeStatusUpdatedDate;
    private String statusUpdatedBy;
    private String downloadId;
    private String sendResult;
    private String deliveryResult;
    private String patientName;
    private String entityName;
    private boolean isWhatsapp;
    private String whatsAppSendResult;


    public boolean isWhatsapp() {
        return isWhatsapp;
    }
    public void setWhatsapp(boolean whatsapp) {
        isWhatsapp = whatsapp;
    }
    public String getWhatsAppSendResult() {
        return whatsAppSendResult;
    }
    public void setWhatsAppSendResult(String whatsAppSendResult) {
        this.whatsAppSendResult = whatsAppSendResult;
    }
    public String getSendResult() {
        return sendResult;
    }
    public void setSendResult(String sendResult) {
        this.sendResult = sendResult;
    }
    public String getDeliveryResult() {
        return deliveryResult;
    }
    public void setDeliveryResult(String deliveryResult) {
        this.deliveryResult = deliveryResult;
    }
    public String getStatusUpdatedBy() {
        return statusUpdatedBy;
    }
    public void setStatusUpdatedBy(String statusUpdatedBy) {
        this.statusUpdatedBy = statusUpdatedBy;
    }
    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public CustomDBRef getDbUser() {
        return dbUser;
    }
    public void setDbUser(CustomDBRef dbUser) {
        this.dbUser = dbUser;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getUhid() {
        return uhid;
    }
    public void setUhid(String uhid) {
        this.uhid = uhid;
    }
    public String getAccessCode() {
        return accessCode;
    }
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
    public String getAccessCodeStatus() {
        return accessCodeStatus;
    }
    public void setAccessCodeStatus(String accessCodeStatus) {
        this.accessCodeStatus = accessCodeStatus;
    }

    public Date getSendAt() {
        return sendAt;
    }
    public void setSendAt(Date sendAt) {
        this.sendAt = sendAt;
    }
    public Date getAccessCodeStatusUpdatedDate() {
        return accessCodeStatusUpdatedDate;
    }
    public void setAccessCodeStatusUpdatedDate(Date accessCodeStatusUpdatedDate) {
        this.accessCodeStatusUpdatedDate = accessCodeStatusUpdatedDate;
    }
    public String getSiteKey() {
        return siteKey;
    }
    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }
    public String getSmsPurpose() {
        return smsPurpose;
    }
    public void setSmsPurpose(String smsPurpose) {
        this.smsPurpose = smsPurpose;
    }
    public String getEntityName() {
        return entityName;
    }
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    public String getDownloadId() {
        return downloadId;
    }
    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
