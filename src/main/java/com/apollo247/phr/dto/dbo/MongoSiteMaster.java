package src.main.java.com.apollo247.phr.dto.dbo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;

public class MongoSiteMaster {
    private ObjectId id;
    @JsonProperty("siteName")
    private String siteName;
     private String siteKey;
     private String siteType;
     private String testBlackList;
     private String hcuBlackList;
     private String shortName;
     private String address;
     private String city;
     private String uhidPrefix;
     private String locationId;
     private boolean debug;
     private boolean sms;
     private String siteDisplayName;
     private String entityName;
     private String siteSupportId;

 public ObjectId getId() {
  return id;
 }

 public void setId(ObjectId id) {
  this.id = id;
 }

 public String getSiteName() {
  return siteName;
 }

 public void setSiteName(String siteName) {
  this.siteName = siteName;
 }

 public String getSiteKey() {
  return siteKey;
 }

 public void setSiteKey(String siteKey) {
  this.siteKey = siteKey;
 }

 public String getSiteType() {
  return siteType;
 }

 public void setSiteType(String siteType) {
  this.siteType = siteType;
 }

 public String getTestBlackList() {
  return testBlackList;
 }

 public void setTestBlackList(String testBlackList) {
  this.testBlackList = testBlackList;
 }

 public String getHcuBlackList() {
  return hcuBlackList;
 }

 public void setHcuBlackList(String hcuBlackList) {
  this.hcuBlackList = hcuBlackList;
 }

 public String getShortName() {
  return shortName;
 }

 public void setShortName(String shortName) {
  this.shortName = shortName;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }

 public String getUhidPrefix() {
  return uhidPrefix;
 }

 public void setUhidPrefix(String uhidPrefix) {
  this.uhidPrefix = uhidPrefix;
 }

 public String getLocationId() {
  return locationId;
 }

 public void setLocationId(String locationId) {
  this.locationId = locationId;
 }

 public boolean isDebug() {
  return debug;
 }

 public void setDebug(boolean debug) {
  this.debug = debug;
 }

 public boolean isSms() {
  return sms;
 }

 public void setSms(boolean sms) {
  this.sms = sms;
 }

 public String getSiteDisplayName() {
  return siteDisplayName;
 }

 public void setSiteDisplayName(String siteDisplayName) {
  this.siteDisplayName = siteDisplayName;
 }

 public String getEntityName() {
  return entityName;
 }

 public void setEntityName(String entityName) {
  this.entityName = entityName;
 }

 public String getSiteSupportId() {
  return siteSupportId;
 }

 public void setSiteSupportId(String siteSupportId) {
  this.siteSupportId = siteSupportId;
 }
}
