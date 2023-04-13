package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FamilyHistory implements UIPojo {

	private String id;
	private String documentId;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;
	private String diseaseName ;
	private String authToken ;
	private String source ;
	private long recordDate;
	private String familyMember;
	private String notes;
	private int age;
	private List<Attachment>  familyHistoryFiles = new ArrayList<>();
	private List<ClinicalDocuments> fileAttachedList;
	private String uhid;
	private String userName;
	private String newUhid;
	private String mobileNumber;
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


	public long getCreatedDatetime() {
		return createdDateTime;
	}

	public void setCreatedDatetime(long createdAt) {
		this.createdDateTime = createdAt;
	}

	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
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

	public long getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(long recordDate) {
		this.recordDate = recordDate;
	}

	public String getFamilyMember() {
		return familyMember;
	}

	public void setFamilyMember(String familyMember) {
		this.familyMember = familyMember;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Attachment> getFamilyHistoryFiles() {
		return familyHistoryFiles;
	}
	public void setFamilyHistoryFiles(List<Attachment> familyHistoryFiles) {
		this.familyHistoryFiles = familyHistoryFiles;
	}
	public List<ClinicalDocuments> getFileAttachedList() {
		return fileAttachedList;
	}
	public void setFileAttachedList(List<ClinicalDocuments> fileAttachedList) {
		this.fileAttachedList = fileAttachedList;
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
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}

