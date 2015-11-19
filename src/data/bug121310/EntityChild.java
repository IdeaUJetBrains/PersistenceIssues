package data.bug121310;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityChild extends NotEntityWithMappedSupercls{
    private int id;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
