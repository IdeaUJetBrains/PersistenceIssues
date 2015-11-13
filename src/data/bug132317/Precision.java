package data.bug132317;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Olga Pavlova on 11/13/2015.
 */
@Entity
public class Precision {
    @Id
    private int Id;


    private BigDecimal precision20S4;

    @Basic
    @Column(name = "PRECISION20S4", nullable = true, precision = 4)
    public BigDecimal getPrecision20S4() {
        return precision20S4;
    }

    public void setPrecision20S4(BigDecimal precision20S4) {
        this.precision20S4 = precision20S4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Precision precision = (Precision) o;

        if (precision20S4 != null ? !precision20S4.equals(precision.precision20S4) : precision.precision20S4 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return precision20S4 != null ? precision20S4.hashCode() : 0;
    }
}
