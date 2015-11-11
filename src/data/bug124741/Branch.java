package data.bug124741;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

    @Column( name="INN" )
    private String INN;

    @Id
    private int id;
    public int getId() {      return id;    }
    public void setId(int id) {     this.id = id;    }
}

