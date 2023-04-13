package src.main.java.com.apollo247.phr.dto.dbo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.slh.uno.viewmodel.user.Page;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;


public class MongoFeature extends DTO{
    private ObjectId id;
    @JsonProperty("name")
    private String featureName;
    private List<MongoService> services = new ArrayList<>();
    private List<Page> pages = new ArrayList<>();

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public List<MongoService> getServices() {
        return services;
    }

    public void setServices(List<MongoService> services) {
        this.services = services;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}
