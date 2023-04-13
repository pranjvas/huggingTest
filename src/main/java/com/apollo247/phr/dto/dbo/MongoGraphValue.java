package src.main.java.com.apollo247.phr.dto.dbo;

public class MongoGraphValue {

    private String result;
    private String unit;
    private Boolean outOfRange;
    private Long resultDateTime;
    private Boolean isBold;

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

    public Boolean getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(Boolean outOfRange) {
        this.outOfRange = outOfRange;
    }

    public Long getResultDateTime() {
        return resultDateTime;
    }

    public void setResultDateTime(Long resultDateTime) {
        this.resultDateTime = resultDateTime;
    }

    public Boolean getIsBold() {
        return isBold;
    }

    public void setIsBold(Boolean bold) {
        isBold = bold;
    }
}
