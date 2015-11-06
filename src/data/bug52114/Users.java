package data.bug52114;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/6/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"NAME", "MODIFY_USER_ID", "MODIFY_DATE"})})
public class Users {
    private int id;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
