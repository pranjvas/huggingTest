package src.main.java.com.apollo247.phr.dto.healthrecord;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.pojo.MongoFile;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Prescription implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private String prescriptionName;
	private long dateOfPrescription;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;
	private long startDate;
	private long endDate;
	private String prescribedBy;
	private String notes;
	private String prescriptionSource;
	private String source;
	private List<PrescriptionDetail> prescriptionDetail = new ArrayList<>();
	private List<Attachment> prescriptionFiles = new ArrayList<>();
	private List<File> fileAttachments = new ArrayList<>();
	private List<String> instructions = new ArrayList<>();
	private List<String> diagnosis = new ArrayList<>();
	private List<String> diagnosticPrescription = new ArrayList<>();
	private String speciality;
	private String hospital_name;
	private String hospitalId;
	private String appointmentDisplayId;
	private String address;
	private String city;
	private String pincode;
	private String patientLocation;
	private String patientPincode;
	private String option = "";
	private String uhid;
	private String userName;
	private String newUhid;
	private String mobileNumber;

	private List<MedicinePrescription> medicinePrescriptions = new ArrayList<>();


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
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrescriptionName() {
		return prescriptionName;
	}
	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}
	public long getDateOfPrescription() {
		return dateOfPrescription;
	}
	public void setDateOfPrescription(long dateOfPrescription) {
		this.dateOfPrescription = dateOfPrescription;
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
	public String getPrescribedBy() {
		return prescribedBy;
	}
	public void setPrescribedBy(String prescribedBy) {
		this.prescribedBy = prescribedBy;
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
	public List<PrescriptionDetail> getPrescriptionDetail() {
		return prescriptionDetail;
	}
	public void setPrescriptionDetail(List<PrescriptionDetail> prescriptionDetail) {
		this.prescriptionDetail = prescriptionDetail;
	}
	public List<Attachment> getprescriptionFiles() {
		return prescriptionFiles;
	}
	public void setprescriptionFiles(List<Attachment> attachmentList) {
		this.prescriptionFiles = attachmentList;
	}
	public String getPrescriptionSource() {
		return prescriptionSource;
	}
	public void setPrescriptionSource(String prescriptionSource) {
		this.prescriptionSource = prescriptionSource;
	}


	public List<String> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}

	public List<String> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<String> diagnosis) {
		this.diagnosis = diagnosis;
	}

	public List<String> getDiagnosticPrescription() {
		return diagnosticPrescription;
	}

	public void setDiagnosticPrescription(List<String> diagnosticPrescription) {
		this.diagnosticPrescription = diagnosticPrescription;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<MedicinePrescription> getMedicinePrescriptions() {
		return medicinePrescriptions;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getAppointmentDisplayId() { return appointmentDisplayId; }

	public void setAppointmentDisplayId(String appointmentDisplayId) { this.appointmentDisplayId = appointmentDisplayId; }

	public void setMedicinePrescriptions(List<MedicinePrescription> medicinePrescriptions) {
		this.medicinePrescriptions = medicinePrescriptions;
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

	public String getPatientLocation() {
		return patientLocation;
	}

	public void setPatientLocation(String patientLocation) {
		this.patientLocation = patientLocation;
	}

	public String getPatientPincode() {
		return patientPincode;
	}

	public void setPatientPincode(String patientPincode) {
		this.patientPincode = patientPincode;
	}
	public List<File> getFileAttachments() {
		return fileAttachments;
	}
	public void setFileAttachments(List<File> fileAttachments) {
		this.fileAttachments = fileAttachments;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Prescription(MongoFile dbFile, String authToken){
		this.setMobileNumber(dbFile.getMobileNumber());
		this.setUhid(dbFile.getUhid());
		this.setPrescriptionSource(dbFile.getSource());
		this.setAuthToken(authToken);
		this.setPrescribedBy(dbFile.getDocumentName());
		this.setPrescriptionName(dbFile.getDocumentName());
		this.setDateOfPrescription(dbFile.getCreateddate().getTime());
		this.setCreatedDateTime(dbFile.getCreateddate().getTime());
		this.setStartDate(System.currentTimeMillis());
		this.setEndDate(System.currentTimeMillis());
		List<Attachment> attachmentList = MongoFile.toAttachment(dbFile);
		this.setprescriptionFiles(attachmentList);
		this.setOption("FROMCLINICALDOCS");
		this.setSource(dbFile.getSource());
		this.getFileAttachments().add(new File(dbFile));
		this.setSiteDisplayName("self");
	}

	public Prescription(){
		// default constructor
	}
	
}