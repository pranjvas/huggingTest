package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoTest extends DTO {

    private String testName; // This is referenced from LabTestMaster, remove LabTestDetail
    private String testid;
    private String source;
    private List<MongoLabResult> results = new ArrayList<>();
    private String observation;
    private String notes;
    private String departmentName;
    private String identifier;
    private String patientservice;
    private String visitId;
    private String static_comments;
    private String signingDocName;
    private String doc_sign;
    private String checkedBy;
    private String laboratoryHod;
    private Boolean resultsReceived;
    private Integer expectedTAT;
    private Date followupDate;
    private Date first_report_printed_on;
    private Date collectedOn;
    private Date reportedOn;
    private Date receivedOn;
    private Date printedOn;
    private String drn;
    private Integer blocked;
    private String specimen;
    //PHR Ask parameters, to skip the records which are not fully synced
	private Date billedOn;
	private boolean hasOnlyBillingData;

    private List<MongoAttachment> testResultFiles = new ArrayList<>();

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<MongoLabResult> getResults() {
        return results;
    }

    public void setResults(List<MongoLabResult> results) {
        this.results = results;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPatientservice() {
        return patientservice;
    }

    public void setPatientservice(String patientservice) {
        this.patientservice = patientservice;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getStatic_comments() {
        return static_comments;
    }

    public void setStatic_comments(String static_comments) {
        this.static_comments = static_comments;
    }

    public String getSigningDocName() {
        return signingDocName;
    }

    public void setSigningDocName(String signingDocName) {
        this.signingDocName = signingDocName;
    }

    public String getDoc_sign() {
        return doc_sign;
    }

    public void setDoc_sign(String doc_sign) {
        this.doc_sign = doc_sign;
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

    public Boolean getResultsReceived() {
        return resultsReceived;
    }

    public void setResultsReceived(Boolean resultsReceived) {
        this.resultsReceived = resultsReceived;
    }

    public Integer getExpectedTAT() {
        return expectedTAT;
    }

    public void setExpectedTAT(Integer expectedTAT) {
        this.expectedTAT = expectedTAT;
    }

    public Date getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    public Date getFirst_report_printed_on() {
        return first_report_printed_on;
    }

    public void setFirst_report_printed_on(Date first_report_printed_on) {
        this.first_report_printed_on = first_report_printed_on;
    }

    public Date getCollectedOn() {
        return collectedOn;
    }

    public void setCollectedOn(Date collectedOn) {
        this.collectedOn = collectedOn;
    }

    public Date getReportedOn() {
        return reportedOn;
    }

    public void setReportedOn(Date reportedOn) {
        this.reportedOn = reportedOn;
    }

    public Date getReceivedOn() {
        return receivedOn;
    }

    public void setReceivedOn(Date receivedOn) {
        this.receivedOn = receivedOn;
    }

    public Date getPrintedOn() {
        return printedOn;
    }

    public void setPrintedOn(Date printedOn) {
        this.printedOn = printedOn;
    }

    public String getDrn() {
        return drn;
    }

    public void setDrn(String drn) {
        this.drn = drn;
    }

    public Integer getBlocked() {
        return blocked;
    }

    public void setBlocked(Integer blocked) {
        this.blocked = blocked;
    }

    public String getSpecimen() {
        return specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }

    public List<MongoAttachment> getTestResultFiles() {
        return testResultFiles;
    }

    public void setTestResultFiles(List<MongoAttachment> testResultFiles) {
        this.testResultFiles = testResultFiles;
    }
    public Date getBilledOn() {
		return billedOn;
	}
	public void setBilledOn(Date billedOn) {
		this.billedOn = billedOn;
	}
	public boolean isHasOnlyBillingData() {
		return hasOnlyBillingData;
	}
	public void setHasOnlyBillingData(boolean hasOnlyBillingData) {
		this.hasOnlyBillingData = hasOnlyBillingData;
	}
}
