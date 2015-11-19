package data.bug144958;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MappedClass{

    @Id
    private int idMapped;

    public void setIdMapped(int idMapped) {
        this.idMapped = idMapped;
    }

    public int getIdMapped() {

        return idMapped;
    }

}
