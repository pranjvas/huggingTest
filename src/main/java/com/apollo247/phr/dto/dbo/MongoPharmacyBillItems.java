package src.main.java.com.apollo247.phr.dto.dbo;


public class MongoPharmacyBillItems {
    private double mrp;
    private double totalmrp;
    private double discamt;
    private double giftamt;
    private String itemid;
    private int saleqty;
    private String item_name;

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public double getTotalmrp() {
        return totalmrp;
    }

    public void setTotalmrp(double totalmrp) {
        this.totalmrp = totalmrp;
    }

    public double getDiscamt() {
        return discamt;
    }

    public void setDiscamt(double discamt) {
        this.discamt = discamt;
    }

    public double getGiftamt() {
        return giftamt;
    }

    public void setGiftamt(double giftamt) {
        this.giftamt = giftamt;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getSaleqty() {
        return saleqty;
    }

    public void setSaleqty(int saleqty) {
        this.saleqty = saleqty;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
}

