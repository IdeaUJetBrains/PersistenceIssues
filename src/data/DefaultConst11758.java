package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_NAME")
public class DefaultConst11758 {
    //id
    private int id;

    public DefaultConst11758() {
    }

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public DefaultConst11758(int id) {
        this.id = id;
    }
}
