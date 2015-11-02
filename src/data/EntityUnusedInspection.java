package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 11/2/2015.
 */
@Entity
public class EntityUnusedInspection {


    @Id
    @Column(name = "ID", nullable = false)
    private int id;
}
