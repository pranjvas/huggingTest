package src.main.java.com.apollo247.phr.dto.dbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MongoLabTestRecord {
    private static final Logger log = LoggerFactory.getLogger(MongoLabTestRecord.class);

    private String documentId;
    private Long testDate;
    private String referredBy;
    private String source;
    private String mobileNumber;
    private String uhid;
    private List<String> apolloSourceFilters;
    private List<String> selfUploadedSourceFilter;
    private String sourceType;
    private List<MongoTestView> tests = new ArrayList<>();
    private Boolean isEditable = true;
    private String downloadUrl;
    private Boolean isDigitised = false;
    private Boolean isClinicalDocument = false;
    private Boolean isPending = false;
    private String documentName;
    private String labTestName;
    private String additionalNotes;

    //document name
    //lab test name
    //additional notes

    public String getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public List<String> getApolloSourceFilters() {
        return this.apolloSourceFilters;
    }

    public void setApolloSourceFilters(List<String> apolloSourceFilters) {
        this.apolloSourceFilters = apolloSourceFilters;
    }

    public List<String> getSelfUploadedSourceFilter() {
        return this.selfUploadedSourceFilter;
    }

    public void setSelfUploadedSourceFilter(List<String> selfUploadedSourceFilter) {
        this.selfUploadedSourceFilter = selfUploadedSourceFilter;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Long getTestDate() {
        return testDate;
    }

    public void setTestDate(Long testDate) {
        this.testDate = testDate;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public List<MongoTestView> getTests() {
        return tests;
    }

    public void setTests(List<MongoTestView> tests) {
        this.tests = tests;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean editable) {
        isEditable = editable;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Boolean getIsDigitised() {
        return isDigitised;
    }

    public void setIsDigitised(Boolean digitised) {
        isDigitised = digitised;
    }

    public Boolean getIsClinicalDocument() {
        return isClinicalDocument;
    }

    public void setIsClinicalDocument(Boolean clinicalDocument) {
        isClinicalDocument = clinicalDocument;
    }

    public Boolean getIsPending() {
        return isPending;
    }

    public void setIsPending(Boolean pending) {
        isPending = pending;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getLabTestName() {
        return labTestName;
    }

    public void setLabTestName(String labTestName) {
        this.labTestName = labTestName;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }
}
