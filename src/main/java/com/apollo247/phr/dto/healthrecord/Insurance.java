package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.pojo.MongoFile;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Insurance implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String documentId;
	private String documentName;
	private String insuranceCompany;
	private String policyNumber;
	private String sumInsured;
	private String source;
	private String notes;
	private long startDate;
	private long endDate;
	private boolean isActive;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;
    private String option ="";
	private List<Attachment> insuranceFiles;
	private List<File> fileAttachedList = new ArrayList<File>();
	private String uhid;
	private String newUhid;
	private String userName;
	private String mobileNumber;
	private long sortByDate;
	
	
	public long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(long sortByDate) {
		this.sortByDate = sortByDate;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
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
	public boolean isisActive() {
		return isActive;
	}
	public void setisActive(boolean isActive) {
		this.isActive = isActive;
	}	
	public List<Attachment> getInsuranceFiles() {
		return insuranceFiles;
	}
	public void setInsuranceFiles(List<Attachment> insuranceFiles) {
		this.insuranceFiles = insuranceFiles;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public long getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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
	public String getUhid() {
		return uhid;
	}
	public void setUhid(String uhid) {
		this.uhid = uhid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String username) {
		this.userName = username;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getNewUhid() {
		return newUhid;
	}
	public void setNewUhid(String newUhid) {
		this.newUhid = newUhid;
	}
	public Insurance(MongoFile dbFile, String authToken){
		this.setSource(dbFile.getSource());
		this.setAuthToken(authToken);
		this.setCreatedDateTime(dbFile.getCreateddate().getTime());
		List<Attachment> attachmentList = MongoFile.toAttachment(dbFile);
		this.setInsuranceFiles(attachmentList);
		this.setOption("FROMCLINICALDOCS");
		this.setSource(dbFile.getSource());
		this.getFileAttachedList().add(new File(dbFile));
		this.setSiteDisplayName("self");
	}
	public Insurance(){

	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
}
