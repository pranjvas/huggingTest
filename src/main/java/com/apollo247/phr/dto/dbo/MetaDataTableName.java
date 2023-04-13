package src.main.java.com.apollo247.phr.dto.dbo;

public enum MetaDataTableName {
    ALLERGY("Allergy"),
    FILE("File"),
    USER("User"),
    PRESCRIPTION("Prescription");

    private String collectionName;

    MetaDataTableName(String collection) {
        this.collectionName = collection;
    }

    public String getCollectionName() {
        return this.collectionName;
    }
}
