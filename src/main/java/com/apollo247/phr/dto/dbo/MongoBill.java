package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoBill extends DTO{

    private ObjectId id;

    private String bill_no;
    private Date billDate;
    private Date createdDateTime;
    private Date updatedDateTime;
    private String hospitalName;
    private String source;
    private String mobileNumber;
    private String notes;
    private String uhid;
    private String firstName;
    private String documentName;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private List<MongoAttachment> billFiles = new ArrayList<>();
    private List<MongoFile> fileAttachments = new ArrayList<>();

    public List<MongoAttachment> fetchFiles(){
        return billFiles;
    }

    public void assignFiles(List<MongoAttachment> files) {
        this.billFiles = files;
    }

    public List<MongoFile> getFileAttachments() {
        return fileAttachments;
    }
    public void setFileAttachments(List<MongoFile> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }
    public void addFileAttachment(MongoFile attachment) {
        this.fileAttachments.add(attachment);
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBillNo() {
        return bill_no;
    }

    public void setBillNo(String billNo) {
        this.bill_no = billNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<MongoAttachment> getBillFiles() {
        return billFiles;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreatedDatetime() {
        return createdDateTime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDateTime = createdDatetime;
    }

    public void setBillFiles(List<MongoAttachment> billFiles) {
        this.billFiles = billFiles;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setUhid(String uhid) {
        this.uhid = uhid;
    }

    public String getUhid() {
        return this.uhid;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((billDate == null) ? 0 : billDate.hashCode());
        result = prime * result + ((billFiles == null) ? 0 : billFiles.hashCode());
        result = prime * result + ((bill_no == null) ? 0 : bill_no.hashCode());
        result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
        result = prime * result + ((fileAttachments == null) ? 0 : fileAttachments.hashCode());
        result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((updatedDateTime == null) ? 0 : updatedDateTime.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MongoBill other = (MongoBill) obj;
        if (billDate == null) {
            if (other.getBillDate() != null)
                return false;
        } else if (!billDate.equals(other.getBillDate()))
            return false;
        if (billFiles == null) {
            if (other.getBillFiles() != null)
                return false;
        } else if (!billFiles.equals(other.getBillFiles()))
            return false;
        if (bill_no == null) {
            if (other.getBillNo() != null)
                return false;
        } else if (!bill_no.equals(other.getBillNo()))
            return false;
        if (createdDateTime == null) {
            if (other.getCreatedDatetime() != null)
                return false;
        } else if (!createdDateTime.equals(other.getCreatedDatetime()))
            return false;
        if (fileAttachments == null) {
            if (other.getFileAttachments() != null)
                return false;
        } else if (!fileAttachments.equals(other.getFileAttachments()))
            return false;
        if (hospitalName == null) {
            if (other.getHospitalName() != null)
                return false;
        } else if (!hospitalName.equals(other.hospitalName))
            return false;
        if (id == null) {
            if (other.getId() != null)
                return false;
        } else if (!id.equals(other.getId()))
            return false;
        if (mobileNumber == null) {
            if (other.getMobileNumber() != null)
                return false;
        } else if (!mobileNumber.equals(other.getMobileNumber()))
            return false;
        if (notes == null) {
            if (other.getNotes() != null)
                return false;
        } else if (!notes.equals(other.getNotes()))
            return false;
        if (source == null) {
            if (other.getSource() != null)
                return false;
        } else if (!source.equals(other.getSource()))
            return false;
        if (updatedDateTime == null) {
            if (other.getUpdatedDateTime() != null)
                return false;
        } else if (!updatedDateTime.equals(other.getUpdatedDateTime()))
            return false;
        return true;
    }

    public String getBill_no() {
        return bill_no;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
}
