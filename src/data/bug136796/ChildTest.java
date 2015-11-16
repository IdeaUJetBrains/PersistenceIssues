package data.bug136796;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 11/16/2015.
 */
@Entity
@Table(name = "CONSTRAINT_TABLE_USAGE", schema = "INFORMATION_SCHEMA")
public class ChildTest {

    @Id

    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {

        return id;
    }
}
