package data.bug52114;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/6/2015.
 */
@Entity
@Table(name = "TABLE_NAME",
        schema = "PUBLIC",
        catalog = "PUBLIC",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"PRIORITY"})})
public class TableName {
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

        TableName tableName = (TableName) o;

        if (id != tableName.id) return false;
        if (name != null ? !name.equals(tableName.name) : tableName.name != null) return false;
        if (status != null ? !status.equals(tableName.status) : tableName.status != null) return false;
        if (priority != null ? !priority.equals(tableName.priority) : tableName.priority != null) return false;

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
