package data;

import org.hibernate.annotations.*;
import org.hibernate.annotations.AccessType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_NAME")
@AccessType("property")
public class AccessType16061 {
    //id
    private int id;
    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //access changed it is field(not property), can be without setter/getter
    private int id1;
    @AccessType("field")
    public int getId1() {
        return id;
    }

    //Transient: can be without setter/getter
    @Transient
    private int id2;
    public int getId2() {
        return id;
    }

}

