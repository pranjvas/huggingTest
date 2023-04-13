package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoImmunization extends DTO{
    
    private ObjectId id;
    
    private String immunizationName; // This is referenced from ImmunizationMaster
     private String registrationId;
     private String beneficiaryId;
     private Date createdDateTime;
     private Date updatedDateTime;
     private String orderedByDoctor;
     private String manufacturer;
     private String vaccineName;
     private String batchNo;
     private Date dateOfFirstShot;
     private String potency;
     private String hospitalName;
     private String vaccine_location;
     private Date followUpDate;
     private  String seqNo;

     private String notes;
     private String source;

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

    private List<MongoAttachment> immunizationFiles = new ArrayList<>();

    private List<MongoImmunizationReaction> immunizationReactions = new ArrayList<>();
    private List<CustomDBRef> fileAttachments = new ArrayList<>();

    public List<MongoAttachment> fetchFiles(){
        return immunizationFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.immunizationFiles = files;
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

    public void setImmunizationName(String immunizationName) {
        this.immunizationName = immunizationName;
    }

    public String getImmunizationName() {
        return immunizationName;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getOrderedByDoctor() {
        return orderedByDoctor;
    }

    public void setOrderedByDoctor(String orderedByDoctor) {
        this.orderedByDoctor = orderedByDoctor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String bacthNo) {
        this.batchNo = bacthNo;
    }

    public Date getDateOfFirstShot() {
        return dateOfFirstShot;
    }

    public void setDateOfFirstShot(Date dateOfFirstShot) {
        this.dateOfFirstShot = dateOfFirstShot;
    }

    public String getPotency() {
        return potency;
    }

    public void setPotency(String potency) {
        this.potency = potency;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getVaccine_location() {
        return vaccine_location;
    }

    public void setVaccine_location(String vaccine_location) {
        this.vaccine_location = vaccine_location;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
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

    public List<MongoAttachment> getImmunizationFiles() {
        return immunizationFiles;
    }

    public void setImmunizationFiles(List<MongoAttachment> immunizationFiles) {
        this.immunizationFiles = immunizationFiles;
    }

    public List<MongoImmunizationReaction> getImmunizationReactions() {
        return immunizationReactions;
    }

    public void setImmunizationReactions(List<MongoImmunizationReaction> immunizationReactions) {
        this.immunizationReactions = immunizationReactions;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getUhid() {
        return this.uhid;
    }


}
