package data.bug75825;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Olga Pavlova on 11/11/2015.
 */
@Entity
@Table(name = "PARENT")
public class Parent75825 {

    @Id
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
    protected Set<Child75825> childIds;
}
