package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.List;

import static com.apollo247.phr.utils.CollectionUtils.newNonNullArrayList;

public class MongoIntCheckList {
	private ObjectId id;

	List<MongoProtonChecklist> protonChecklist = newNonNullArrayList();

	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public List<MongoProtonChecklist> getProtonChecklist() {
		return protonChecklist;
	}
	public void setProtonChecklist(List<MongoProtonChecklist> protonChecklist) {
		this.protonChecklist = protonChecklist;
	}
	
}