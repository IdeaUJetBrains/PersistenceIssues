package data.bug81388;


import javax.persistence.Id;
import javax.persistence.Transient;

@javax.persistence.Entity
public class Entity extends TransientMappedSup81388{
    private String id;

    @Transient
    private String transientProperty1 = "test";

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
