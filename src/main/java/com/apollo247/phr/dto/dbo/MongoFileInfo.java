package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

public class MongoFileInfo {

    public enum FileStatus {
        STORED_TO_AZURE,
        ERROR_OCCURRED
    }

    public enum FileLocationType {
        AZURE, MONGO
    }


    ObjectId id = new ObjectId();

    private FileStatus fileStatus; // Gives each page/file status if there is multiple pages/files
    private FileLocationType locationtype; // <- Azure or Mongo [Or S3 in future?]
    private String file_location;
    private String fileName;
    private String mimeType;
    private String content;
    private byte[] byteContent;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public FileStatus getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(FileStatus fileStatus) {
        this.fileStatus = fileStatus;
    }

    public FileLocationType getLocationtype() {
        return locationtype;
    }

    public void setLocationtype(FileLocationType locationtype) {
        this.locationtype = locationtype;
    }

    public String getFile_location() {
        return file_location;
    }

    public void setFile_location(String file_location) {
        this.file_location = file_location;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getByteContent() {
        return byteContent;
    }

    public void setByteContent(byte[] byteContent) {
        this.byteContent = byteContent;
    }


}