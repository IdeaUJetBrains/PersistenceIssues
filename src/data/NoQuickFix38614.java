package data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NoQuickFix38614 {

    //TODO remove "public"
    public NoQuickFix38614() {
    }


    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
