package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class MongoCorporate extends DTO{
    private ObjectId id;
    private String name;
    private String displayName;
    private String contactPerson;
    private String mobileNumber;
    private MongoCircle circle;
    private List<MongoLabPackage> exclusivePackages = new ArrayList<>();
    private List<MongoLabPackage> useralsoPackages = new ArrayList<>();

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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public MongoCircle getCircle() {
        return circle;
    }

    public void setCircle(MongoCircle circle) {
        this.circle = circle;
    }

    public List<MongoLabPackage> getExclusivePackages() {
        return exclusivePackages;
    }

    public void setExclusivePackages(List<MongoLabPackage> exclusivePackages) {
        this.exclusivePackages = exclusivePackages;
    }

    public List<MongoLabPackage> getUseralsoPackages() {
        return useralsoPackages;
    }

    public void setUseralsoPackages(List<MongoLabPackage> useralsoPackages) {
        this.useralsoPackages = useralsoPackages;
    }
}
