package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoHospitalization extends DTO  {
	private String authToken;
	private String userId;
	public ObjectId id;
	private Date dateOfHospitilization;
	private String hospitalName;
	private String doctorName;
	private String reasonForAdmission;
	private String diagnosisNotes;
	private Date dateOfDischarge;
	private String dischargeSummary;
	private String doctorInstruction;
	private Date dateOfNextVisit; 
    public List<MongoAttachment> hospitalizationFiles = new ArrayList<>();
	private List<CustomDBRef> fileAttachedList = new ArrayList<>();
	private String source;
	private Date createdDateTime;
	private Date updatedDateTime;
    private String siteDisplayName;
    private String option = "";
    private String uhid;
    private String newUhid;
    private String mobileNumber;
	private String firstName;
	private String documentName;
	
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
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
	public Date getDateOfHospitilization() {
		return dateOfHospitilization;
	}
	public void setDateOfHospitilization(Date dateOfHospitilization) {
		this.dateOfHospitilization = dateOfHospitilization;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getReasonForAdmission() {
		return reasonForAdmission;
	}
	public void setReasonForAdmission(String reasonForAdmission) {
		this.reasonForAdmission = reasonForAdmission;
	}
	public String getDiagnosisNotes() {
		return diagnosisNotes;
	}
	public void setDiagnosisNotes(String diagnosisNotes) {
		this.diagnosisNotes = diagnosisNotes;
	}
	public Date getDateOfDischarge() {
		return dateOfDischarge;
	}
	public void setDateOfDischarge(Date dateOfDischarge) {
		this.dateOfDischarge = dateOfDischarge;
	}
	public String getDischargeSummary() {
		return dischargeSummary;
	}
	public void setDischargeSummary(String dischargeSummary) {
		this.dischargeSummary = dischargeSummary;
	}
	public String getDoctorInstruction() {
		return doctorInstruction;
	}
	public void setDoctorInstruction(String doctorInstruction) {
		this.doctorInstruction = doctorInstruction;
	}
	public Date getDateOfNextVisit() {
		return dateOfNextVisit;
	}
	public void setDateOfNextVisit(Date dateOfNextVisit) {
		this.dateOfNextVisit = dateOfNextVisit;
	}	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<MongoAttachment> getHospitalizationFiles() {
		return hospitalizationFiles;
	}
	public void setHospitalizationFiles(List<MongoAttachment> hospitalizationFiles) {
		this.hospitalizationFiles = hospitalizationFiles;
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

	public String getSiteDisplayName() {
		return siteDisplayName;
	}

	public void setSiteDisplayName(String siteDisplayName) {
		this.siteDisplayName = siteDisplayName;
	}
	public List<CustomDBRef> getFileAttachedList() {
		return fileAttachedList;
	}
	public void setFileAttachedList(List<CustomDBRef> fileAttachedList) {
		this.fileAttachedList = fileAttachedList;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
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

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String toString(){
		return "UHID : "+uhid+"+ id "+id+" Date of hospitalization " +dateOfHospitilization
		+ " Hospital Name  "+hospitalName + " Get created Date "+ createdDateTime
		;
	}

	public List<MongoAttachment> fetchFiles(){
		return hospitalizationFiles;
	}

	public void assignFiles(List<MongoAttachment> files){
		this.hospitalizationFiles = files;
	}


	public String getDocumentName() {
		return this.documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	
}

