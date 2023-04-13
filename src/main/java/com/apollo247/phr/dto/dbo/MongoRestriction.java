package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.Date;

public class MongoRestriction extends DTO{
    private ObjectId id;
    
    private String restrictionName; // This is referenced from DBDoctor
     private RestrictionType nature;
     private String suggestedByDoctor; // This should be Doctor Id
     private Date startDate;
     private Date endDate;
     private String notes;
     private String source;
     private Date createdDateTime;
     private Date updatedDateTime;;

     private boolean havingNow;
    private String authToken;
    private String userId;
    private String firstName;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getSiteDisplayName() {
        return siteDisplayName;
    }

    public void setSiteDisplayName(String siteDisplayName) {
        this.siteDisplayName = siteDisplayName;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getNewUhid() {
        return newUhid;
    }

    public void setNewUhid(String newUhid) {
        this.newUhid = newUhid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getSortByDate() {
        return sortByDate;
    }

    public void setSortByDate(long sortByDate) {
        this.sortByDate = sortByDate;
    }

    private String mobileNumber;
    private String documentId;
    private String siteDisplayName;
    private String uhid;
    private String newUhid;
    private String userName;
    private long sortByDate;

    public enum RestrictionType {
        Physical,Dietary,OTHER
    }

    public void setRestrictionName(String restrictionName) {
        this.restrictionName = restrictionName;
    }

    public String getRestrictionName() {
        return restrictionName;
    }

    public void setNature(RestrictionType nature) {
        this.nature = nature;
    }

    public RestrictionType getNature() {
        return nature;
    }

    public void setSuggestedByDoctor(String suggestedByDoctor) {
        this.suggestedByDoctor = suggestedByDoctor;
    }

    public String getSuggestedByDoctor() {
        return suggestedByDoctor;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId objectId) {
        this.id = objectId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isHavingNow() {
        return havingNow;
    }

    public void setHavingNow(boolean havingNow) {
        this.havingNow = havingNow;
    }

    public Date getCreatedDatetime() {
        return createdDateTime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDateTime = createdDatetime;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

}
