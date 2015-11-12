package data.bug119591;

import org.hibernate.annotations.AccessType;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/11/2015.
 */
@Entity
@AccessType("field")
@SecondaryTable(name="CHILD",
        pkJoinColumns=@PrimaryKeyJoinColumn(name="ID_CHILD"))
//@AttributeOverrides({@AttributeOverride(name = "name", column = @Column(name = "NAME"))})
public class Parent {
    private int idParent;
    private Integer name;

    @Id
    @Column(name = "ID_PARENT", nullable = false)
    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    @Basic
    @Column(name = "NAME", nullable = true)
    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent parent = (Parent) o;

        if (idParent != parent.idParent) return false;
        if (name != null ? !name.equals(parent.name) : parent.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idParent;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
