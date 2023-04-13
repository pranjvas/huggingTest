package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Procedure implements UIPojo {
	private String authToken;
	private String userId;
	private String id;
	private String procedureName;
	private long startDate;
	private long endDate;
	private String doctorTreated;
	private String notes;
	private List<Attachment> procedureFiles;	
	private List<ClinicalDocuments> fileAttachedList;
	
	public List<Attachment> getProcedureFiles() {
		return procedureFiles;
	}
	public void setProcedureFiles(List<Attachment> procedureFiles) {
		this.procedureFiles = procedureFiles;
	}
	private String source;

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
	public String getProcedureName() {
		return procedureName;
	}
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
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
	public String getDoctorTreated() {
		return doctorTreated;
	}
	public void setDoctorTreated(String doctorTreated) {
		this.doctorTreated = doctorTreated;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<ClinicalDocuments> getFileAttachedList() {
		return fileAttachedList;
	}
	public void setFileAttachedList(List<ClinicalDocuments> fileAttachedList) {
		this.fileAttachedList = fileAttachedList;
	}
	
}
