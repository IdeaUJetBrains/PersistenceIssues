package data.bug137671;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Olga Pavlova on 11/16/2015.
 */
@Entity
@Table( name = "CHILD" )
public class ChildTest1 {

    @Id
    private int id;


    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyColumn(name = "ID_CHILD", length = 2)
    @Column(name = "VALUE", length = 255)
    private Map<String,String> childs;

}
