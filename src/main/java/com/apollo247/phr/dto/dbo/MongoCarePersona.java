package src.main.java.com.apollo247.phr.dto.dbo;


import org.bson.types.ObjectId;

import java.util.Date;

public class MongoCarePersona extends DTO{
    private ObjectId id;
    
    private String mobileNumber;
    
    private Date dateOfPrescription;
    
    private String prescribedBy;
    
    private Date createdDateTime;
    
    private String orderId;
    
    private String shopId;
    
    private String prescribedById;
    private CustomDBRef prescription = null;
    MongoCustomerDetails customerDetails;



    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getDateOfPrescription() {
        return dateOfPrescription;
    }

    public void setDateOfPrescription(Date dateOfPrescription) {
        this.dateOfPrescription = dateOfPrescription;
    }

    public String getPrescribedBy() {
        return prescribedBy;
    }

    public void setPrescribedBy(String prescribedBy) {
        this.prescribedBy = prescribedBy;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPrescribedById() {
        return prescribedById;
    }

    public void setPrescribedById(String prescribedById) {
        this.prescribedById = prescribedById;
    }

    public MongoCustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(MongoCustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public CustomDBRef getPrescription() {
        return prescription;
    }

    public void setPrescription(CustomDBRef prescription) {
        this.prescription = prescription;
    }

}
