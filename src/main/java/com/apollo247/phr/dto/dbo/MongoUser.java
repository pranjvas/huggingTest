package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MongoUser extends DTO {
    public static final String ID = "_id";
    public static final String SALUTATION = "salutation";
    public static final String FIRST_NAME = "firstName";
    public static final String MIDDLE_NAME = "middleName";
    public static final String LAST_NAME = "lastName";
    public static final String STATUS = "status";
    public static final String DATE_ACTIVATED = "dateActivated";
    public static final String UPDATED_AT = "updatedAt";
    public static final String DEFAULT_ENTITY = "defaultEntity";
    public static final String USER_CREATION_ROLE_NAME = "userCreationRoleName";
    public static final String CORPORATE_NAME = "corporateName";
    public static final String MOBILE_NUMBER = "mobileNumber";
    public static final String DATE_IMPORTED = "dateImported";
    public static final String HEALTH_CHECK_DELAY_SMS_SENT = "healthCheckDelaySMSSent";
    public static final String AADHAR_NUMBER = "aadharNumber";
    public static final String LICENSE = "license";
    public static final String PAN_CARD = "panCard";
    public static final String UPDATED_IDENTITY_OBJECT = "updatedIdentityObject";
    public static final String VERSION = "version";
    public static final String USER_BASIC_INFO = "userBasicInfo";
    public static final String USER_CONTACT_INFO = "userContactInfo";

    private ObjectId id;

    public enum UserStatus {
        ACTIVE,
        INACTIVE,
        TERMINATED,
        NOT_ACTIVATED,
        CARE_GIVER
    }

    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private UserStatus status;
    private Date dateActivated;
    private Date updatedAt;
    private String defaultEntity;
    private String userCreationRoleName;
    private String corporateName;
    private String mobileNumber;
    private Date dateImported;
    private Date healthCheckDelaySMSSent;
    private String aadharNumber;
    private String license;
    private String panCard;
    private Boolean updateIdentityObject;
    long version;
    private MongoUserBasicInfo userBasicInfo;
    private MongoUserContactInfo userContactInfo;
    private MongoUserPreferenceInfo userPreferenceInfo;
    private List<String> entitys;
    private List<String> roles;
    private List<CustomDBRef> addressList;
    private String uhid;
    private String primaryUhid;

    private CustomDBRef protondetails;
    private List<CustomDBRef> circles;
    private List<CustomDBRef> sugarInfo;
    private List<CustomDBRef> allergy;  // This should be set / key to hold uniqueness
    private List<CustomDBRef> medicalImage;
    private List<CustomDBRef> medicalFile;
    private List<CustomDBRef> immunizations;
    private List<CustomDBRef> labtests;
    private List<CustomDBRef> cardiacRiskScores;
    private List<CustomDBRef> medications;
    private List<CustomDBRef> medicationTaken;
    private List<CustomDBRef> sleepPattern;
    private List<CustomDBRef> dairyDetails;
    private List<CustomDBRef> problems;
    private List<CustomDBRef> procedures;
    private List<CustomDBRef> prescriptions;
    private List<CustomDBRef> appointments;
    private List<CustomDBRef> restrictions;
    private List<CustomDBRef> doctorVisits;
    private List<CustomDBRef> hospitilization;
    private List<CustomDBRef> insurance;
    private List<CustomDBRef> medicalCondition;
    private Map<String, CustomDBRef> toolsMap;
    private List<CustomDBRef> hospitals;
    private List<CustomDBRef> doctors;
    private List<CustomDBRef> reminders;
    private List<CustomDBRef> expertChats;
    private List<CustomDBRef> hraTests;
    private List<CustomDBRef> healthChecks;
    private List<CustomDBRef> bills;
    private List<CustomDBRef> consultations;
    private List<CustomDBRef> familyHistorys;
    private List<CustomDBRef> callInfo;
    private List<CustomDBRef> homeHealth;
    private CustomDBRef dietPlan;
    private CustomDBRef proHealth;
    private List<CustomDBRef> clinicalDocuments;

    private Date createdAtSource;
    private Date updatedAtSource;
    private String healthId;
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Date getDateActivated() {
        return dateActivated;
    }

    public void setDateActivated(Date dateActivated) {
        this.dateActivated = dateActivated;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDefaultEntity() {
        return defaultEntity;
    }

    public void setDefaultEntity(String defaultEntity) {
        this.defaultEntity = defaultEntity;
    }

    public String getUserCreationRoleName() {
        return userCreationRoleName;
    }

    public void setUserCreationRoleName(String userCreationRoleName) {
        this.userCreationRoleName = userCreationRoleName;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getDateImported() {
        return dateImported;
    }

    public void setDateImported(Date dateImported) {
        this.dateImported = dateImported;
    }

    public Date getHealthCheckDelaySMSSent() {
        return healthCheckDelaySMSSent;
    }

    public void setHealthCheckDelaySMSSent(Date healthCheckDelaySMSSent) {
        this.healthCheckDelaySMSSent = healthCheckDelaySMSSent;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public Boolean getUpdateIdentityObject() {
        return updateIdentityObject;
    }

    public void setUpdateIdentityObject(Boolean updateIdentityObject) {
        this.updateIdentityObject = updateIdentityObject;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public MongoUserBasicInfo getUserBasicInfo() {
        return userBasicInfo;
    }

    public void setUserBasicInfo(MongoUserBasicInfo userBasicInfo) {
        this.userBasicInfo = userBasicInfo;
    }

    public MongoUserContactInfo getUserContactInfo() {
        return userContactInfo;
    }

    public void setUserContactInfo(MongoUserContactInfo userContactInfo) {
        this.userContactInfo = userContactInfo;
    }

    public MongoUserPreferenceInfo getUserPreferenceInfo() {
        return userPreferenceInfo;
    }

    public void setUserPreferenceInfo(MongoUserPreferenceInfo userPreferenceInfo) {
        this.userPreferenceInfo = userPreferenceInfo;
    }

    public List<String> getEntitys() {
        return entitys;
    }

    public void setEntitys(List<String> entitys) {
        this.entitys = entitys;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<CustomDBRef> getCircles() {
        return circles;
    }

    public void setCircles(List<CustomDBRef> circles) {
        this.circles = circles;
    }

    public List<CustomDBRef> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<CustomDBRef> addressList) {
        this.addressList = addressList;
    }

    public CustomDBRef getProtondetails() {
        return protondetails;
    }

    public void setProtondetails(CustomDBRef protondetails) {
        this.protondetails = protondetails;
    }

    public List<CustomDBRef> getSugarInfo() {
        return sugarInfo;
    }

    public void setSugarInfo(List<CustomDBRef> sugarInfo) {
        this.sugarInfo = sugarInfo;
    }

    public List<CustomDBRef> getAllergy() {
        return allergy;
    }

    public void setAllergy(List<CustomDBRef> allergy) {
        this.allergy = allergy;
    }

    public List<CustomDBRef> getMedicalImage() {
        return medicalImage;
    }

    public void setMedicalImage(List<CustomDBRef> medicalImage) {
        this.medicalImage = medicalImage;
    }

    public List<CustomDBRef> getMedicalFile() {
        return medicalFile;
    }

    public void setMedicalFile(List<CustomDBRef> medicalFile) {
        this.medicalFile = medicalFile;
    }

    public List<CustomDBRef> getImmunizations() {
        return immunizations;
    }

    public void setImmunizations(List<CustomDBRef> immunizations) {
        this.immunizations = immunizations;
    }

    public List<CustomDBRef> getLabtests() {
        return labtests;
    }

    public void setLabtests(List<CustomDBRef> labtests) {
        this.labtests = labtests;
    }

    public List<CustomDBRef> getCardiacRiskScores() {
        return cardiacRiskScores;
    }

    public void setCardiacRiskScores(List<CustomDBRef> cardiacRiskScores) {
        this.cardiacRiskScores = cardiacRiskScores;
    }

    public List<CustomDBRef> getMedications() {
        return medications;
    }

    public void setMedications(List<CustomDBRef> medications) {
        this.medications = medications;
    }

    public List<CustomDBRef> getMedicationTaken() {
        return medicationTaken;
    }

    public void setMedicationTaken(List<CustomDBRef> medicationTaken) {
        this.medicationTaken = medicationTaken;
    }

    public List<CustomDBRef> getSleepPattern() {
        return sleepPattern;
    }

    public void setSleepPattern(List<CustomDBRef> sleepPattern) {
        this.sleepPattern = sleepPattern;
    }

    public List<CustomDBRef> getDairyDetails() {
        return dairyDetails;
    }

    public void setDairyDetails(List<CustomDBRef> dairyDetails) {
        this.dairyDetails = dairyDetails;
    }

    public List<CustomDBRef> getProblems() {
        return problems;
    }

    public void setProblems(List<CustomDBRef> problems) {
        this.problems = problems;
    }

    public List<CustomDBRef> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<CustomDBRef> procedures) {
        this.procedures = procedures;
    }

    public List<CustomDBRef> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<CustomDBRef> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<CustomDBRef> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<CustomDBRef> appointments) {
        this.appointments = appointments;
    }

    public List<CustomDBRef> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<CustomDBRef> restrictions) {
        this.restrictions = restrictions;
    }

    public List<CustomDBRef> getDoctorVisits() {
        return doctorVisits;
    }

    public void setDoctorVisits(List<CustomDBRef> doctorVisits) {
        this.doctorVisits = doctorVisits;
    }

    public List<CustomDBRef> getHospitilization() {
        return hospitilization;
    }

    public void setHospitilization(List<CustomDBRef> hospitilization) {
        this.hospitilization = hospitilization;
    }

    public List<CustomDBRef> getInsurance() {
        return insurance;
    }

    public void setInsurance(List<CustomDBRef> insurance) {
        this.insurance = insurance;
    }

    public List<CustomDBRef> getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(List<CustomDBRef> medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public Map<String, CustomDBRef> getToolsMap() {
        return toolsMap;
    }

    public void setToolsMap(Map<String, CustomDBRef> toolsMap) {
        this.toolsMap = toolsMap;
    }

    public List<CustomDBRef> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<CustomDBRef> hospitals) {
        this.hospitals = hospitals;
    }

    public List<CustomDBRef> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<CustomDBRef> doctors) {
        this.doctors = doctors;
    }

    public List<CustomDBRef> getReminders() {
        return reminders;
    }

    public void setReminders(List<CustomDBRef> reminders) {
        this.reminders = reminders;
    }

    public List<CustomDBRef> getExpertChats() {
        return expertChats;
    }

    public void setExpertChats(List<CustomDBRef> expertChats) {
        this.expertChats = expertChats;
    }

    public List<CustomDBRef> getHraTests() {
        return hraTests;
    }

    public void setHraTests(List<CustomDBRef> hraTests) {
        this.hraTests = hraTests;
    }

    public List<CustomDBRef> getHealthChecks() {
        return healthChecks;
    }

    public void setHealthChecks(List<CustomDBRef> healthChecks) {
        this.healthChecks = healthChecks;
    }

    public List<CustomDBRef> getBills() {
        return bills;
    }

    public void setBills(List<CustomDBRef> bills) {
        this.bills = bills;
    }

    public List<CustomDBRef> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<CustomDBRef> consultations) {
        this.consultations = consultations;
    }

    public List<CustomDBRef> getFamilyHistorys() {
        return familyHistorys;
    }

    public void setFamilyHistorys(List<CustomDBRef> familyHistorys) {
        this.familyHistorys = familyHistorys;
    }

    public List<CustomDBRef> getCallInfo() {
        return callInfo;
    }

    public void setCallInfo(List<CustomDBRef> callInfo) {
        this.callInfo = callInfo;
    }

    public List<CustomDBRef> getHomeHealth() {
        return homeHealth;
    }

    public void setHomeHealth(List<CustomDBRef> homeHealth) {
        this.homeHealth = homeHealth;
    }

    public CustomDBRef getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(CustomDBRef dietPlan) {
        this.dietPlan = dietPlan;
    }

    public CustomDBRef getProHealth() {
        return proHealth;
    }

    public void setProHealth(CustomDBRef proHealth) {
        this.proHealth = proHealth;
    }

    public List<CustomDBRef> getClinicalDocuments() {
        return clinicalDocuments;
    }

    public void setClinicalDocuments(List<CustomDBRef> clinicalDocuments) {
        this.clinicalDocuments = clinicalDocuments;
    }

    public String getUhid() {
        return uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getPrimaryUhid() {
        return primaryUhid;
    }

    public void setPrimaryUhid(String uhid) {
        this.primaryUhid = uhid;
    }

    public Date getCreatedAtSource() {
        return createdAtSource;
    }

    public void setCreatedAtSource(Date createdAtSource) {
        this.createdAtSource = createdAtSource;
    }

    public Date getUpdatedAtSource() {
        return updatedAtSource;
    }

    public void setUpdatedAtSource(Date updatedAtSource) {
        this.updatedAtSource = updatedAtSource;
    }

    public Map<Class, List<CustomDBRef>> fetchDBRefMap() {
        Map<Class, List<CustomDBRef>> dbRefMap = new HashMap<>();
        dbRefMap.put(MongoConsultation.class, this.getConsultations());
        dbRefMap.put(MongoPrescription.class, this.getPrescriptions());
        dbRefMap.put(MongoBill.class, this.getBills());
        dbRefMap.put(MongoHospitalization.class, this.getHospitilization());
        dbRefMap.put(MongoInsurance.class, this.getInsurance());
        dbRefMap.put(MongoImmunization.class, this.getImmunizations());
        return dbRefMap;
    }

	public void setHealthId(String healthId) {
		this.healthId = healthId;
	}

    public String getHealthId() {
        return healthId;
    }

}
