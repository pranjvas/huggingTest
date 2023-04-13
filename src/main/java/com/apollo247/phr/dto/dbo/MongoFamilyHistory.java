package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoFamilyHistory extends DTO{
    private ObjectId id;
    
    private Date createdDateTime;
     private Date updatedDateTime;
     private Date recordDate;
     private String diseaseName ;
     private String source ;
     private String familyMember;
     private String notes;
     private int age;

     private String mobileNumber;
     private String uhid;
     private String firstName;

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

    List<MongoAttachment> familyHistoryFiles = new ArrayList<>();
    private List<CustomDBRef> fileAttachments = new ArrayList<>();

    public List<MongoAttachment> fetchFiles(){
        return familyHistoryFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.familyHistoryFiles = files;
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


    public Date getCreatedDatetime() {
        return createdDateTime;
    }

    public void setCreatedDatetime(Date createdAt) {
        this.createdDateTime = createdAt;
    }

    public String getDiseaseName() {
        return diseaseName;
    }
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(String familyMember) {
        this.familyMember = familyMember;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MongoAttachment> getFamilyHistoryFiles() {
        return familyHistoryFiles;
    }

    public void setFamilyHistoryFiles(List<MongoAttachment> familyHistoryFiles) {
        this.familyHistoryFiles = familyHistoryFiles;
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
