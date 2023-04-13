package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Symptoms implements UIPojo {

	private String symptom;
    private String since;
    private String howOften;
    private String severity;
    private String details;
    
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public String getSince() {
		return since;
	}
	public void setSince(String since) {
		this.since = since;
	}
	public String getHowOften() {
		return howOften;
	}
	public void setHowOften(String howOften) {
		this.howOften = howOften;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
    
}
