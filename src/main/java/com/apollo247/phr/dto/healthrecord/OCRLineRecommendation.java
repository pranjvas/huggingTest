package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OCRLineRecommendation implements UIPojo {

	private String id;
    
	private String match;
    private Integer score;
    private Integer index;
    private String itemname;
    private String recommendationrank;
    private Object variants;
	
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatch() {
		return match;
	}
	public void setMatch(String match) {
		this.match = match;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getRecommendationrank() {
		return recommendationrank;
	}
	public void setRecommendationrank(String recommendationrank) {
		this.recommendationrank = recommendationrank;
	}
	public Object getVariants() {
		return variants;
	}
	public void setVariants(Object variants) {
		this.variants = variants;
	}
    
}
