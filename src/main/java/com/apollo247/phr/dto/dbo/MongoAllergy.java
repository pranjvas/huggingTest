package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MongoAllergy extends DTO {

    private ObjectId id;
    private String allergyName; // This is referenced from AllergType
    private Boolean havingNow;
    private Date startDate;
    private Date endDate;
    private Date createdDateTime;
    private Date updatedDateTime;
    private String severity; // This should be chosen using UI
    private String reactionToAllergy;
    private String notes;
    private String source;
    private String mobileNumber;
    private String uhid;
    private String doctorTreated; // This doctor name is got from the Doctor collection
    private List<MongoAttachment> attachmentList = new ArrayList<>();
    private List<CustomDBRef> fileAttachments = new ArrayList<>();
    private String firstName;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public Boolean getHavingNow() {
        return havingNow;
    }

    public void setHavingNow(Boolean havingNow) {
        this.havingNow = havingNow;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getReactionToAllergy() {
        return reactionToAllergy;
    }

    public void setReactionToAllergy(String reactionToAllergy) {
        this.reactionToAllergy = reactionToAllergy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public String getDoctorTreated() {
        return doctorTreated;
    }

    public void setDoctorTreated(String doctorTreated) {
        this.doctorTreated = doctorTreated;
    }

    public List<MongoAttachment> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<MongoAttachment> attachmentList) {
        this.attachmentList = attachmentList;
    }

    public List<CustomDBRef> getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(List<CustomDBRef> fileAttachments) {
        this.fileAttachments = fileAttachments;
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
