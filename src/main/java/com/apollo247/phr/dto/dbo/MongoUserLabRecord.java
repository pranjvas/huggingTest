package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;

public class MongoUserLabRecord {
    private String uhid;
    private List<MongoLabTestRecord> labTests;
    private List<String> apolloSourceFilters;
    private List<String> selfUploadedSourceFilter;

    public List<String> getApolloSourceFilters() {
        return this.apolloSourceFilters;
    }

    public void setApolloSourceFilters(List<String> apolloSourceFilters) {
        this.apolloSourceFilters = apolloSourceFilters;
    }

    public List<String> getSelfUploadedSourceFilter() {
        return this.selfUploadedSourceFilter;
    }

    public void setSelfUploadedSourceFilter(List<String> selfUploadedSourceFilter) {
        this.selfUploadedSourceFilter = selfUploadedSourceFilter;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public List<MongoLabTestRecord> getLabTests() {
        return labTests;
    }

    public void setLabTests(List<MongoLabTestRecord> labTests) {
        this.labTests = labTests;
    }
}
