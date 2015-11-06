package data.bug103873;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/5/2015.
 */
@Entity
@Table(name = "TABLE_NAME")
public class EntityWithEnumerated {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    @Enumerated(EnumType.STRING)
    private Status  path;

}
