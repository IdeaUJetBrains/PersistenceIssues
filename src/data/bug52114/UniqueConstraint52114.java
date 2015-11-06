package data.bug52114;
import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/6/2015.
 */
@Entity
@Table(name= "TABLE_NAME",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"PRIORITY"})})
public class UniqueConstraint52114 {
    @Id
    int id;
}
