package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;

public class MongoMedicationView {

    private String icon;
    private String name;
    private String instructions;
    private List<Integer> timings;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Integer> getTimings() {
        return timings;
    }

    public void setTimings(List<Integer> timings) {
        this.timings = timings;
    }
}
