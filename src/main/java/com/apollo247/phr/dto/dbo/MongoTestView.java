package src.main.java.com.apollo247.phr.dto.dbo;

import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;
import java.util.List;

public class MongoTestView {

    public List<MongoInformativeContent> getInformativeContent() {
        return informativeContent;
    }

    public void setInformativeContent(List<MongoInformativeContent> informativeContent) {
        this.informativeContent = informativeContent;
    }

    private List<MongoInformativeContent> informativeContent;



    private String testName;
    private String category;
    private List<MongoTestResult> outOfRangeresults = new ArrayList<>();
    private List<MongoTestResult> inRangeresults = new ArrayList<>();
    private List<MongoTestResult> undeterminedResults = new ArrayList<>();
    private String paramRangeString;
    private String textString;
    private String imageName;
    private String source;
    private Boolean isEditable = true;
    private Long testDate;
    private Boolean pdfPreview = false;
    private Boolean isDigitised = false;
    
    public Boolean getPdfPreview() {
        return this.isDigitised;
    }

    public void setPdfPreview(Boolean pdfPreview) {
        this.pdfPreview = pdfPreview;
    }

    public String getTestName() {
        char delimiters[]={' ','.','(',')','-','[',']'};
        return WordUtils.capitalizeFully(testName,delimiters);
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCriticalParamCount() {
        if(outOfRangeresults == null) return 0;
        return outOfRangeresults.size();
    }

    public Integer getNonCriticalParamCount() {
        if(inRangeresults == null) return 0;
        return inRangeresults.size();
    }

    public List<MongoTestResult> getOutOfRangeresults() {
        return outOfRangeresults;
    }

    public void setOutOfRangeresults(List<MongoTestResult> outOfRangeresults) {
        this.outOfRangeresults = outOfRangeresults;
    }

    public List<MongoTestResult> getInRangeresults() {
        return inRangeresults;
    }

    public void setInRangeresults(List<MongoTestResult> inRangeresults) {
        this.inRangeresults = inRangeresults;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getTestDate() {
        return testDate;
    }

    public void setTestDate(Long testDate) {
        this.testDate = testDate;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean editable) {
        isEditable = editable;
    }

    public String getParamRangeString() {
        return paramRangeString;
    }

    public void setParamRangeString(String paramRangeString) {
        this.paramRangeString = paramRangeString;
    }

    public String getTextString() {
        return textString;
    }

    public void setTextString(String textString) {
        this.textString = textString;
    }

    public String getImageName() {
        if(imageName.equals("no_image.jpg")) return null;
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public List<MongoTestResult> getUndeterminedResults() {
        return undeterminedResults;
    }

    public void setUndeterminedResults(List<MongoTestResult> undeterminedResults) {
        this.undeterminedResults = undeterminedResults;
    }

    public List<MongoTestResult> fetchAllResults() {
        List<MongoTestResult> testResults = new ArrayList<>();
        testResults.addAll(inRangeresults);
        testResults.addAll(outOfRangeresults);
        testResults.addAll(undeterminedResults);
        return testResults;
    }

    public Boolean getIsDigitised() {
        return isDigitised;
    }

    public void setIsDigitised(Boolean digitised) {
        isDigitised = digitised;
    }
}
