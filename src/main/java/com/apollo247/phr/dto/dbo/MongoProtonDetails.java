package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoProtonDetails extends DTO {
    public static final String ID = "_id";
    public static final String STATUS = "status";
    public static final String ACTIVITY_DATE = "activityDate";
    public static final String IS_MESSAGE_REPLIED = "isMessageReplyed";
    public static final String UPLOAD_FILE = "uploadFile";
    public static final String MESSAGE = "message";
    public static final String USER_NAME = "userName";
    public static final String UHID = "uhid";
    public static final String CHECK_LIST = "checkList";
    public static final String CHECK_LIST_TYPE = "checkListType";
    public static final String UNREAD_MSGS = "unreadMsgs";
    public static final String VERSION = "version";

    private ObjectId id;
    public enum ProtonStatus {
        ACTIVE,
        INACTIVE,
        TERMINATED,
        NOT_ACTIVATED,
    }
    private ProtonStatus status;
    private Date activityDate;
    private Boolean isMessageReplyed;
    private ObjectId userId;
    private List<ObjectId> uploadFile = new ArrayList<>();
    private List<ObjectId> message = new ArrayList<>();
    private String userName;
    private String uhid;
    private MongoIntCheckList checkList;
    private String checkListType;
    private String unreadMsgs;
    private String firstName;
    long version;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ProtonStatus getStatus() {
        return status;
    }

    public void setStatus(ProtonStatus status) {
        this.status = status;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Boolean getMessageReplyed() {
        return isMessageReplyed;
    }

    public void setMessageReplyed(Boolean messageReplyed) {
        isMessageReplyed = messageReplyed;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public List<ObjectId> getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(List<ObjectId> uploadFile) {
        this.uploadFile = uploadFile;
    }

    public List<ObjectId> getMessage() {
        return message;
    }

    public void setMessage(List<ObjectId> message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public MongoIntCheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(MongoIntCheckList checkList) {
        this.checkList = checkList;
    }

    public String getCheckListType() {
        return checkListType;
    }

    public void setCheckListType(String checkListType) {
        this.checkListType = checkListType;
    }

    public String getUnreadMsgs() {
        return unreadMsgs;
    }

    public void setUnreadMsgs(String unreadMsgs) {
        this.unreadMsgs = unreadMsgs;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
