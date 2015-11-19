package data.bug145224;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityWithInnerEntity {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
