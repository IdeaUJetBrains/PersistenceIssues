package data.bug120966;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.io.Serializable;



@Embeddable
public class Databases implements Serializable {
    private int id;
    private String name;

    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
