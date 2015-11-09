package data;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/2/2015.
 */
@Entity
@NamedQueries({@NamedQuery(name = "Foo.findCreated",
        query = "SELECT f FROM Table1 f WHERE f.status=" +
                "testdata.FooStatus1.created " +
                "ORDER BY f.priority DESC")})
@Table(name = "TABLE_NAME", schema = "PUBLIC", catalog = "PUBLIC")
public class TABLENAME {
    private int id;
    private String name;
    private String status;
    private Integer priority;


    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "PRIORITY", nullable = true)
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TABLENAME tablename = (TABLENAME) o;

        if (id != tablename.id) return false;
        if (name != null ? !name.equals(tablename.name) : tablename.name != null) return false;
        if (status != null ? !status.equals(tablename.status) : tablename.status != null) return false;
        if (priority != null ? !priority.equals(tablename.priority) : tablename.priority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }
}
