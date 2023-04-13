package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.pojo.MongoFile;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UILabTestResult implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentName;
	private String documentId;
	private String labTestName;
	private String labTestSource = "";
	private String packageId = "";
	private String packageName = "";
	private String static_comments = "";
	private Long labTestDate = 0L;
	private Long createdDateTime = 0L;
	private String labTestRefferedBy = "";
	private String observation ="";
	private String additionalNotes ="";
	private String billNo ="";
	private String consultId ="";
	private Integer user;
	private String tag ="";
	private List<LabResultWrapper> labResultDetails = new ArrayList<>();
	private List<LabResult> labTestResults = new ArrayList<>();
	private String uhid;
	private Integer testId = 0;
	private String labTestObjectId;
	private String departmentName;
	private Integer testSequence = 0;
	private Long dateImported = 0L;
	private Long labTestFollowUpDate = 0L;
	private String orderId ="";
	private String identifier ="";
	private String visitId ="";
	private String signingDocName ="";
	private String checkedBy ="";
	private String laboratoryHod ="";
	private String siteDisplayName ="";
	private String signingDocNameLine1 ="";
	private Long updatedDateTime = 0L;
	private String signingDocNameLine2 ="";
	private String siteKey ="";
	private Boolean containstests ;
	private List<Attachment> testResultFiles = new ArrayList<>();
	private String option = "";
	private Boolean isClinicalDocument = false;
	private List<File> fileAttachments = new ArrayList<>();
	private List<Attachment> labTestSmartReports = new ArrayList<>(); 
	private Boolean isSmartReport = false;
	private String userName = "";
	private String newUhid;
	private String mobileNumber;
	private Long sortByDate = 0L;
	
	
	public Long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(Long sortByDate) {
		this.sortByDate = sortByDate;
	}
	 
	public boolean getisSmartReport() { 
		return isSmartReport; 
	} 
	public void setSmartReport(boolean isSmartReport) { 
		this.isSmartReport = isSmartReport; 
	} 

	public boolean getIsClinicalDocument() {
		return isClinicalDocument;
	}
	public void setIsClinicalDocument(boolean isClinicalDocument) {
		this.isClinicalDocument = isClinicalDocument;
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
	public String getLabTestName() {
		return labTestName;
	}
	public void setLabTestName(String labTestName) {
		this.labTestName = labTestName;
	}
	public String getLabTestSource() {
		return labTestSource;
	}
	public void setLabTestSource(String labTestSource) {
		this.labTestSource = labTestSource;
	}
	public Long getLabTestDate() {
		return labTestDate;
	}
	public void setLabTestDate(Long labTestDate) {
		this.labTestDate = labTestDate;
	}
	public String getLabTestRefferedBy() {
		return labTestRefferedBy;
	}
	public void setLabTestRefferedBy(String labTestRefferedBy) {
		this.labTestRefferedBy = labTestRefferedBy;
	}
	public List<LabResultWrapper> getLabResultDetails() {
		return labResultDetails;
	}
	public void setLabResultDetails(List<LabResultWrapper> labResultDetails) {
		this.labResultDetails = labResultDetails;
	}
	public String getAdditionalNotes() {
		return additionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getLabTestObjectId() {
		return labTestObjectId;
	}
	public void setLabTestObjectId(String labTestObjectId) {
		this.labTestObjectId = labTestObjectId;
	}
	public Integer getTestSequence() {
		return testSequence;
	}
	public void setTestSequence(Integer testSequence) {
		this.testSequence = testSequence;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Long getDateImported() {
		return dateImported;
	}
	public void setDateImported(Long dateImported) {
		this.dateImported = dateImported;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getSigningDocName() {
		return signingDocName;
	}
	public void setSigningDocName(String signingDocName) {
		this.signingDocName = signingDocName;
	}
	public String getCheckedBy() {
		return checkedBy;
	}
	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}
	public String getLaboratoryHod() {
		return laboratoryHod;
	}
	public void setLaboratoryHod(String laboratoryHod) {
		this.laboratoryHod = laboratoryHod;
	}
	public String getSiteDisplayName() {
		return siteDisplayName;
	}
	public void setSiteDisplayName(String siteDisplayName) {
		this.siteDisplayName = siteDisplayName;
	}
	public String getSigningDocNameLine1() {
		return signingDocNameLine1;
	}
	public void setSigningDocNameLine1(String signingDocNameLine1) {
		this.signingDocNameLine1 = signingDocNameLine1;
	}
	public String getSigningDocNameLine2() {
		return signingDocNameLine2;
	}
	public void setSigningDocNameLine2(String signingDocNameLine2) {
		this.signingDocNameLine2 = signingDocNameLine2;
	}
	public Long getLabTestFollowUpDate() {
		return labTestFollowUpDate;
	}
	public void setLabTestFollowUpDate(Long labTestFollowUpDate) {
		this.labTestFollowUpDate = labTestFollowUpDate;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
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
	public List<Attachment> getTestResultFiles() {
		return testResultFiles;
	}
	public String getSiteKey() { return siteKey; }
	public void setSiteKey(String siteKey) { this.siteKey = siteKey; }
	public void setTestResultFiles(List<Attachment> testResultFiles) {
		this.testResultFiles = testResultFiles;
	}

	public String getStatic_comments() {
		return static_comments;
	}

	public void setStatic_comments(String static_comments) {
		this.static_comments = static_comments;
	}

	public Long getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Long getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Long updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}


	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Boolean getContainstests() {
		return containstests;
	}

	public void setContainstests(Boolean containstests) {
		this.containstests = containstests;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public List<File> getFileAttachments() {
		return fileAttachments;
	}
	public void setFileAttachments(List<File> fileAttachments) {
		this.fileAttachments = fileAttachments;
	}
	public List<Attachment> getLabTestSmartReports() {  
		return labTestSmartReports;  
	}  
	public void setLabTestSmartReports(List<Attachment> labTestSmartReports) {  
		this.labTestSmartReports = labTestSmartReports;  
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public List<LabResult> getLabTestResults() {
		return labTestResults;
	}

	public void setLabTestResults(List<LabResult> labTestResults) {
		this.labTestResults = labTestResults;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentId == null) ? 0 : documentId.hashCode());
		result = prime * result + ((documentName == null) ? 0 : documentName.hashCode());
		result = prime * result + ((labTestName == null) ? 0 : labTestName.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + ((fileAttachments == null) ? 0 : fileAttachments.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((updatedDateTime == null) ? 0 : updatedDateTime.hashCode());
		return result;
	}

	private boolean isEqual(Object o1, Object o2) {
		if(o1 == null && o2 == null) return true;
		if(o1 != null && o2 == null) return false;
		if(o1 == null) return false;
		return o1.equals(o2);
	}

	@Override
	public boolean equals(Object result) {
		if(!(result instanceof UILabTestResult)) return false;
		UILabTestResult res = (UILabTestResult) result;
		return isEqual(this.getDocumentId(), res.getDocumentId()) &&
				isEqual(this.getDocumentName(), res.getDocumentName()) &&
				isEqual(this.getLabTestName(), res.getLabTestName());
	}
	public UILabTestResult(MongoFile dbFile, String authToken){
		this.setLabTestSource(dbFile.getSource());
		this.setAuthToken(authToken);
		this.setLabTestName(dbFile.getDocumentName());
		this.setLabTestDate(dbFile.getCreateddate().getTime());
		this.setCreatedDateTime(System.currentTimeMillis());
		this.setDateImported(dbFile.getCreateddate().getTime());
		List<Attachment> testResultFiles = MongoFile.toAttachment(dbFile);
		this.setTestResultFiles(testResultFiles);
		this.setUhid(dbFile.getUhid());
		Long ts;
		if ((Long)dbFile.getLastmodifieddate().getTime() != null)
			ts = dbFile.getLastmodifieddate().getTime();
		else
			ts = System.currentTimeMillis();
		this.setUpdatedDateTime(ts);
		this.setOption("FROMCLINICALDOCS");
		this.getFileAttachments().add(new File(dbFile));
		this.setSiteDisplayName("self");
	}
	public UILabTestResult(){
		//default constructor
	}
}
