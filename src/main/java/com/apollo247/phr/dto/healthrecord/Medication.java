package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Medication implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private String medicineName;
	private String doctorName;
	private String source;
	private String medicalCondition;
	private long startDate;
	private long endDate;
	private String strength;
	private String notes;
	private boolean morning;
	private boolean evening;
	private boolean noon;
	private boolean stillActive;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;
    private String userName;
    private String uhid;
    private String newUhid;
    private String mobileNumber;
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
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	
	public long getStartDate() {
		return startDate;
	}
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}
	
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}

	public boolean isMorning() {
		return morning;
	}
	public void setMorning(boolean morning) {
		this.morning = morning;
	}
	public boolean isEvening() {
		return evening;
	}
	public void setEvening(boolean evening) {
		this.evening = evening;
	}
	public boolean isNoon() {
		return noon;
	}
	public void setNoon(boolean noon) {
		this.noon = noon;
	}
	public boolean isStillActive() {
		return stillActive;
	}
	public void setStillActive(boolean stillActive) {
		this.stillActive = stillActive;
	}
	public long getEndDate() {
		return endDate;
	}
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
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
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	
}