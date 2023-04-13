package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabResult implements UIPojo {
	
    private String parameterName;
 	private String result;
 	private String unit;
 	private String range;
 	private String minimum;
 	private String maximum;
	private String loincCode;
 	private boolean outOfRange;
 	private long resultDate;
 	private String standardizedParam;
 	private String index;
 	private String brandName;
	private Boolean isDefaultDoc;

	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public boolean isOutOfRange() {
		return outOfRange;
	}
	public void setOutOfRange(boolean outOfRange) {
		this.outOfRange = outOfRange;
	}
	public long getResultDate() {
		return resultDate;
	}
	public void setResultDate(long resultDate) {
		this.resultDate = resultDate;
	}

	public String getLoincCode() {
		return loincCode;
	}

	public void setLoincCode(String loincCode) {
		this.loincCode = loincCode;
	}
	public String getStandardizedParam() {
		return standardizedParam;
	}
	public void setStandardizedParam(String standardizedParam) {
		this.standardizedParam = standardizedParam;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	public String getMaximum() {
		return maximum;
	}

	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}

	public Boolean getDefaultDoc() {
		return isDefaultDoc;
	}

	public void setDefaultDoc(Boolean defaultDoc) {
		isDefaultDoc = defaultDoc;
	}
    @Override
    public String toString() {
            return "LabResult [parameterName=" + parameterName + ", result=" + result + ", unit=" + unit + ", range="
                                + range + ", minimum=" + minimum + ", maximum=" + maximum + ", loincCode=" + loincCode + ", outOfRange="
                                + outOfRange + ", resultDate=" + resultDate + ", standardizedParam=" + standardizedParam + ", index="
                                + index + ", brandName=" + brandName + ", isDefaultDoc=" + isDefaultDoc + "]";
        }
}