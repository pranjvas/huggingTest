package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;

public class MongoConsultationRecord {

    private String uhid;
    private List<MongoConsultationView> consultations;

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public List<MongoConsultationView> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<MongoConsultationView> consultations) {
        this.consultations = consultations;
    }
}
