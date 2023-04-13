package src.main.java.com.apollo247.phr.dto.dbo;

import com.slh.uno.dbo.DBAttachement;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoAttachment extends DTO {

    private ObjectId id = new ObjectId();
    private String fileName;
    private Date dateCreated;
    private String mimeType; // can change to enum latter
    private ObjectId fileAttached;
    private String ocrData;
    private Date reqRaisedDate;
    private Date sysDateTime;
    private String azurePath;
    private Date uploadDateAtSource;
    private String firstName;

	public Date getUploadDateAtSource() {
		return uploadDateAtSource;
	}

	public void setUploadDateAtSource(Date uploadDateAtSource) {
		this.uploadDateAtSource = uploadDateAtSource;
	}

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public ObjectId getFileAttached() {
        return fileAttached;
    }

    public void setFileAttached(ObjectId fileAttached) {
        this.fileAttached = fileAttached;
    }

    public String getOcrData() {
        return ocrData;
    }

    public void setOcrData(String ocrData) {
        this.ocrData = ocrData;
    }

    public Date getReqRaisedDate() {
        return reqRaisedDate;
    }

    public void setReqRaisedDate(Date reqRaisedDate) {
        this.reqRaisedDate = reqRaisedDate;
    }

    public Date getSysDateTime() {
        return sysDateTime;
    }

    public void setSysDateTime(Date sysDateTime) {
        this.sysDateTime = sysDateTime;
    }

    public String getAzurePath() {
        return azurePath;
    }

    public void setAzurePath(String azurePath) {
        this.azurePath = azurePath;
    }
    public static MongoAttachment fromDBAttachment(DBAttachement attach) {
		MongoAttachment file = new MongoAttachment();
		file.setFileName(attach.getFileName());
		file.setMimeType(attach.getMimeType());
//		file.setId(new ObjectId(attach.getFileAttached().toString()));
		file.setAzurePath(attach.getAzurePath());
		file.setDateCreated(attach.getDateCreated());
		file.setFileAttached(attach.getFileAttached());
		return file;
	}
    public static List<MongoAttachment> fromDBAttachments(List<DBAttachement> attachments) {
    	List<MongoAttachment> mongoattachs = new ArrayList<>();
    	for(DBAttachement attach : attachments) {
    		mongoattachs.add(fromDBAttachment(attach));
    	}
    	return mongoattachs;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
