package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultPrescription implements UIPojo {

	private String authToken;
	private String id;
	private String consultId;
	private String prescriptionId;
	private String visitId;
	private String documentId;
	private String prescriptionName;
	private long date;
	private String documentType;
	private String displaySource;
	private String thumbnailType;
	private String consultationType;
	private List<String> combinedConsultationType;
	private String encounterVisitId;
	private String blobName;
	private String userName;
	private String uhid;
	private String notes;
	private DoctorInfo doctorInfo;
	private boolean isClinicalDocument;
	private List<String> otherInstructions = new ArrayList<>();
	private List<String> diagnosis = new ArrayList<>();
	private List<String> diagnosticsPrescribed = new ArrayList<>();
	private List<MedicinePrescription> medicinesPrescribed = new ArrayList<>();
	private List<Symptoms> symptoms = new ArrayList<>();
	private List<Attachment> prescriptionFiles = new ArrayList<>();
	private String category;
	private boolean isShowOrderTestsAndMeds;
	private long updatedDateTime;
	private long sortByDate;
	
	
	public long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(long sortByDate) {
		this.sortByDate = sortByDate;
	}
	public long getUpdatedDateTime(){
		return this.updatedDateTime;
	}
	public void setUpdatedDateTime(long updatedDateTime){
		this.updatedDateTime=updatedDateTime;
	}
	public boolean getIsShowOrderTestsAndMeds() {
		return isShowOrderTestsAndMeds;
	}
	public void setIsShowOrderTestsAndMeds(boolean isShowOrderTestsAndMeds) {
		this.isShowOrderTestsAndMeds = isShowOrderTestsAndMeds;
	}
	
	public List<String> getCombinedConsultationType() {
		return combinedConsultationType;
	}
	public void setCombinedConsultationType(List<String> combinedConsultationType) {
		this.combinedConsultationType = combinedConsultationType;
	}
	public String getEncounterVisitId() {
		return encounterVisitId;
	}
	public void setEncounterVisitId(String encounterVisitId) {
		this.encounterVisitId = encounterVisitId;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConsultId() {
		return consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}
	public String getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getPrescriptionName() {
		return prescriptionName;
	}
	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getDisplaySource() {
		return displaySource;
	}
	public void setDisplaySource(String displaySource) {
		this.displaySource = displaySource;
	}
	public String getThumbnailType() {
		return thumbnailType;
	}
	public void setThumbnailType(String thumbnailType) {
		this.thumbnailType = thumbnailType;
	}
	public String getConsultationType() {
		return consultationType;
	}
	public void setConsultationType(String consultationType) {
		this.consultationType = consultationType;
	}
	public String getBlobName() {
		return blobName;
	}
	public void setBlobName(String blobName) {
		this.blobName = blobName;
	}
	public DoctorInfo getDoctorInfo() {
		return doctorInfo;
	}
	public void setDoctorInfo(DoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}
	public boolean isClinicalDocument() {
		return isClinicalDocument;
	}
	public void setClinicalDocument(boolean isClinicalDocument) {
		this.isClinicalDocument = isClinicalDocument;
	}
	public List<String> getOtherInstructions() {
		return otherInstructions;
	}
	public void setOtherInstructions(List<String> otherInstructions) {
		this.otherInstructions = otherInstructions;
	}
	public List<String> getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(List<String> diagnosis) {
		this.diagnosis = diagnosis;
	}
	public List<String> getDiagnosticsPrescribed() {
		return diagnosticsPrescribed;
	}
	public void setDiagnosticsPrescribed(List<String> diagnosticsPrescribed) {
		this.diagnosticsPrescribed = diagnosticsPrescribed;
	}
	public List<MedicinePrescription> getMedicinesPrescribed() {
		return medicinesPrescribed;
	}
	public void setMedicinesPrescribed(List<MedicinePrescription> medicinesPrescribed) {
		this.medicinesPrescribed = medicinesPrescribed;
	}
	public List<Symptoms> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}
	public List<Attachment> getPrescriptionFiles() {
		return prescriptionFiles;
	}
	public void setPrescriptionFiles(List<Attachment> prescriptionFiles) {
		this.prescriptionFiles = prescriptionFiles;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
}
