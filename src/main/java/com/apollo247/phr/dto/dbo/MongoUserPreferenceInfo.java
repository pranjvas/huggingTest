package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.List;

public class MongoUserPreferenceInfo extends DTO {
    public static final String ID = "_id";
    public static final String SMS_ALERT = "smsAlert";
    public static final String EMAIL_ALERT = "emailAlert";
    public static final String DASHBOARD_TOOL_LIST = "dashboardToolList";
    public static final String WIDGET_LIST = "widgetList";

    private ObjectId id = new ObjectId();
    private String smsAlert;
    private String emailAlert;
    private List<String> dashboardToolList;
    private List<MongoWidget> widgetList;
    private String firstName;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSmsAlert() {
        return smsAlert;
    }

    public void setSmsAlert(String smsAlert) {
        this.smsAlert = smsAlert;
    }

    public String getEmailAlert() {
        return emailAlert;
    }

    public void setEmailAlert(String emailAlert) {
        this.emailAlert = emailAlert;
    }

    public List<String> getDashboardToolList() {
        return dashboardToolList;
    }

    public void setDashboardToolList(List<String> dashboardToolList) {
        this.dashboardToolList = dashboardToolList;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<MongoWidget> getWidgetList() {
        return widgetList;
    }

    public void setWidgetList(List<MongoWidget> widgetList) {
        this.widgetList = widgetList;
    }
}
