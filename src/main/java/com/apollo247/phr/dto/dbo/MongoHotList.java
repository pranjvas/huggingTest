package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

public class MongoHotList {
    private ObjectId id;

    private String mobileNumber;
    private String itemName;
    private String sku;
    private boolean offline;
    private String billId;
    private boolean hotlist;
    private int rank;

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public boolean isHotlist() {
        return hotlist;
    }

    public void setHotlist(boolean hotlist) {
        this.hotlist = hotlist;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
