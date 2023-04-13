package src.main.java.com.apollo247.phr.dto.dbo;

import org.bson.types.ObjectId;

public class CustomDBRef {
    private ObjectId $id;
    private String $ref;

    public CustomDBRef() {

    }

    public CustomDBRef(ObjectId id, String ref) {
        this.$id = id;
        this.$ref = ref;
    }

    public ObjectId get$id() {
        return $id;
    }

    public void set$id(ObjectId $id) {
        this.$id = $id;
    }

    public String get$ref() {
        return $ref;
    }

    public void set$ref(String $ref) {
        this.$ref = $ref;
    }
}
