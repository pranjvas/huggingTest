package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.Date;


public class DBAttachement {
	
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
	public enum MimeType {
		image, text, audio, UNKNOWN
	}

	public ObjectId getId() {
		return id;
	}
	
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setFileAttached(ObjectId fileAttached) {
		this.fileAttached = fileAttached;
	}
	
	public ObjectId getFileAttached() {
		return fileAttached;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
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
	
	public Date getUploadDateAtSource() {
		return uploadDateAtSource;
	}

	public void setUploadDateAtSource(Date uploadDateAtSource) {
		this.uploadDateAtSource = uploadDateAtSource;
	}

//	public static DBFile toDBFile(DBAttachement attach) {
//		DBFile file = new DBFile();
//		file.setClinicalDocument(false);
//		file.setCreateddate(attach.getDateCreated());
//		DBFileInfo info = new DBFileInfo();
//		info.setId(new ObjectId(attach.getFileAttached().toString()));
//		info.setFileName(attach.getFileName());
//		info.setMimeType(attach.getMimeType());
//		info.setFile_location(attach.getAzurePath());
//		file.getFileInfoList().add(info);
//
//		return file;
//	}
	
	
}