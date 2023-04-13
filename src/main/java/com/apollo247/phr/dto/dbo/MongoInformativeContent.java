package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;

public class MongoInformativeContent {
    private String title;
    private String desc;
    private String identifier;
    private List<RelatedFAQ> content;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<RelatedFAQ> getContent() {
        return content;
    }

    public void setContent(List<RelatedFAQ> content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String description) {
        this.desc = description;
    }

    public List<RelatedFAQ> getRelatedFAQ() {
        return content;
    }

    public void setRelatedFAQ(List<RelatedFAQ> relatedFAQ) {
        this.content = relatedFAQ;
    }
}
