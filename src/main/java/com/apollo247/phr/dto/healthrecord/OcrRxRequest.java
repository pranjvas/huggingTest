package src.main.java.com.apollo247.phr.dto.healthrecord;

public class OcrRxRequest { 
	private String id; 
	private String type; 
	private String collection;
	
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getid() { 
		return id; 
	} 
	public void setid(String smartscanid) { 
		this.id = smartscanid; 
	} 
	public String getType() { 
		return type; 
	} 
	public void setType(String type) { 
		this.type = type; 
	} 
}