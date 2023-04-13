package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

public class MongoLinkedAccount {

    private ObjectId id;
    private String linkedUhId;
    private String relationship;
    private CustomDBRef dbUser;
    private CustomDBRef linkedDBUser;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getLinkedUhId() {
        return linkedUhId;
    }

    public void setLinkedUhId(String linkedUhId) {
        this.linkedUhId = linkedUhId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public CustomDBRef getDbUser() {
        return dbUser;
    }

    public void setDbUser(CustomDBRef dbUser) {
        this.dbUser = dbUser;
    }

    public CustomDBRef getLinkedDBUser() {
        return linkedDBUser;
    }

    public void setLinkedDBUser(CustomDBRef linkedDBUser) {
        this.linkedDBUser = linkedDBUser;
    }
}
