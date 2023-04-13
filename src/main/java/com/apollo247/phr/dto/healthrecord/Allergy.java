package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Allergy implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private String allergyName;
	private String severity;
	private long startDate;
	private long endDate;
	private boolean havingNow;
	private String reactionToAllergy;
	private String doctorTreated;
	private String notes;
	private List<Attachment> attachmentList;
	private List<ClinicalDocuments> fileAttachedList;
	private String source;
	private long createdDateTime;
	private long updatedDateTime;
	private String siteDisplayName;
	private String uhid;
	private String newUhid;
	private String userName;
	private String mobileNumber;
	private long sortByDate;
	
	
	public long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(long sortByDate) {
		this.sortByDate = sortByDate;
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
	public String getAllergyName() {
		return allergyName;
	}
	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}	
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public long getStartDate() {
		return startDate;
	}
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}
	public long getEndDate() {
		return endDate;
	}
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}
	public boolean isHavingNow() {
		return havingNow;
	}
	public void setHavingNow(boolean havingNow) {
		this.havingNow = havingNow;
	}
	public String getReactionToAllergy() {
		return reactionToAllergy;
	}
	public void setReactionToAllergy(String reactionToAllergy) {
		this.reactionToAllergy = reactionToAllergy;
	}
	public String getDoctorTreated() {
		return doctorTreated;
	}
	public void setDoctorTreated(String doctorTreated) {
		this.doctorTreated = doctorTreated;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
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
	public List<ClinicalDocuments> getFileAttachedList() {
		return fileAttachedList;
	}
	public void setFileAttachedList(List<ClinicalDocuments> fileAttachedList) {
		this.fileAttachedList = fileAttachedList;
	}
	public String getUhid() {
		return uhid;
	}
	public void setUhid(String uhid) {
		this.uhid = uhid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getNewUhid() {
		return newUhid;
	}
	public void setNewUhid(String newUhid) {
		this.newUhid = newUhid;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	

}