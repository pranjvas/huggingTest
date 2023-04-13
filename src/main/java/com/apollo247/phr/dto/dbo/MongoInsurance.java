package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoInsurance extends DTO{
    private ObjectId id;
    
    private String insuranceCompany;
     private String policyNumber;
     private double sumInsured;
     private String source;
     private String notes;
     private Date startDate;
     private Date endDate;
     private Boolean isActive;
     private Date createdDateTime;
     private Date updatedDateTime;
     private String mobileNumber;
     private String uhid;
     private String firstName;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    List<MongoAttachment> insuranceFiles = new ArrayList<>();
    private List<CustomDBRef> fileAttachments = new ArrayList<>();

    public List<MongoAttachment> fetchFiles(){
        return insuranceFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.insuranceFiles = files;
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
    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }


    public void setInsuranceFiles(List<MongoAttachment> attachList) {
        this.insuranceFiles = attachList;
    }

    public List<MongoAttachment> getInsuranceFiles() {
        return insuranceFiles;
    }

    public void addInsuranceFile(MongoAttachment attachment) {
        this.insuranceFiles.add(attachment);
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public double getSumInsured() {
        return sumInsured;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreatedDatetime() {
        return createdDateTime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDateTime = createdDatetime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
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
}
