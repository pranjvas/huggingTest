package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.Date;

public class MongoUserBasicInfo extends DTO {
    public static final String ID = "_id";
    public static final String DATE_OF_BIRTH = "dateOfBirth";
    public static final String AGE = "age";
    public static final String SEX = "sex";
    public static final String BLOOD_GROUP = "bloodGroup";
    public static final String MARTIAL_STATUS = "martialStatus";
    public static final String DIABETES_REGIMEN = "diabetesRegimen";
    public static final String EDOC_REFERENCE_ID = "edocReferenceId";
    public static final String EMPLOYEE_ID = "employeeId";
    public static final String EMPLOYEE_STATUS = "employeeStatus";
    public static final String GROUP_NAME = "groupName";
    public static final String ENTITY_USER_TYPE = "entityUserType";

    private ObjectId id = new ObjectId();
    private Date dateOfBirth;
    private Integer age;
    private String sex;
    private String bloodGroup;    // got from master data
    private String martialStatus; // got from master data
    private String diabetesRegimen;
    private String edocReferenceId;
    private String employeeId;
    private String employeeStatus;
    private String groupName;
    private String entityUserType;
    private String firstName;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getDiabetesRegimen() {
        return diabetesRegimen;
    }

    public void setDiabetesRegimen(String diabetesRegimen) {
        this.diabetesRegimen = diabetesRegimen;
    }

    public String getEdocReferenceId() {
        return edocReferenceId;
    }

    public void setEdocReferenceId(String edocReferenceId) {
        this.edocReferenceId = edocReferenceId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getEntityUserType() {
        return entityUserType;
    }

    public void setEntityUserType(String entityUserType) {
        this.entityUserType = entityUserType;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
