package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class MongoEntity extends DTO{
    private ObjectId id;
    private String shortName;
    private String displayName;
    private String brandName;
    private List<MongoFeature> features = new ArrayList<>();
    private String smsInvitation;
    private String smsInvitationTwo;
    private int smsDelayDays;
    private String smsLabtest;
    private String smsHealthCheck;
    private String smsDischarge;
    private String smsPrescription;
    private String smsHealthcheckdelay;
    private int daysToDelayHealthCheck;
    private String ftpServer;
    private String ftpUser;
    private String ftpPassword;
    private String smsPostActivation;
    private List<String> sourceConditionFlags = new ArrayList<>();

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<MongoFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<MongoFeature> features) {
        this.features = features;
    }

    public String getSmsInvitation() {
        return smsInvitation;
    }

    public void setSmsInvitation(String smsInvitation) {
        this.smsInvitation = smsInvitation;
    }

    public String getSmsInvitationTwo() {
        return smsInvitationTwo;
    }

    public void setSmsInvitationTwo(String smsInvitationTwo) {
        this.smsInvitationTwo = smsInvitationTwo;
    }

    public int getSmsDelayDays() {
        return smsDelayDays;
    }

    public void setSmsDelayDays(int smsDelayDays) {
        this.smsDelayDays = smsDelayDays;
    }

    public String getSmsLabtest() {
        return smsLabtest;
    }

    public void setSmsLabtest(String smsLabtest) {
        this.smsLabtest = smsLabtest;
    }

    public String getSmsHealthCheck() {
        return smsHealthCheck;
    }

    public void setSmsHealthCheck(String smsHealthCheck) {
        this.smsHealthCheck = smsHealthCheck;
    }

    public String getSmsDischarge() {
        return smsDischarge;
    }

    public void setSmsDischarge(String smsDischarge) {
        this.smsDischarge = smsDischarge;
    }

    public String getSmsPrescription() {
        return smsPrescription;
    }

    public void setSmsPrescription(String smsPrescription) {
        this.smsPrescription = smsPrescription;
    }

    public String getSmsHealthcheckdelay() {
        return smsHealthcheckdelay;
    }

    public void setSmsHealthcheckdelay(String smsHealthcheckdelay) {
        this.smsHealthcheckdelay = smsHealthcheckdelay;
    }

    public int getDaysToDelayHealthCheck() {
        return daysToDelayHealthCheck;
    }

    public void setDaysToDelayHealthCheck(int daysToDelayHealthCheck) {
        this.daysToDelayHealthCheck = daysToDelayHealthCheck;
    }

    public String getFtpServer() {
        return ftpServer;
    }

    public void setFtpServer(String ftpServer) {
        this.ftpServer = ftpServer;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public String getSmsPostActivation() {
        return smsPostActivation;
    }

    public void setSmsPostActivation(String smsPostActivation) {
        this.smsPostActivation = smsPostActivation;
    }

    public List<String> getSourceConditionFlags() {
        return sourceConditionFlags;
    }

    public void setSourceConditionFlags(List<String> sourceConditionFlags) {
        this.sourceConditionFlags = sourceConditionFlags;
    }
}
