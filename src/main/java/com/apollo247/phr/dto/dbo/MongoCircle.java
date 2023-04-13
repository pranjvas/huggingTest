package src.main.java.com.apollo247.phr.dto.dbo;

import com.slh.uno.dbo.DBAccessLevel;
import com.slh.uno.dbo.DBResources;
import org.bson.types.ObjectId;

import java.util.*;

public class MongoCircle extends DTO {
    public static final String ID = "_id";
    public static final String NAME = "name";
    public static final String OWNER_ID = "ownerId";
    public static final String CATEGORY = "category";
    public static final String USER_LIST = "userList";
    public static final String REMOVED_USERS = "removedUsers";
    public static final String PERMISSIONS = "permissions";
    public static final String UPDATED_AT = "updatedAt";

    private ObjectId id;
    private String name;
    private String ownerId;
    private String category;
    private List<String> userList = new ArrayList<>();
    private List<String> removedUsers = new ArrayList<>();
    private Map<DBResources, List<DBAccessLevel>> permissions = new HashMap<>();
    private Date updatedAt;
    private String firstName;

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

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public List<String> getRemovedUsers() {
        return removedUsers;
    }

    public void setRemovedUsers(List<String> removedUsers) {
        this.removedUsers = removedUsers;
    }

    public Map<DBResources, List<DBAccessLevel>> getPermissions() {
        return permissions;
    }

    public void setPermissions(Map<DBResources, List<DBAccessLevel>> permissions) {
        this.permissions = permissions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
