package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MongoPharmacyBills extends DTO{
    private ObjectId id;
    private Date billdatetime;
    private String customer_name;
    private String mobileno;
    private String partner_tracking;
    private String bill_no;
    private String site_id;
    private String partner_id;
    private String site_name;
    private String site_location;
    private String state;
    private String city;
    private String region;
    private String address;
    private Boolean hide;
    private List<MongoPharmacyBillItems> lineItems = new ArrayList<>();

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getBilldatetime() {
        return billdatetime;
    }

    public void setBilldatetime(Date billdatetime) {
        this.billdatetime = billdatetime;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPartner_tracking() {
        return partner_tracking;
    }

    public void setPartner_tracking(String partner_tracking) {
        this.partner_tracking = partner_tracking;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getSite_location() {
        return site_location;
    }

    public void setSite_location(String site_location) {
        this.site_location = site_location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MongoPharmacyBillItems> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<MongoPharmacyBillItems> lineItems) {
        this.lineItems = lineItems;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }
}