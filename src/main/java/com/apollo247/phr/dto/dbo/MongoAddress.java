package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

public class MongoAddress extends DTO {

    public static final String ID = "_id";
    public static final String TAG = "tag";
    public static final String DOOR_NUMBER = "doorNumber";
    public static final String BUILDING_NAME = "buildingName";
    public static final String STREET_NAME_1 = "streetName_1";
    public static final String STREET_NAME_2 = "streetName_2";
    public static final String CITY_NAME = "cityName";
    public static final String STATE_NAME = "stateName";
    public static final String COUNTRY_NAME = "countryName";
    public static final String PIN_CODE = "pinCode";

    private ObjectId id = new ObjectId();
    private String tag;          // This denotes the address type like primary, postal, official, etc
    private String doorNumber;
    private String buildingName;
    private String streetName_1;
    private String streetName_2;
    private String cityName;     // comes from CountryMaster
    private String stateName;    // comes from CountryMaster
    private String countryName;  // comes from CountryMaster
    private String pinCode;      // comes from CountryMaster
    private String firstName;
    // A phone number might be needed here -- Think again Mani


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStreetName_1() {
        return streetName_1;
    }

    public void setStreetName_1(String streetName_1) {
        this.streetName_1 = streetName_1;
    }

    public String getStreetName_2() {
        return streetName_2;
    }

    public void setStreetName_2(String streetName_2) {
        this.streetName_2 = streetName_2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
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
