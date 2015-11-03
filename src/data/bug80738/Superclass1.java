package data.bug80738;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@MappedSuperclass
public abstract class Superclass1 implements Serializable {
    private int id;

    @Id
    public int getId() {
        return id;
    }
}
