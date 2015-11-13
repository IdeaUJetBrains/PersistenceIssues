package data.bug126451;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class DomainObject {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected long id;

    @Column(name="timestamp")
    protected Date timeStamp;
}
