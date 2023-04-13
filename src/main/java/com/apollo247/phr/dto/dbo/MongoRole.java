package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;


public class MongoRole extends DTO{
    private ObjectId id;

    private String roleName;
    private List<MongoFeature> features = new ArrayList<>();
    private List<String> sites = new ArrayList<>();

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<MongoFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<MongoFeature> features) {
        this.features = features;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }
}
