package data.bug102448;

import javax.persistence.*;


@Entity
public class Users extends MappedClass102448{
    private int id;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
