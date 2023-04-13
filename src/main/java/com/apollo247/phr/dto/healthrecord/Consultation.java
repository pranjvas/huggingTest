package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.pojo.MongoFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Consultation implements UIPojo {

	private String id;
	private String documentId;
	private String appointmentid;
	private String specialityid;
	private String speciality;
	private String doctorid;
	private String doctorid_247;
	private String uhid;
	private Date consultedtime;
	private String appointmenttype;
	private String modeofappointment;
	private String doctor_name;
	private String locationid;
	private String location_name;

	private String documentType;
	private String mobileNumber;
	private String department;
	private String encounterId;
	private String option = "";
	private String userName;
	private String newUhid;
	private String visitId;
	
	private List<Attachment> consultationFiles;
	private List<File> fileAttachedList = new ArrayList<>();
	private long sortByDate;
	
	
	public long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(long sortByDate) {
		this.sortByDate = sortByDate;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(String appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getSpecialityid() {
		return specialityid;
	}

	public void setSpecialityid(String specialityid) {
		this.specialityid = specialityid;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getUhid() {
		return uhid;
	}

	public void setUhid(String uhid) {
		this.uhid = uhid;
	}

	public Date getConsultedtime() {
		return consultedtime;
	}

	public void setConsultedtime(Date consultedtime) {
		this.consultedtime = consultedtime;
	}

	public String getAppointmenttype() {
		return appointmenttype;
	}

	public void setAppointmenttype(String appointmenttype) {
		this.appointmenttype = appointmenttype;
	}

	public String getModeofappointment() {
		return modeofappointment;
	}

	public void setModeofappointment(String modeofappointment) {
		this.modeofappointment = modeofappointment;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getLocationid() {
		return locationid;
	}

	public void setLocationid(String locationid) {
		this.locationid = locationid;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getDoctorid_247() {
		return doctorid_247;
	}

	public void setDoctorid_247(String doctorid_247) {
		this.doctorid_247 = doctorid_247;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(String encounterId) {
		this.encounterId = encounterId;
	}

	public List<Attachment> getConsultationFiles() {
		return consultationFiles;
	}

	public void setConsultationFiles(List<Attachment> consultationFiles) {
		this.consultationFiles = consultationFiles;
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
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public Consultation(MongoFile dbFile , String authToken){
		List<Attachment> attachmentList = MongoFile.toAttachment(dbFile);
		this.setConsultationFiles(attachmentList);
		this.setOption("FROMCLINICALDOCS");
		this.setConsultedtime(dbFile.getCreateddate());
		this.getFileAttachedList().add(new File(dbFile));
	}
	public Consultation(){
		//default constructor
	}
	
	
}