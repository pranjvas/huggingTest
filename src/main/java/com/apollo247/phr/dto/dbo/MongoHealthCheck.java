package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoHealthCheck extends DTO{
    private ObjectId id;
    
    private String healthCheckName;
     private Date healthCheckDate;
    //	 private Date appointmentDate;
     private String healthCheckSummary;
     private String clinicName;
     private String source;
     private String healthCheckType;
     private Date followupDate;
     private List<String> keywords;
     private Date createdDateTime;
     private Date updatedDateTime;
    
    private String billNo;
    
    private String locId;
     private String mobileNumber;
     private String uhid;

    private List<MongoAttachment> healthCheckFiles;
    private List<CustomDBRef> fileAttachments = new ArrayList<>();
    public List<MongoAttachment> fetchFiles(){
        return healthCheckFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.healthCheckFiles = files;
    }

    public List<CustomDBRef> getFileAttachments() {
        return fileAttachments;
    }
    public void setFileAttachments(List<CustomDBRef> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }
    public void addFileAttachment(CustomDBRef attachment) {
        this.fileAttachments.add(attachment);
    }
    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public String getHealthCheckName() {
        return healthCheckName;
    }
    public void setHealthCheckName(String healthCheckName) {
        this.healthCheckName = healthCheckName;
    }
    public Date getHealthCheckDate() {
        return healthCheckDate;
    }
    public void setHealthCheckDate(Date healthCheckDate) {
        this.healthCheckDate = healthCheckDate;
    }
    public String getHealthCheckSummary() {
        return healthCheckSummary;
    }
    public void setHealthCheckSummary(String healthCheckSummary) {
        this.healthCheckSummary = healthCheckSummary;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getHealthCheckType() {
        return healthCheckType;
    }
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }
    public Date getFollowupDate() {
        return followupDate;
    }
    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }
    public List<String> getKeywords() {
        return keywords;
    }
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    //	public Date getAppointmentDate() {
//		return appointmentDate;
//	}
//	public void setAppointmentDate(Date appointmentDate) {
//		this.appointmentDate = appointmentDate;
//	}
    public String getClinicName() {
        return clinicName;
    }
    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }
    public Date getCreatedDatetime() {
        return createdDateTime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDateTime = createdDatetime;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
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

    public List<MongoAttachment> getHealthCheckFiles() {
        return this.healthCheckFiles;
    }

    public void setHealthCheckFiles(List<MongoAttachment> healthCheckFiles) {
        this.healthCheckFiles = healthCheckFiles;
    }

}
