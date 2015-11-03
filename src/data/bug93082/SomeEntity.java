package data.bug93082;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
//@Audited
@XmlRootElement
@Entity
@Cacheable
@Table(name = "TABLE_NAME", schema = "PUBLIC")
public class SomeEntity extends IdEntity {

    private String name;

    @Basic(optional = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
