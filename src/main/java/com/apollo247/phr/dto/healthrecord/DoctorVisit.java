package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoctorVisit implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String doctorName;
	private long dateOfVisit;
	private String medicalCondition;
	private String restriction;
	private String notes;
	private String prescriptionNotes;
	private String source;
	private String patientComplaints;	
	private String observations;
	private List<Attachment> notesAttachementList;
	private List<Attachment> prespAttachementList;
	private List<ClinicalDocuments> notesFileList;
	private List<ClinicalDocuments> prespFileList;

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
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(long dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getRestriction() {
		return restriction;
	}
	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getPrescriptionNotes() {
		return prescriptionNotes;
	}
	public void setPrescriptionNotes(String prescriptionNotes) {
		this.prescriptionNotes = prescriptionNotes;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPatientComplaints() {
		return patientComplaints;
	}
	public void setPatientComplaints(String patientComplaints) {
		this.patientComplaints = patientComplaints;
	}	
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public List<Attachment> getNotesAttachementList() {
		return notesAttachementList;
	}
	public void setNotesAttachementList(List<Attachment> notesAttachementList) {
		this.notesAttachementList = notesAttachementList;
	}
	public List<Attachment> getPrespAttachementList() {
		return prespAttachementList;
	}
	public void setPrespAttachementList(List<Attachment> prespAttachementList) {
		this.prespAttachementList = prespAttachementList;
	}
	public List<ClinicalDocuments> getNotesFileList() {
		return notesFileList;
	}
	public void setNotesFileList(List<ClinicalDocuments> notesFileList) {
		this.notesFileList = notesFileList;
	}
	public List<ClinicalDocuments> getPrespFileList() {
		return prespFileList;
	}
	public void setPrespFileList(List<ClinicalDocuments> prespFileList) {
		this.prespFileList = prespFileList;
	}
	
}
