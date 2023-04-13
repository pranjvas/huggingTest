package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoMedicalCondition extends DTO{
    public enum IllnessType {
        Acute,
        Chronic,
        Recurring,
        Intermittent
    }

    private ObjectId id;
    
    private String medicalCondition;
     private Date startDate;
     private Date endDate;
     private String doctorTreated;
     private IllnessType illnessType;
     private String notes;
     private boolean havingNow;
     private String source;
     private Date createdDateTime;
     private Date updatedDateTime;

     private String mobileNumber;
     private String uhid;
     private String firstName;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    List<MongoAttachment> medicationFiles = new ArrayList<>();
    private List<CustomDBRef> fileAttachments = new ArrayList<>();

    public List<MongoAttachment> fetchFiles(){
        return medicationFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.medicationFiles = files;
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

    public boolean isHavingNow() {
        return havingNow;
    }

    public void setHavingNow(boolean havingNow) {
        this.havingNow = havingNow;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setMedicationFiles(List<MongoAttachment> attachList) {
        this.medicationFiles = attachList;
    }

    public List<MongoAttachment> getMedicationFiles() {
        return medicationFiles;
    }

    public void addMedicationFile(MongoAttachment attachment) {
        this.medicationFiles.add(attachment);
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getMedicalCondition() {
        return medicalCondition;
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

    public void setDoctorTreated(String doctorTreated) {
        this.doctorTreated = doctorTreated;
    }

    public String getDoctorTreated() {
        return doctorTreated;
    }

    public void setIllnessType(IllnessType illnessType) {
        this.illnessType = illnessType;
    }

    public IllnessType getIllnessType() {
        return illnessType;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
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
