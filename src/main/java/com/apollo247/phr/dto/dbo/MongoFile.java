package src.main.java.com.apollo247.phr.dto.dbo;

import com.apollo247.phr.dto.healthrecord.Attachment;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MongoFile extends DTO {

    public enum FileType {
        UnIdentified, LabTest, Hospitalization, Bill, HealthCheck, Prescription, Spam, Insurance, Consultation, Allergy, FamilyHistory, Immunization,
        MedicalCondition, Medication, Restriction;
    }

    public enum DocumentStatus {
        UPLOADED, PROCESSED, UPLOAD_FAIL, PROCESS_FAIL, DIGITIZED, CLASSIFIED, TEXTRACTED, TEXTRACT_FAIL, NOT_CLASSIFIED
    }


    private ObjectId id;
    private String documentName;
    private String uhid; // if we could get uhid otherwise null
    private String mobileNumber; // From which mobile number we got the file
    private String uploadedVia; // PHR/247 App/ Whatsapp
    private DocumentStatus documentStatus; // Document level status
    private FileType filetype;
    private ObjectId filetypeid;
    private List<MongoFileInfo> fileInfo = new ArrayList<>(); // List to accomadate multiple files eg: image file
    private Date createddate;
    private Date lastmodifieddate;
    private String source;
    private String parentFolder;
    private Boolean isClinicalDocument = false;
    private String brandName;
    private String firstName;

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
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
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

    public FileType getFiletype() {
        return filetype;
    }

    public void setFiletype(FileType filetype) {
        this.filetype = filetype;
    }

    public List<MongoFileInfo> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<MongoFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getIsClinicalDocument() {
        return isClinicalDocument;
    }

    public void setIsClinicalDocument(Boolean isClinicalDocument) {
        this.isClinicalDocument = isClinicalDocument;
    }

    public String getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }

    public ObjectId getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(ObjectId filetypeid) {
        this.filetypeid = filetypeid;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

//    public static List<DBAttachement> toDBAttachment(DBFile file) {
//        List<DBAttachement> attachList = new ArrayList<DBAttachement>();
//        for (DBFileInfo info : file.getFileInfoList()) {
//            DBAttachement attach = new DBAttachement();
//            attach.setAzurePath(info.getFile_location());
//            attach.setFileAttached(info.getId());
//            attach.setFileName(info.getFileName());
//            attach.setDateCreated(file.getCreateddate());
//            attach.setMimeType(info.getMimeType());
//            attach.setId(file.getId());
//            attachList.add(attach);
//        }
//        return attachList;
//    }

    public static List<Attachment> toAttachment(MongoFile file) {
        List<Attachment> attachList = new ArrayList<Attachment>();
        for (MongoFileInfo info : file.getFileInfo()) {
            Attachment attach = new Attachment();
            attach.setAzurePath(info.getFile_location());
            attach.setFileAttached(info.getId().toString());
            attach.setFileName(info.getFileName());
            attach.setDateCreated(file.getCreateddate().getTime());
            attach.setMimeType(info.getMimeType());
            attach.setId(file.getId().toString());
            attachList.add(attach);
        }
        return attachList;
    }

    public static List<MongoAttachment> toMongoAttachment(MongoFile file) {
        List<MongoAttachment> attachList = new ArrayList<>();
        for (MongoFileInfo info : file.getFileInfo()) {
            MongoAttachment attach = new MongoAttachment();
            attach.setAzurePath(info.getFile_location());
            attach.setFileAttached(info.getId());
            attach.setFileName(info.getFileName());
            attach.setDateCreated(file.getCreateddate());
            attach.setMimeType(info.getMimeType());
            attach.setId(file.getId());
            attachList.add(attach);
        }
        return attachList;
    }

    public List<MongoAttachment> fetchFiles() {
        if(fileInfo == null) return null;
        return toMongoAttachment(this);
    }

    public List<MongoAttachment> toAttachmentFromfileInfo(List<MongoFileInfo> fileInfos) {
        List<MongoAttachment> attachList = new ArrayList<MongoAttachment>();
        fileInfos.forEach(info->{
            MongoAttachment attach = new MongoAttachment();
            attach.setAzurePath(info.getFile_location());
            attach.setFileAttached(info.getId());
            attach.setFileName(info.getFileName());
            attach.setMimeType(info.getMimeType());
            attachList.add(attach);
        });   
        return attachList;
    }

    public Boolean getClinicalDocument() {
        return isClinicalDocument;
    }

    public void setClinicalDocument(Boolean clinicalDocument) {
        isClinicalDocument = clinicalDocument;
    }

    @Override
    public String toString() {
        return "DBFile [id=" + id + ", documentName=" + documentName + ", uhid=" + uhid + ", mobileNumber="
                + mobileNumber + ", uploadedVia=" + uploadedVia + ", documentStatus=" + documentStatus + ", filetype="
                + filetype + ", filetypeid=" + filetypeid + ", fileInfoList=" + fileInfo + ", createddate="
                + createddate + ", lastmodifieddate=" + lastmodifieddate + ", source=" + source + ", parentFolder="
                + parentFolder + ", isClinicalDocument=" + isClinicalDocument + "]";
    }


}
