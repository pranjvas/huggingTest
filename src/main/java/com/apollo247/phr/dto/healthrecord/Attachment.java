package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.codec.net.URLCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attachment implements UIPojo {

	private static final Logger log = LoggerFactory.getLogger(Attachment.class);

	private String id;
	private String fileName;
	private String mimeType;	
	private String content;
	private byte[] byteContent;
	private long dateCreated;
	private String azurePath;
	private String fileAttached;
	private String downloadUrl;

	public long getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getFileName() {
		try {
			return new URLCodec().encode(fileName);
		} catch (Exception e) {
			log.error("error while encoding filename {} to url compatible format: {}", fileName, e.getMessage());
			int index = fileName.lastIndexOf('.');
			String ext = (index != -1) ? fileName.substring(index) : "";
			return String.format("HealthRecord%s", ext);
		}
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public byte[] getByteContent() {
		return byteContent;
	}
	public void setByteContent(byte[] byteContent) {
		this.byteContent = byteContent;
	}
	public String getAzurePath() {
		return azurePath;
	}
	public void setAzurePath(String azurePath) {
		this.azurePath = azurePath;
	}
	public String getFileAttached() {
		return fileAttached;
	}
	public void setFileAttached(String fileAttached) {
		this.fileAttached = fileAttached;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFile_Url() {
		return downloadUrl;
	}
	public void setFile_Url(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	@Override
	public boolean equals(Object o) {
		return this.toString().equals(o.toString());
	}
	
}