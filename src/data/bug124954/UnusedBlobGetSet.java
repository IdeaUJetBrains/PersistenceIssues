package data.bug124954;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga Pavlova on 11/13/2015.
 */
@Entity
@Access(AccessType.FIELD)
public class UnusedBlobGetSet {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Access(AccessType.PROPERTY)
    @Nonnull
    private List<Foo> blobList;


    @Nonnull
    public List<Foo> getBlobList() {  //todo should not be marked as unused
        return blobList;
    }
    public void setBlobList(@Nonnull List<Foo> blobList) { //todo should not be marked as unused
        this.blobList = blobList;
    }




    @Id
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
