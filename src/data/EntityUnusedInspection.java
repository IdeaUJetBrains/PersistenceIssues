package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 11/2/2015.
 */
@Entity
@Table(name = "TABLE_NAME")
public class EntityUnusedInspection {


    @Id
    @Column(name = "ID", nullable = false)
    private int id;
}
