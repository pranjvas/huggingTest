package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class MongoUserContactInfo extends DTO {
    public static final String ID = "_id";
    public static final String ADDRESS_LINE_1 = "addressLine1";
    public static final String ADDRESS_LINE_2 = "addressLine2";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String COUNTRY = "country";
    public static final String PINCODE = "pincode";
    public static final String PHONE_1 = "phone1";
    public static final String PHONE_2 = "phone2";
    public static final String PHONE_3 = "phone3";
    public static final String EMAIL_1 = "email1";
    public static final String EMAIL_2 = "email2";
    public static final String PRIMARY_CARE_PHYSICIAL_LIST = "primaryCarePhysicialList";
    public static final String EMERGENCY_CONTACT_LIST = "emergencyContactList";

    private ObjectId id = new ObjectId();
    private String firstName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private Integer pincode;
    private String phone1;
    private String phone2;
    private String phone3;
    private String email1;
    private String email2;
    private List<MongoPrimaryCarePhysician> primaryCarePhysicialList = new ArrayList<>();
    private List<MongoEmergencyContact> emergencyContactList = new ArrayList<>();

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public List<MongoPrimaryCarePhysician> getPrimaryCarePhysicialList() {
        return primaryCarePhysicialList;
    }

    public void setPrimaryCarePhysicialList(List<MongoPrimaryCarePhysician> primaryCarePhysicialList) {
        this.primaryCarePhysicialList = primaryCarePhysicialList;
    }

    public List<MongoEmergencyContact> getEmergencyContactList() {
        return emergencyContactList;
    }

    public void setEmergencyContactList(List<MongoEmergencyContact> emergencyContactList) {
        this.emergencyContactList = emergencyContactList;
    }
}
