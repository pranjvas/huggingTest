package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.*;

import static com.slh.uno.utils.Utils.newNonNullArrayList;

public class MongoLabTest extends DTO {

    private ObjectId id;
    private Date testDate;
    private String referredBy;
    private String consultId;
    private String tag;
    private String orderId;
    private String billId;
    private String siteKey;
    private Date dateImported;
    private String documentName;
    private Date createdDateTime;
    private Date updatedDateTime;
    private String uhid;
    private String packageId;
    private String packageName;
    private Integer ownedBy;         //0 - user, 1-corporate, 2-both
    private String source;
    private String identifier;
    private String visitId;
    private String mobileNumber;
    private String firstName;
    private String patientService;
	private String locationId;
    private Boolean isClinicalDocument;
    private Boolean isHealthCheck;
    private String labTestName;
    private String additionalNotes;

    private List<MongoTest> tests = new ArrayList<>();
    private List<MongoLabResult> labParameters = new ArrayList<>();
    private List<MongoAttachment> labTestSmartReports = new ArrayList<>();
    private Boolean isManuallyUpdated;
    private List<MongoAttachment> labTestFiles = new ArrayList<>();
    private List<CustomDBRef> fileAttachments = new ArrayList<>();
    private String brandName;
    private Set<String> tags = new HashSet<>();

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getReferredBy() {
        if(referredBy!=null)
            return referredBy.replace("Dr.","").replace("DR.","");
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getSiteKey() {
        return siteKey;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public Date getDateImported() {
        return dateImported;
    }

    public void setDateImported(Date dateImported) {
        this.dateImported = dateImported;
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

    public String getUhid() {
        if(uhid != null && (uhid.trim().isEmpty() || uhid.trim().equalsIgnoreCase("null")))
            return null;
        return uhid;
    }

    public void setUhid(String uhid) {
        if(uhid != null && (uhid.trim().isEmpty() || uhid.trim().equalsIgnoreCase("null")))
            this.uhid = null;
        else this.uhid = uhid;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(Integer ownedBy) {
        this.ownedBy = ownedBy;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<MongoTest> getTests() {
        return tests;
    }

    public void setTests(List<MongoTest> tests) {
        this.tests = tests;
    }

    public List<MongoAttachment> getLabTestSmartReports() {
        return labTestSmartReports;
    }

    public void setLabTestSmartReports(List<MongoAttachment> labTestSmartReports) {
        this.labTestSmartReports = labTestSmartReports;
    }

    public Boolean getManuallyUpdated() {
        return isManuallyUpdated;
    }

    public void setManuallyUpdated(Boolean manuallyUpdated) {
        isManuallyUpdated = manuallyUpdated;
    }

    public List<MongoAttachment> getLabTestFiles() {
        return labTestFiles;
    }

    public void setLabTestFiles(List<MongoAttachment> labTestFiles) {
        this.labTestFiles = labTestFiles;
    }

    public List<CustomDBRef> getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(List<CustomDBRef> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

	public List<MongoLabResult> getLabParameters() {
		return labParameters;
	}

	public void setLabParameters(List<MongoLabResult> labParameters) {
		this.labParameters = labParameters;
	}

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatientService() {
		return patientService;
	}
	public void setPatientService(String patientService) {
		this.patientService = patientService;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

    public List<MongoAttachment> fetchFiles() {
        List<MongoAttachment> files = newNonNullArrayList();
        files.addAll(labTestFiles);
        files.addAll(labTestSmartReports);
        return files;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.labTestFiles = files;
    }

    public Boolean getIsClinicalDocument() {
        return isClinicalDocument;
    }

    public void setIsClinicalDocument(Boolean clinicalDocument) {
        isClinicalDocument = clinicalDocument;
    }

    public Boolean getIsHealthCheck() {
        return this.isHealthCheck;
    }

    public void setIsHealthCheck(Boolean isHealthCheck) {
        this.isHealthCheck = isHealthCheck;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
