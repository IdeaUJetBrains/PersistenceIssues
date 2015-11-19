package data.bug139032;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 11/16/2015.
 */

@Entity
@Table(name = "xTableName")
public class TableName1 {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
