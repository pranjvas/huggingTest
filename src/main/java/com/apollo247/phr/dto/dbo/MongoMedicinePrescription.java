package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.ArrayList;
import java.util.List;

public class MongoMedicinePrescription{
    
    private String id;
    
    private String medicineConsumptionDuration;
    
    private String medicineConsumptionDurationInDays;
    
    private String medicineConsumptionDurationUnit;
    
    private String medicineDosage;
    
    private String medicineFormTypes;
    
    private String medicineFrequency;
    
    private String medicineInstructions;
    
    private String medicineName;
    
    private String medicineUnit;
    
    private String routeOfAdministration;
    
    private String medicineCustomDosage;
    
    private List<String> medicineTimings = new ArrayList<>();
    
    private List<String> medicineToBeTaken = new ArrayList<>();
    
    private String price;
    
    private String pack;
    
    private String qty;
    
    private String mou;
    
    private String medicineDetails;

    public String getMedicineDetails() {
		return medicineDetails;
	}

	public void setMedicineDetails(String medicineDetails) {
		this.medicineDetails = medicineDetails;
	}
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMedicineConsumptionDuration() {
        return medicineConsumptionDuration;
    }

    public void setMedicineConsumptionDuration(String medicineConsumptionDuration) {
        this.medicineConsumptionDuration = medicineConsumptionDuration;
    }

    public String getMedicineConsumptionDurationInDays() {
        return medicineConsumptionDurationInDays;
    }

    public void setMedicineConsumptionDurationInDays(String medicineConsumptionDurationInDays) {
        this.medicineConsumptionDurationInDays = medicineConsumptionDurationInDays;
    }

    public String getMedicineConsumptionDurationUnit() {
        return medicineConsumptionDurationUnit;
    }

    public void setMedicineConsumptionDurationUnit(String medicineConsumptionDurationUnit) {
        this.medicineConsumptionDurationUnit = medicineConsumptionDurationUnit;
    }

    public String getMedicineDosage() {
        return medicineDosage;
    }

    public void setMedicineDosage(String medicineDosage) {
        this.medicineDosage = medicineDosage;
    }

    public String getMedicineFormTypes() {
        return medicineFormTypes;
    }

    public void setMedicineFormTypes(String medicineFormTypes) {
        this.medicineFormTypes = medicineFormTypes;
    }

    public String getMedicineFrequency() {
        return medicineFrequency;
    }

    public void setMedicineFrequency(String medicineFrequency) {
        this.medicineFrequency = medicineFrequency;
    }

    public String getMedicineInstructions() {
        return medicineInstructions;
    }

    public void setMedicineInstructions(String medicineInstructions) {
        this.medicineInstructions = medicineInstructions;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineUnit() {
        return medicineUnit;
    }

    public void setMedicineUnit(String medicineUnit) {
        this.medicineUnit = medicineUnit;
    }

    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }

    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }

    public String getMedicineCustomDosage() {
        return medicineCustomDosage;
    }

    public void setMedicineCustomDosage(String medicineCustomDosage) {
        this.medicineCustomDosage = medicineCustomDosage;
    }

    public List<String> getMedicineTimings() {
        return medicineTimings;
    }

    public void setMedicineTimings(List<String> medicineTimings) {
        this.medicineTimings = medicineTimings;
    }

    public List<String> getMedicineToBeTaken() {
        return medicineToBeTaken;
    }

    public void setMedicineToBeTaken(List<String> medicineToBeTaken) {
        this.medicineToBeTaken = medicineToBeTaken;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getMou() {
        return mou;
    }

    public void setMou(String mou) {
        this.mou = mou;
    }
}
