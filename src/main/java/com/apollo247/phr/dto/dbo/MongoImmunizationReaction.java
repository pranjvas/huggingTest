package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.Date;

public class MongoImmunizationReaction extends DTO{
    private String type;
    private Date from;
    private Date to;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
