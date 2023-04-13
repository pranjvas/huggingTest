package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.Date;


public class MongoIdentity extends DTO {
    private ObjectId id;
    private CustomDBRef dbUser;
    private String userId;
    private String password;
    private String uhid;
    private String activationCode;
    private String otp;
    private Date otpTime;
    private String siteKey;
    private Date registrationDate;
    private String resetPasswordLinkKey;
    private Date resetPasswordLinkGeneratedDate;
    private Date lastLogOn;
    private Date blockedTime;
    private String isIndian;
    private boolean askPasswordOnLogin;
    private String qalBloodPressureId;
    private String qalBmiId;
    private String mobileNumber;
    private String activation_source;
    private int otpAttempts;
    private String googleId;
    private String email;
    private UhidSource uhidSource;
    private boolean isPasswordHashed = false;
    private String firstName;

    public enum UhidSource {
        APP247,
        HOSPITAL
    }

    public Date getResetPasswordLinkGeneratedDate() {
        return resetPasswordLinkGeneratedDate;
    }

    public void setResetPasswordLinkGeneratedDate(
            Date resetPasswordLinkGeneratedDate) {
        this.resetPasswordLinkGeneratedDate = resetPasswordLinkGeneratedDate;
    }

    public Date getLastLogOn() {
        return lastLogOn;
    }

    public void setLastLogOn(Date lastLogOn) {
        this.lastLogOn = lastLogOn;
    }

    public Date getOtpTime() {
        return otpTime;
    }

    public void setOtpTime(Date otpTime) {
        this.otpTime = otpTime;
    }

    public String getResetPasswordLinkKey() {
        return resetPasswordLinkKey;
    }

    public void setResetPasswordLinkKey(String resetPasswordLinkKey) {
        this.resetPasswordLinkKey = resetPasswordLinkKey;
    }

    public CustomDBRef getDbUser() {
        return dbUser;
    }

    public void setDbUser(CustomDBRef dbUser) {
        this.dbUser = dbUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getSiteKey() {
        return siteKey;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isAskPasswordOnLogin() {
        return askPasswordOnLogin;
    }

    public void setAskPasswordOnLogin(boolean askPasswordOnLogin) {
        this.askPasswordOnLogin = askPasswordOnLogin;
    }

    public boolean isPasswordHashed() {
        return isPasswordHashed;
    }

    public void setPasswordHashed(boolean isPasswordHashed) {
        this.isPasswordHashed = isPasswordHashed;
    }

    public String getQalBloodPressureId() {
        return qalBloodPressureId;
    }

    public void setQalBloodPressureId(String qalBloodPressureId) {
        this.qalBloodPressureId = qalBloodPressureId;
    }

    public String getQalBmiId() {
        return qalBmiId;
    }

    public void setQalBmiId(String qalBmiId) {
        this.qalBmiId = qalBmiId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getActivation_Source() {
        return activation_source;
    }

    public void setActivation_Source(String activation_source) {
        this.activation_source = activation_source;
    }

    public int getOtpAttempts() {
        return otpAttempts;
    }

    public void setOtpAttempts(int otpAttempts) {
        this.otpAttempts = otpAttempts;
    }

    public Date getBlockedTime() {
        return blockedTime;
    }

    public void setBlockedTime(Date blockedTime) {
        this.blockedTime = blockedTime;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getIsIndian() {
        return isIndian;
    }

    public void setIsIndian(String isIndian) {
        this.isIndian = isIndian;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UhidSource getUhidSource() {
        return uhidSource;
    }

    public void setUhidSource(UhidSource uhidSource) {
        this.uhidSource = uhidSource;
    }

    public String getActivation_source() {
        return activation_source;
    }

    public void setActivation_source(String activation_source) {
        this.activation_source = activation_source;
    }
}
