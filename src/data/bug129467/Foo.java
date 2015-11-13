package data.bug129467;

import org.eclipse.persistence.annotations.PrimaryKey;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Olga Pavlova on 11/13/2015.
 */
@SuppressWarnings("JpaMissingIdInspection")
@Entity
public class Foo {

    //TODO: uncomment @PrimaryKey, remove @Id
    //@PrimaryKey
    @Id
    private int id;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {

        return id;
    }
}
