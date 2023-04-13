package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class DTO {

    private String uhid;
    public void setId(ObjectId id) {

    }

    public ObjectId getId() {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if(o == null || getId() == null) return false;
        return getId().equals(((DTO) o).getId());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    public void setFirstName(String firstName) {
        
    }

    public String getFirstName() {
        return null;
    }

    public String getUhid() {
        return this.uhid;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getMobileNumber() {
        return null;
    }

    public void setMobileNumber(String mobileNumber) {

    }

    public List<MongoAttachment> fetchFiles() {
        return null;
    }

    public void assignFiles(List<MongoAttachment> files) {

    }

    public Boolean getIsClinicalDocument() {
        return null;
    }

    public void setDocumentName(String documentName) {

    }

    public String getDocumentName() {
        return null;
    }

    public void setIsClinicalDocument(Boolean isClinicalDocument) {
    }

    public String getBrandName() {
        return null;
    }

    public void setBrandName(String brandName) { }

    public void setUpdatedDateTime(Date date) {

    }

    public Date getUpdatedDateTime() {
        return null;
    }

    public void setCreatedDateTime(Date date) {

    }

    public Date getCreatedDateTime() {
        return null;
    }

    public void addFiles(List<MongoAttachment> files) {
        if(files == null) return;
        if(fetchFiles() == null) assignFiles(new ArrayList<>());
        fetchFiles().addAll(files);
    }

}
