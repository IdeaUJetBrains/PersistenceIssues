package data.bug124883;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/11/2015.
 */
@Entity
@Table(name = "\"TEST2\"", schema = "PUBLIC", catalog = "PUBLIC")
public class Test2 {
    private int id;
    private String siteName;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TEST_PROPERTY", nullable = true, length = 255)
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test2 that = (Test2) o;

        if (id != that.id) return false;
        if (siteName != null ? !siteName.equals(that.siteName) : that.siteName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (siteName != null ? siteName.hashCode() : 0);
        return result;
    }
}
