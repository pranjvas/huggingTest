package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

public class MongoBrand extends DTO{

    private ObjectId id;
    private String name;
    private String logoUrl;
    private String mobileNumber;
    private String reportLogoUrl;
    private String loginUrl;
    private String copyright;
    private int brandWeight;

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getReportLogoUrl() {
        return reportLogoUrl;
    }

    public void setReportLogoUrl(String reportLogoUrl) {
        this.reportLogoUrl = reportLogoUrl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getBrandWeight() {
        return brandWeight;
    }

    public void setBrandWeight(int brandWeight) {
        this.brandWeight = brandWeight;
    }
}
