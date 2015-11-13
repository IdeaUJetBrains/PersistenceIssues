package data.bug128991;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "PARENT")
public class KeyMap128991 {
    @Id
    private int id;

    /*@ElementCollection
    @javax.persistence.MapKey(name = "myProperty")
    private Map<String, Child128991> embeddables = new HashMap< >();*/


}
