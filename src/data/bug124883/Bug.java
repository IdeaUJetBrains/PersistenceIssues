package data.bug124883;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 11/11/2015.
 */
@Entity
public class Bug {
    private int id;
    private Integer bugName;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BUG_NAME", nullable = true)
    public Integer getBugName() {
        return bugName;
    }

    public void setBugName(Integer bugName) {
        this.bugName = bugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bug bug = (Bug) o;

        if (id != bug.id) return false;
        if (bugName != null ? !bugName.equals(bug.bugName) : bug.bugName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bugName != null ? bugName.hashCode() : 0);
        return result;
    }
}
