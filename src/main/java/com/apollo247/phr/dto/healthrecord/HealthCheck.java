package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthCheck implements UIPojo {
	private String documentId;

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	private String authToken;
	private String userId;
	private String id;
	private String healthCheckName;
	private long healthCheckDate;
	private String healthCheckSummary;
	private String fileName;
	private String downloadUrl;
	private List<Attachment> healthCheckFiles;	
	private List<ClinicalDocuments> fileAttachedList;
	private String source;
	private String healthCheckType;
	private long followupDate;
	private long createdDateTime;
	private long updatedDateTime;
    private String siteDisplayName;
    private long sortByDate;
	private String uhid;

	public String getUhid() {
		return uhid;
	}

	public void setUhid(String uhid) {
		this.uhid = uhid;
	}

	public long getSortByDate() {
		return sortByDate;
	}

	public void setSortByDate(long sortByDate) {
		this.sortByDate = sortByDate;
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
	public String getHealthCheckName() {
		return healthCheckName;
	}
	public void setHealthCheckName(String healthCheckName) {
		this.healthCheckName = healthCheckName;
	}
	public long getHealthCheckDate() {
		return healthCheckDate;
	}
	public void setHealthCheckDate(long healthCheckDate) {
		this.healthCheckDate = healthCheckDate;
	}
	public String getHealthCheckSummary() {
		return healthCheckSummary;
	}
	public void setHealthCheckSummary(String healthCheckSummary) {
		this.healthCheckSummary = healthCheckSummary;
	}	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getHealthCheckType() {
		return healthCheckType;
	}
	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
	}
	public long getFollowupDate() {
		return followupDate;
	}
	public void setFollowupDate(long followupDate) {
		this.followupDate = followupDate;
	}
	public List<Attachment> getHealthCheckFiles() {
		return healthCheckFiles;
	}
	public void setHealthCheckFiles(List<Attachment> healthCheckFiles) {
		this.healthCheckFiles = healthCheckFiles;
	}
	public long getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
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
	public List<ClinicalDocuments> getFileAttachedList() {
		return fileAttachedList;
	}
	public void setFileAttachedList(List<ClinicalDocuments> fileAttachedList) {
		this.fileAttachedList = fileAttachedList;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
}
