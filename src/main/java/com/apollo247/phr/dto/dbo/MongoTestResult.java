package src.main.java.com.apollo247.phr.dto.dbo;

import com.slh.uno.service.impl.TestResultServiceImpl;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.util.List;

public class MongoTestResult {

    private static final Logger log = LoggerFactory.getLogger(TestResultServiceImpl.class);

    private Integer parameterId;
    private String parameterName;
    private String result;
    private String range;
    private String unit = "";
    private String minRange;
    private String maxRange;
    private Boolean outOfRange;
    private Long resultDateTime;
    private String loinc_code;
    private String contentCode;
    private String imageName;
    private Double dotPosition;
    private String textOnNoRange;
    private String previousValue;
    private List<MongoGraphValue> graphValues;
    private ObjectId documentId;
    private String name;
    private String brandName;
    private String actualRange;
    private boolean isEditable;
    private MongoInformativeContent informativeContent;

    private String title;
    private String desc;
    private String identifier;
    private List<RelatedFAQ> content;

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

    public String getResult() {
        try {
            if(result != null) {
                String res = result.replaceAll("\\s*", "");
                if(isEditable) res = res.replace(",", ".");
//                else res = res.replace(",", "");
                double num = Double.parseDouble(res);
                return new DecimalFormat("0.###").format(num);
            }
            return null;
        } catch (Exception e) {
            return result;
        }
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


    private static String formatDoubleVal(String n) {
        try {
            double num = Double.parseDouble(n);
            n = new DecimalFormat("0.###").format(num);
            if(num > -1000.0 && num < 1000.0) return n;
            return formatDoubleVal(num, 0);
        } catch (Exception e) {
            if(n != null) e.printStackTrace();
            return n;
        }
    }

    /**
     * Recursive implementation, invokes itself for each factor of a thousand, increasing the class on each invokation.
     * @param n the number to format
     * @param iteration in fact this is the class from the array c
     * @return a String representing the number n formatted in a cool looking way.
     */
    private static String formatDoubleVal(double n, int iteration) {
        char[] c = new char[]{'k', 'm', 'b', 't'};
        double d = ((long) n / 100) / 10.0;
        boolean isRound = (d * 10) % 10 == 0;//true if the decimal part is equal to 0 (then it's trimmed anyway)
        return (d < 1000 ? //this determines the class, i.e. 'k', 'm' etc
                ((d > 99.9 || isRound || (!isRound && d > 9.99) ? //this decides whether to trim the decimals
                        (int) d * 10 / 10 : d + "" // (int) d * 10 / 10 drops the decimal
                ) + "" + c[iteration])
                : formatDoubleVal(d, iteration + 1));

    }

    public String getMinRange() {
        if(this.maxRange == null) return null;
        return formatDoubleVal(this.minRange);
    }

    public void assignMinRange(Double minRange) {
        if(minRange != null) this.minRange = String.valueOf(minRange);
    }

    public void setMinRange(String minRange) {
        this.minRange = minRange;
    }

    public String getMaxRange() {
        if(this.minRange == null) return null;
        return formatDoubleVal(this.maxRange);
    }

    public void assignMaxRange(Double maxRange) {
        if(maxRange != null) this.maxRange = String.valueOf(maxRange);
    }

    public void setMaxRange(String maxRange) {
        this.maxRange = maxRange;
    }

    public Boolean getOutOfRange() {
        if(imageName != null && imageName.equals("no_image.jpg")) return null;
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

    public String getLoinc_code() {
        return loinc_code;
    }

    public void setLoinc_code(String loinc_code) {
        this.loinc_code = loinc_code;
    }

    public String getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    public List<MongoGraphValue> getGraphValues() {
        if(graphValues != null && graphValues.size() > 1) {
            try {
                graphValues.forEach(val -> Double.parseDouble(val.getResult()));
                return graphValues;
            } catch (Exception e) {
                log.error("error while parsing graph value result, msg: {}", e.getMessage());
            }
        }
        return null;
    }

    public void setGraphValues(List<MongoGraphValue> graphValues) {
        this.graphValues = graphValues;
    }

    public ObjectId getDocumentId() {
        return documentId;
    }

    public void setDocumentId(ObjectId documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Double getDotPosition() {
        return dotPosition;
    }

    public void setDotPosition(Double dotPosition) {
        this.dotPosition = dotPosition;
    }

    public String getTextOnNoRange() {
        return textOnNoRange;
    }

    public void setTextOnNoRange(String textOnNoRange) {
        this.textOnNoRange = textOnNoRange;
    }

    public String getRange() {
        if(textOnNoRange != null || (minRange != null && maxRange != null))
            return null;
        return range;
    }

    public void setRange(String range) {
        this.range = this.actualRange = range;
    }

    public String getActualRange() {
        return this.range;
    }

    public void setActualRange(String actualRange) {
        this.actualRange = this.range = actualRange;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean editable) {
        isEditable = editable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<RelatedFAQ> getContent() {
        return content;
    }

    public void setContent(List<RelatedFAQ> content) {
        this.content = content;
    }

    public String getContentCode() {
        return contentCode;
    }

    public void setContentCode(String contentCode) {
        this.contentCode = contentCode;
    }
}
