package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.pojo.MongoImmunizationReaction;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Immunization implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private String immunizationName;
	private String registrationId;
	private String beneficiaryId;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;

	private Integer seqNo;
	private String doctorName;
	private String manufacturer;
	private String vaccineName;
	private String batchno;
	private long dateOfImmunization;
	private String potency;
	private String hospitalName;
	private String vaccine_location;
	private long followUpDate;

	private String notes;
	private String source;
	private String userName;
	private String uhid;
	private String newUhid;
	private String mobileNumber;

	private List<MongoImmunizationReaction> reactions;
	private List<Attachment> immunizationFiles;
	private List<ClinicalDocuments> fileAttachedList;
	private long sortByDate;
	
	
	public long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(long sortByDate) {
		this.sortByDate = sortByDate;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImmunizationName() {
		return immunizationName;
	}

	public void setImmunizationName(String immunizationName) {
		this.immunizationName = immunizationName;
	}

	public long getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public long getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(long updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getSiteDisplayName() {
		return siteDisplayName;
	}

	public void setSiteDisplayName(String siteDisplayName) {
		this.siteDisplayName = siteDisplayName;
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String bacthNo) {
		this.batchno = bacthNo;
	}

	public long getDateOfImmunization() {
		return dateOfImmunization;
	}

	public void setDateOfImmunization(long dateAdministered) {
		this.dateOfImmunization = dateAdministered;
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

	public long getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(long followUpDate) {
		this.followUpDate = followUpDate;
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

	public List<MongoImmunizationReaction> getReactions() {
		return reactions;
	}

	public void setReactions(List<MongoImmunizationReaction> reactions) {
		this.reactions = reactions;
	}

	public List<Attachment> getImmunizationFiles() {
		return immunizationFiles;
	}

	public void setImmunizationFiles(List<Attachment> immunizationFiles) {
		this.immunizationFiles = immunizationFiles;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String regstrationId) {
		this.registrationId = regstrationId;
	}

	public String getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public List<ClinicalDocuments> getFileAttachedList() {
		return fileAttachedList;
	}

	public void setFileAttachedList(List<ClinicalDocuments> fileAttachedList) {
		this.fileAttachedList = fileAttachedList;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUhid() {
		return uhid;
	}

	public void setUhid(String uhid) {
		this.uhid = uhid;
	}

	public String getNewUhid() {
		return newUhid;
	}

	public void setNewUhid(String newUhid) {
		this.newUhid = newUhid;
	}
	
}
