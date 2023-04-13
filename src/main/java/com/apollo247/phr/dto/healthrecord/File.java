package src.main.java.com.apollo247.phr.dto.healthrecord;
import com.apollo247.phr.dto.dbo.MongoFile;
import com.apollo247.phr.dto.dbo.MongoFileInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.DBFile;
import com.slh.uno.dbo.DBFileInfo;
import com.slh.uno.dbo.pojo.MongoFile;
import com.slh.uno.dbo.pojo.MongoFileInfo;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class File implements UIPojo {
    public enum FileType {
        UnIdentified, LabTest,Hospitalization,Bill,HealthCheck,Prescription, Spam, Insurance, Consultation, Allergy, FamilyHistory, Immunization,
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
     private List<FileInfo> fileInfoList = new ArrayList<>(); // List to accomadate multiple files eg: image file
     private Date createddate;
     private Date lastmodifieddate;
     private String source;
     private String parentFolder;
     private boolean isClinicalDocument = false;
     private String brandName;
     private String sourcePlatform;

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }
    public void setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
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
    public FileType getFileType() {
        return filetype;
    }
    public void setFileType(FileType filetype) {
        this.filetype = filetype;
    }
    public List<FileInfo> getFileInfoList() {
        return fileInfoList;
    }
    public void setFileInfoList(List<FileInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
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
    public boolean isClinicalDocument() {
        return isClinicalDocument;
    }
    public void setClinicalDocument(boolean isClinicalDocument) {
        this.isClinicalDocument = isClinicalDocument;
    }
    public String getParentFolder() {
        return parentFolder;
    }
    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }
    public ObjectId getFileTypeId() {
        return filetypeid;
    }
    public void setFileTypeId(ObjectId filetypeid) {
        this.filetypeid = filetypeid;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public static List<Attachment> toAttachment(File file) {
        List<Attachment> attachList = new ArrayList<Attachment>();
        for(FileInfo info : file.getFileInfoList()) {
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
    @Override
    public String toString() {
        return "File [id=" + id + ", documentName=" + documentName + ", uhid=" + uhid + ", mobileNumber="
                + mobileNumber + ", uploadedVia=" + uploadedVia + ", documentStatus=" + documentStatus + ", filetype="
                + filetype + ", filetypeid=" + filetypeid + ", fileInfoList=" + fileInfoList + ", createddate="
                + createddate + ", lastmodifieddate=" + lastmodifieddate + ", source=" + source + ", parentFolder="
                + parentFolder + ", isClinicalDocument=" + isClinicalDocument + "]";
    }



    public File() {

    }

    public File(MongoFile mongoFile){
        this.brandName = mongoFile.getBrandName();
        this.createddate = mongoFile.getCreateddate();
        this.id = mongoFile.getId();
        List<FileInfo> fileInfoList = new ArrayList<>();
        for(MongoFileInfo info : mongoFile.getFileInfo()){
            fileInfoList.add(new FileInfo(info));
        }
        this.fileInfoList = fileInfoList;
        this.documentName = mongoFile.getDocumentName();
        switch (mongoFile.getDocumentStatus()){
            case UPLOADED:
                this.documentStatus = DocumentStatus.UPLOADED;
            case DIGITIZED:
                this.documentStatus = DocumentStatus.DIGITIZED;
            case PROCESSED:
                this.documentStatus = DocumentStatus.PROCESSED;
            case CLASSIFIED:
                this.documentStatus = DocumentStatus.CLASSIFIED;
            case TEXTRACTED:
                this.documentStatus = DocumentStatus.TEXTRACTED;
            case UPLOAD_FAIL:
                this.documentStatus = DocumentStatus.UPLOAD_FAIL;
            case PROCESS_FAIL:
                this.documentStatus = DocumentStatus.PROCESS_FAIL;
            case TEXTRACT_FAIL:
                this.documentStatus = DocumentStatus.TEXTRACT_FAIL;
            case NOT_CLASSIFIED:
                this.documentStatus = DocumentStatus.NOT_CLASSIFIED;
        }
        switch (mongoFile.getFiletype()){
            case Bill:
                this.filetype = FileType.Bill;
            case Spam:
                this.filetype = FileType.Spam;
            case Allergy:
                this.filetype = FileType.Allergy;
            case LabTest:
                this.filetype = FileType.LabTest;
            case Insurance:
                this.filetype = FileType.Insurance;
            case Medication:
                this.filetype = FileType.Medication;
            case HealthCheck:
                this.filetype = FileType.HealthCheck;
            case Restriction:
                this.filetype = FileType.Restriction;
            case Consultation:
                this.filetype = FileType.Consultation;
            case Immunization:
                this.filetype = FileType.Immunization;
            case Prescription:
                this.filetype = FileType.Prescription;
            case UnIdentified:
                this.filetype = FileType.UnIdentified;
            case FamilyHistory:
                this.filetype = FileType.FamilyHistory;
            case Hospitalization:
                this.filetype = FileType.Hospitalization;
            case MedicalCondition:
                this.filetype = FileType.MedicalCondition;
        }
        this.filetypeid = mongoFile.getFiletypeid();
        this.isClinicalDocument = mongoFile.getIsClinicalDocument();
        this.lastmodifieddate = mongoFile.getLastmodifieddate();
        this.mobileNumber = mongoFile.getMobileNumber();
        this.parentFolder = mongoFile.getParentFolder();
        this.source = mongoFile.getSource();
        this.uhid = mongoFile.getUhid();
        this.uploadedVia = mongoFile.getUploadedVia();
    }
    public File(DBFile mongoFile){
        this.brandName = mongoFile.getBrandName();
        this.createddate = mongoFile.getCreateddate();
        this.id = mongoFile.getId();
        List<FileInfo> fileInfoList = new ArrayList<>();
        for(DBFileInfo info : mongoFile.getFileInfoList()){
            fileInfoList.add(new FileInfo(info));
        }
        this.fileInfoList = fileInfoList;
        this.documentName = mongoFile.getDocumentName();
        if(mongoFile.getDocumentStatus()!=null) {
	        switch (mongoFile.getDocumentStatus()){
	            case UPLOADED:
	                this.documentStatus = DocumentStatus.UPLOADED;
	            case DIGITIZED:
	                this.documentStatus = DocumentStatus.DIGITIZED;
	            case PROCESSED:
	                this.documentStatus = DocumentStatus.PROCESSED;
	            case CLASSIFIED:
	                this.documentStatus = DocumentStatus.CLASSIFIED;
	            case TEXTRACTED:
	                this.documentStatus = DocumentStatus.TEXTRACTED;
	            case UPLOAD_FAIL:
	                this.documentStatus = DocumentStatus.UPLOAD_FAIL;
	            case PROCESS_FAIL:
	                this.documentStatus = DocumentStatus.PROCESS_FAIL;
	            case TEXTRACT_FAIL:
	                this.documentStatus = DocumentStatus.TEXTRACT_FAIL;
	            case NOT_CLASSIFIED:
	                this.documentStatus = DocumentStatus.NOT_CLASSIFIED;
	        }
        }
        if(mongoFile.getFileType()!=null) {
	        switch (mongoFile.getFileType()){
	            case Bill:
	                this.filetype = FileType.Bill;
	            case Spam:
	                this.filetype = FileType.Spam;
	            case Allergy:
	                this.filetype = FileType.Allergy;
	            case LabTest:
	                this.filetype = FileType.LabTest;
	            case Insurance:
	                this.filetype = FileType.Insurance;
	            case Medication:
	                this.filetype = FileType.Medication;
	            case HealthCheck:
	                this.filetype = FileType.HealthCheck;
	            case Restriction:
	                this.filetype = FileType.Restriction;
	            case Consultation:
	                this.filetype = FileType.Consultation;
	            case Immunization:
	                this.filetype = FileType.Immunization;
	            case Prescription:
	                this.filetype = FileType.Prescription;
	            case UnIdentified:
	                this.filetype = FileType.UnIdentified;
	            case FamilyHistory:
	                this.filetype = FileType.FamilyHistory;
	            case Hospitalization:
	                this.filetype = FileType.Hospitalization;
	            case MedicalCondition:
	                this.filetype = FileType.MedicalCondition;
	        }
        }
        this.filetypeid = mongoFile.getFileTypeId();
        this.isClinicalDocument = mongoFile.isClinicalDocument();
        this.lastmodifieddate = mongoFile.getLastmodifieddate();
        this.mobileNumber = mongoFile.getMobileNumber();
        this.parentFolder = mongoFile.getParentFolder();
        this.source = mongoFile.getSource();
        this.uhid = mongoFile.getUhid();
        this.uploadedVia = mongoFile.getUploadedVia();
    }
}
