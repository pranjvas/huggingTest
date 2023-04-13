package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.DBFile;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UILabTest implements UIPojo {

	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private String packageId = "";
	private String packageName = "";
	private long labTestDate;
	private long dateImported;
	private long createdDateTime;
	private String labTestRefferedBy = "";
	private String billNo ="";
	private String consultId ="";
	private Integer user;
	private String tag ="";
	private String uhid;
	private String orderId ="";
	private String visitId ="";
	private String siteDisplayName ="";
	private String signingDocNameLine1 ="";
	private long updatedDateTime;
	private String signingDocNameLine2 ="";
	private String siteKey ="";
	private Boolean containstests ;
	private List<Attachment> testResultFiles;
	private String option = "";
	private String userName;
	private String newUhid;
	private String mobileNumber;
	private List<UITest> labTestResults;
	private List<DBFile> fileAttachments = new ArrayList<>();
	private List<Attachment> labTestSmartReports = new ArrayList<>();
	private boolean isSmartReport;
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
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
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
	public long getLabTestDate() {
		return labTestDate;
	}
	public void setLabTestDate(long labTestDate) {
		this.labTestDate = labTestDate;
	}
	public long getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getLabTestRefferedBy() {
		return labTestRefferedBy;
	}
	public void setLabTestRefferedBy(String labTestRefferedBy) {
		this.labTestRefferedBy = labTestRefferedBy;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getConsultId() {
		return consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getUhid() {
		return uhid;
	}
	public void setUhid(String uhid) {
		this.uhid = uhid;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
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
	public long getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(long updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	public String getSigningDocNameLine2() {
		return signingDocNameLine2;
	}
	public void setSigningDocNameLine2(String signingDocNameLine2) {
		this.signingDocNameLine2 = signingDocNameLine2;
	}
	public String getSiteKey() {
		return siteKey;
	}
	public void setSiteKey(String siteKey) {
		this.siteKey = siteKey;
	}
	public Boolean getContainstests() {
		return containstests;
	}
	public void setContainstests(Boolean containstests) {
		this.containstests = containstests;
	}
	public List<Attachment> getTestResultFiles() {
		return testResultFiles;
	}
	public void setTestResultFiles(List<Attachment> testResultFiles) {
		this.testResultFiles = testResultFiles;
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
	public List<UITest> getLabTestResults() {
		return labTestResults;
	}
	public void setLabTestResults(List<UITest> labTestResults) {
		this.labTestResults = labTestResults;
	}
	public List<DBFile> getFileAttachments() {
		return fileAttachments;
	}
	public void setFileAttachments(List<DBFile> fileAttachments) {
		this.fileAttachments = fileAttachments;
	}
	public List<Attachment> getLabTestSmartReports() {
		return labTestSmartReports;
	}
	public void setLabTestSmartReports(List<Attachment> labTestSmartReports) {
		this.labTestSmartReports = labTestSmartReports;
	}
	public boolean isSmartReport() {
		return isSmartReport;
	}
	public void setSmartReport(boolean isSmartReport) {
		this.isSmartReport = isSmartReport;
	}
	public long getDateImported() {
		return dateImported;
	}
	public void setDateImported(long dateImported) {
		this.dateImported = dateImported;
	}

	
}
