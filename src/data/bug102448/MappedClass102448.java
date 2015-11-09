package data.bug102448;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;




@MappedSuperclass
@NamedQuery(name = "foo", query = "SELECT a FROM MappedClass102448 a WHERE a.id>1")
public class MappedClass102448 implements Serializable {
    private int id;

    @Id
    public int getId() {
        return id;
    }
}
