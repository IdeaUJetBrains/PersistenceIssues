package data.bug128991;

import data.bug75825.Parent75825;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/11/2015.
 */
@Embeddable
public class Child128991 {
    private int idChild;
    private Integer name;
    private Integer idParentCh;
/*
    @Id
    @Column(name = "ID_CHILD", nullable = false)
    public int getIdChild() {
        return idChild;
    }

    public void setIdChild(int idChild) {
        this.idChild = idChild;
    }*/

    @Basic
    @Column(name = "NAME", nullable = true)
    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }


    @Basic
    @Column(name = "ID_PARENT_CH", nullable = true)
    public Integer getIdParentCh() {
        return idParentCh;
    }

    public void setIdParentCh(Integer idParentCh) {
        this.idParentCh = idParentCh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child128991 child = (Child128991) o;

        if (idChild != child.idChild) return false;
        if (name != null ? !name.equals(child.name) : child.name != null) return false;
        if (idParentCh != null ? !idParentCh.equals(child.idParentCh) : child.idParentCh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idChild;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (idParentCh != null ? idParentCh.hashCode() : 0);
        return result;
    }
}
