package data.bug124741;

import javax.persistence.*;

@Entity
public class Entity1{
    @AttributeOverrides({
            @AttributeOverride(name="branch.inn", column = @Column(name="OLD_BRANCH_INN")),
    })
    @Embedded
    private OldAccountDescription oldAccountDescription;


    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
