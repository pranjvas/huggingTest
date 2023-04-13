package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.Date;

public class MongoLabResult extends DTO {

    private Integer parameterId;
    private String parameterName;
    private String std_parameterName;
    private Integer sequence;
    private String result;
    private String unit;
    private String range;
    private Boolean outOfRange;
    private Date resultDateTime;
    private String standardizedParam;
    private String loinc_code;
    private String expected_unit;
    private Boolean isSelfUpload;

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getStd_parameterName() {
        return std_parameterName;
    }

    public void setStd_parameterName(String std_parameterName) {
        this.std_parameterName = std_parameterName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getResult() {
        /*String res = null;
        if(result != null) {
            res = result.replaceAll("\\s*", "");
            if(isSelfUpload != null) {
                if(isSelfUpload) res = res.replace(",", ".");
                else res = res.replace(",", "");
            }
        }
        return res;*/
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

    public Boolean getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(Boolean outOfRange) {
        this.outOfRange = outOfRange;
    }

    public Date getResultDateTime() {
        return resultDateTime;
    }

    public void setResultDateTime(Date resultDateTime) {
        this.resultDateTime = resultDateTime;
    }

    public String getStandardizedParam() {
        return standardizedParam;
    }

    public void setStandardizedParam(String standardizedParam) {
        this.standardizedParam = standardizedParam;
    }

    public String getLoinc_code() {
        return loinc_code;
    }

    public void setLoinc_code(String loinc_code) {
        this.loinc_code = loinc_code;
    }

    public String getExpected_unit() {
        return expected_unit;
    }

    public void setExpected_unit(String expected_unit) {
        this.expected_unit = expected_unit;
    }

    public Boolean getIsSelfUpload() {
        return null;
    }

    public void setIsSelfUpload(Boolean selfUpload) {
        isSelfUpload = selfUpload;
    }
}
