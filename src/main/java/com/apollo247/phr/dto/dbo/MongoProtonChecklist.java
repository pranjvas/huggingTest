package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

public class MongoProtonChecklist {
	private ObjectId id;
	

	private String name;
	private boolean checked;

	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
}