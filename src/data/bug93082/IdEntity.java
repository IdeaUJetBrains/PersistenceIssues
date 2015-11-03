package data.bug93082;

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
@XmlRootElement
public abstract class IdEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected transient Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @XmlTransient
    public Long getId() {
        return id;
    }
}
