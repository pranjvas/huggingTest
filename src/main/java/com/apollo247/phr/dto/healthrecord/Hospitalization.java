package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.pojo.MongoFile;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hospitalization implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private long dateOfHospitalization;
	private String hospitalName;
	private String doctorName;
	private String reasonForAdmission;
	private String diagnosisNotes;
	private long dateOfDischarge;
	private String dischargeSummary;
	private String doctorInstruction;
	private long dateOfNextVisit;
	private List<Attachment> hospitalizationFiles = new ArrayList<>();
	private List<File> fileAttachedList = new ArrayList<>();
	private String source;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;
    private String option = "";
    private String uhid;
    private String newUhid;
    private String userName;
    private String mobileNumber;
    private long sortByDate;
	private String hospitalizationFileName;
	
	
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
	public long getDateOfHospitalization() {
		return dateOfHospitalization;
	}
	public void setDateOfHospitalization(long dateOfHospitalization) {
		this.dateOfHospitalization = dateOfHospitalization;
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
	public long getDateOfDischarge() {
		return dateOfDischarge;
	}
	public void setDateOfDischarge(long dateOfDischarge) {
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
	public long getDateOfNextVisit() {
		return dateOfNextVisit;
	}
	public void setDateOfNextVisit(long dateOfNextVisit) {
		this.dateOfNextVisit = dateOfNextVisit;
	}	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<Attachment> getHospitalizationFiles() {
		return hospitalizationFiles;
	}
	public void setHospitalizationFiles(List<Attachment> hospitalizationFiles) {
		this.hospitalizationFiles = hospitalizationFiles;
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
	public List<File> getFileAttachedList() {
		return fileAttachedList;
	}
	public void setFileAttachedList(List<File> fileAttachedList) {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Hospitalization(MongoFile dbFile, String authToken){
		List<Attachment> attachmentList = MongoFile.toAttachment(dbFile);
		this.setHospitalizationFiles(attachmentList);
		this.setAuthToken(authToken);
		this.setCreatedDateTime(dbFile.getCreateddate().getTime());
		this.setDateOfHospitalization(dbFile.getCreateddate().getTime());
		this.setDateOfDischarge(dbFile.getCreateddate().getTime());
		this.setOption("FROMCLINICALDOCS");
		this.getFileAttachedList().add(new File(dbFile));
		this.setSiteDisplayName("self");
		this.setSource(dbFile.getSource());
	}
	public Hospitalization(){
		// default constructor
	}
	
	public String getHospitalizationFileName() {
		return this.hospitalizationFileName;
	}
	public void setHospitalizationFileName(String hospitalizationFileName) {
		this.hospitalizationFileName = hospitalizationFileName;
	}

}

