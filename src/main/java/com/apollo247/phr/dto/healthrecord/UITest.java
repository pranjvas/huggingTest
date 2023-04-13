package src.main.java.com.apollo247.phr.dto.healthrecord;

import java.util.List;

public class UITest {

	private String testName   = "";
	private String source = "";
	private long testDate;
	private int testId;
	private int testSequence;
	private String departmentName;
	private String observation ="";
	private String additionalNotes ="";
	private String signingDocName ="";
	private String laboratoryHod ="";
	private String identifier ="";
	private String static_comments = "";
	private String checkedBy ="";
	private List<UIParameterResult> actualResults;
	
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public long getTestDate() {
		return testDate;
	}
	public void setTestDate(long testDate) {
		this.testDate = testDate;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getTestSequence() {
		return testSequence;
	}
	public void setTestSequence(int testSequence) {
		this.testSequence = testSequence;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getAdditionalNotes() {
		return additionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}
	public String getSigningDocName() {
		return signingDocName;
	}
	public void setSigningDocName(String signingDocName) {
		this.signingDocName = signingDocName;
	}
	public String getLaboratoryHod() {
		return laboratoryHod;
	}
	public void setLaboratoryHod(String laboratoryHod) {
		this.laboratoryHod = laboratoryHod;
	}
	public String getStatic_comments() {
		return static_comments;
	}
	public void setStatic_comments(String static_comments) {
		this.static_comments = static_comments;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getCheckedBy() {
		return checkedBy;
	}
	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}
	public List<UIParameterResult> getActualResults() {
		return actualResults;
	}
	public void setActualResults(List<UIParameterResult> actualResults) {
		this.actualResults = actualResults;
	}

	
}
