package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.List;

public class MongoClinicalDocuments extends DTO {
    private ObjectId id;
    private String documentName;
    private String uhid;
    private String newUhid;
    private String mobileNumber;
    private String uploadedVia;
    private String documentStatus;
    private String fileType;
    private String fileTypeId;
    private List<MongoFileInfo> fileInfoList;
    private Long createddate;
    private Long lastmodifieddate;
    private String authToken;
    private String source;
    private String sourcePlatform;  //can be WEB, WHATSAPP ,APP
    private String parentFolder;
    private String userName;
    private long sortByDate;

    public String getSourcePlatform() {
        return this.sourcePlatform;
    }
    public void setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
    }

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public String getDocumentName() {
        return documentName;
    }
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
    public String getUhid() {
        if(this.uhid != null && this.uhid.equalsIgnoreCase("null"))
            return this.uhid = null;
        return this.uhid;
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
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getUploadedVia() {
        return uploadedVia;
    }
    public void setUploadedVia(String uploadedVia) {
        this.uploadedVia = uploadedVia;
    }
    public String getDocumentStatus() {
        return documentStatus;
    }
    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }
    public String getFileType() {
        return fileType;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    public List<MongoFileInfo> getFileInfoList() {
        return fileInfoList;
    }
    public void setFileInfoList(List<MongoFileInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
    }
    public long getCreateddate() {
        return createddate;
    }
    public void setCreateddate(long createddate) {
        this.createddate = createddate;
    }
    public long getLastmodifieddate() {
        return lastmodifieddate;
    }
    public void setLastmodifieddate(long lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }
    public String getAuthToken() {
        return authToken;
    }
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getParentFolder() {
        return parentFolder;
    }
    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }
    public String getFileTypeId() {
        return fileTypeId;
    }
    public void setFileTypeId(String fileTypeId) {
        this.fileTypeId = fileTypeId;
    }
    public void setCreateddate(Long createddate) {
        this.createddate = createddate;
    }
    public void setLastmodifieddate(Long lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
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
}
