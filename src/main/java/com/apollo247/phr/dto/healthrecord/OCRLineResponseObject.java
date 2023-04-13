package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OCRLineResponseObject implements UIPojo {
	
    private String text;
    private OCRLineCoordinates coordinates;
    public List<OCRLineRecommendation> recommendations;
    public OCRLineCoordinates getCoordinates() {
        return this.coordinates;
    }
    public void setCoordinates(OCRLineCoordinates coordinates) {
        this.coordinates = coordinates;
    }
    public List<OCRLineRecommendation> getRecommendations() {
        return this.recommendations;
    }
    public void setRecommendations(List<OCRLineRecommendation> recommendations) {
        this.recommendations = recommendations;
    }
    public void addRecommendations(OCRLineRecommendation recommendation) {
        if (this.recommendations==null) {
            this.recommendations = new ArrayList<>();
        }
        this.recommendations.add(recommendation);
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}