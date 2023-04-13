package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.slh.uno.dbo.DBFileInfo;
import com.slh.uno.dbo.pojo.MongoFileInfo;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileInfo implements UIPojo {

	private String id;
	private String fileStatus;
	private String locationtype;
	private String file_location;
	private String fileName;
	private String mimeType;
	private String content;
	private byte[] byteContent;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	public String getLocationtype() {
		return locationtype;
	}
	public void setLocationtype(String locationtype) {
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
	public FileInfo (MongoFileInfo mongoFileInfo){
		this.file_location = mongoFileInfo.getFile_location();
		this.id = String.valueOf(mongoFileInfo.getId());
		this.byteContent = mongoFileInfo.getByteContent();
		this.content = mongoFileInfo.getContent();
		this.fileName = mongoFileInfo.getFileName();
		this.fileStatus = String.valueOf(mongoFileInfo.getFileStatus());
		this.locationtype = String.valueOf(mongoFileInfo.getLocationtype());
		this.mimeType = mongoFileInfo.getMimeType();
	}

	public FileInfo(Attachment attachment) {
		this.fileName = attachment.getFileName();
		this.byteContent = attachment.getByteContent();
		this.content = attachment.getContent();
		this.mimeType = attachment.getMimeType();
	}

	public FileInfo (DBFileInfo mongoFileInfo){
		this.file_location = mongoFileInfo.getFile_location();
		this.id = String.valueOf(mongoFileInfo.getId());
		this.byteContent = mongoFileInfo.getByteContent();
		this.content = mongoFileInfo.getContent();
		this.fileName = mongoFileInfo.getFileName();
		this.fileStatus = String.valueOf(mongoFileInfo.getFileStatus());
		this.locationtype = String.valueOf(mongoFileInfo.getLocationtype());
		this.mimeType = mongoFileInfo.getMimeType();
	}
	public FileInfo(){
		// default constructor
	}
	
}
