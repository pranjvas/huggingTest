package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;
import java.util.Map;

public class Symptom {
    private String name;
    private String id;

    private boolean present;

    private Map<String, List<String>> features;

    public Map<String, List<String>> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, List<String>> features) {
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

}
