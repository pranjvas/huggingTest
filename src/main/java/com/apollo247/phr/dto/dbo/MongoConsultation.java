package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MongoConsultation extends DTO {

    private ObjectId id;
    
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
    
    private String source;
    
    private String visitId;
    
    private ObjectId prescriptionId;
    
    private String regionCode;
    
    private String siteKey;
    private String firstName;

    private List<MongoAttachment> consultationFiles;

    private List<CustomDBRef> fileAttachments = new ArrayList<>();

    public List<MongoAttachment> fetchFiles(){
        return consultationFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.consultationFiles = files;
    }

    public List<CustomDBRef> getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(List<CustomDBRef> fileAttachments) {
        this.fileAttachments = fileAttachments;
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

    public List<MongoAttachment> getConsultationFiles() {
        return consultationFiles;
    }

    public void setConsultationFiles(List<MongoAttachment> consultationFiles) {
        this.consultationFiles = consultationFiles;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public ObjectId getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(ObjectId prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
