package data.bug145224;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InnerEntity {
    private String idInner;

    @Id
    public String getIdInner() {
        return idInner;
    }

    public void setIdInner(String idInner) {
        this.idInner = idInner;
    }
}
