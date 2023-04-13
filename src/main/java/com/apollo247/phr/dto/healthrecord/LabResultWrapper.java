package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabResultWrapper implements UIPojo {
	
	private String testName;
	private List<LabResult> paramObjects = new ArrayList<>();
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public List<LabResult> getParamObjects() {
		return paramObjects;
	}
	public void setParamObjects(List<LabResult> paramObjects) {
		this.paramObjects = paramObjects;
	}
}
