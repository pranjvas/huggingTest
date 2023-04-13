package src.main.java.com.apollo247.phr.dto.dbo;

import com.slh.uno.viewmodel.healthrecord.ConsultPrescription;
import com.slh.uno.viewmodel.healthrecord.DoctorInfo;

import java.util.Date;
import java.util.List;

public class MongoConsultationView {

    private Long date;
    private String sourceImg;
    private String sourceText;
    private String downloadUrl;
    private Boolean showDoctorInfo;
    private String documentId;
    private DoctorInfo doctorInfo;
    private Boolean showTitle;
    private String prescriptionTitle;
    private List<String> symptoms;
    private List<MongoMedicationView> medicines;
    private Boolean isShowMedicineViewCart;
    private List<String> tests;
    private Boolean isShowTestsViewCart;
    private List<ConsultPrescription> oldApiResponseForThisDocument;

    public Long getDate() {
        return date;
    }

    public void setDate(Date date) {
        if(date != null) this.date = date.getTime();
    }

//    public void setDate(Long date) {
//        this.date = date;
//    }

    public String getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(String sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getSourceText() {
        return sourceText;
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Boolean getShowDoctorInfo() {
        return showDoctorInfo;
    }

    public void setShowDoctorInfo(Boolean showDoctorInfo) {
        this.showDoctorInfo = showDoctorInfo;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public DoctorInfo getDoctorInfo() {
        return doctorInfo;
    }

    public void setDoctorInfo(DoctorInfo doctorInfo) {
        this.doctorInfo = doctorInfo;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getPrescriptionTitle() {
        return prescriptionTitle;
    }

    public void setPrescriptionTitle(String prescriptionTitle) {
        this.prescriptionTitle = prescriptionTitle;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public List<MongoMedicationView> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<MongoMedicationView> medicines) {
        this.medicines = medicines;
    }

    public Boolean getShowMedicineViewCart() {
        return isShowMedicineViewCart;
    }

    public void setShowMedicineViewCart(Boolean showMedicineViewCart) {
        isShowMedicineViewCart = showMedicineViewCart;
    }

    public List<String> getTests() {
        return tests;
    }

    public void setTests(List<String> tests) {
        this.tests = tests;
    }

    public Boolean getShowTestsViewCart() {
        return isShowTestsViewCart;
    }

    public void setShowTestsViewCart(Boolean showTestsViewCart) {
        isShowTestsViewCart = showTestsViewCart;
    }

    public List<ConsultPrescription> getOldApiResponseForThisDocument() {
        return oldApiResponseForThisDocument;
    }

    public void setOldApiResponseForThisDocument(List<ConsultPrescription> oldApiResponseForThisDocument) {
        this.oldApiResponseForThisDocument = oldApiResponseForThisDocument;
    }
}
