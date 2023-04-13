package src.main.java.com.apollo247.phr.dto.dbo;


import com.slh.uno.dbo.*;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MongoPrescription extends DTO {
    public ObjectId id;
    public String prescriptionName;
    public String hospitalName;
    public String source;
    public String consultId;
    public String tag;
    public Date dateOfPrescription;
    public Date startDate;
    public Date endDate;
    public Date createdDateTime;
    public String prescribedBy;
    public String notes;
    public String speciality;
    public String appointmentDisplayId;
    public String hospital_name;
    public String hospitalId;
    public String address;
    public String city;
    public String pincode;
    public String patientLocation;
    public String patientPincode;
    public Date updatedDateTime;
    public String prescriptionOrigin;
    public List<String> instructions = new ArrayList<>();
    public List<String> diagnosis = new ArrayList<>();
    public List<String> diagnosticPrescription = new ArrayList<>();
    public List<MongoPrescriptionDetail> prescriptionDetails = new ArrayList<>();
    public List<MongoAttachment> prescriptionFiles = new ArrayList<>();
    public List<MongoMedicinePrescription> medicinePrescriptions = new ArrayList<>();
    public List<CustomDBRef> fileAttachments = new ArrayList<>();
    private String uhid;
    private String mobileNumber;
    private String firstName;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPrescriptionName() {
        if(prescriptionName!=null&&!prescriptionName.equals(""))
            return prescriptionName;
        else if(prescribedBy!=null&&!prescribedBy.equals("")){
            return prescribedBy;
        }
        return "Prescription";
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getConsultId() {
        return consultId;
    }

    public void setConsultId(String consultId) {
        this.consultId = consultId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getDateOfPrescription() {
        return dateOfPrescription;
    }

    public void setDateOfPrescription(Date dateOfPrescription) {
        this.dateOfPrescription = dateOfPrescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        if(startDate.getTime()>(new Date(0).getTime()))
            this.startDate = startDate;
        else
            this.startDate = null;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        if(endDate.getTime()>(new Date(0).getTime()))
            this.endDate = endDate;
        else
            this.endDate = null;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAppointmentDisplayId() {
        return appointmentDisplayId;
    }

    public void setAppointmentDisplayId(String appointmentDisplayId) {
        this.appointmentDisplayId = appointmentDisplayId;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
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

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getPrescriptionOrigin() {
        return prescriptionOrigin;
    }

    public void setPrescriptionOrigin(String prescriptionOrigin) {
        this.prescriptionOrigin = prescriptionOrigin;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        if(instructions!=null && instructions.size()>0){
            this.instructions = instructions;
        }else {
            this.instructions = null;
        }

    }

    public List<String> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<String> diagnosis) {
        if(diagnosis!=null && diagnosis.size()>0)
            this.diagnosis = diagnosis;
        else
            this.diagnosis = null;
    }

    public List<String> getDiagnosticPrescription() {
        return diagnosticPrescription;
    }

    public void setDiagnosticPrescription(List<String> diagnosticPrescription) {
        if (diagnosticPrescription!=null && diagnosticPrescription.size()>0) {
            this.diagnosticPrescription = diagnosticPrescription;
        }else{
            this.diagnosticPrescription = null;
        }

    }

    public List<MongoPrescriptionDetail> getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(List<MongoPrescriptionDetail> prescriptionDetails) {
        if(prescriptionDetails!=null && prescriptionDetails.size()>0)
            this.prescriptionDetails = prescriptionDetails;
        else
            this.prescriptionDetails = null;
    }

    public List<MongoAttachment> getPrescriptionFiles() {
        return prescriptionFiles;
    }

    public void setPrescriptionFiles(List<MongoAttachment> prescriptionFiles) {
        if(prescriptionFiles!=null && prescriptionFiles.size()>0)
            this.prescriptionFiles = prescriptionFiles;
        else
            this.prescriptionDetails = null;
    }

    public List<MongoMedicinePrescription> getMedicinePrescriptions() {
        return medicinePrescriptions;
    }

    public void setMedicinePrescriptions(List<MongoMedicinePrescription> medicinePrescriptions) {
        if(medicinePrescriptions!=null && medicinePrescriptions.size()>0)
            this.medicinePrescriptions = medicinePrescriptions;
        else
            this.medicinePrescriptions = null;
    }

    public List<CustomDBRef> getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(List<CustomDBRef> fileAttachments) {
        if(fileAttachments!=null && fileAttachments.size()>0)
            this.fileAttachments = fileAttachments;
        else
            this.fileAttachments = null;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<MongoAttachment> fetchFiles(){
        return prescriptionFiles;
    }

    public void assignFiles(List<MongoAttachment> files){
        this.prescriptionFiles = files;
    }
}

