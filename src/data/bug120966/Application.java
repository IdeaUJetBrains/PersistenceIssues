package data.bug120966;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedList;


@Entity
@NamedQuery(name = "Application.findByDatabaseName",
        query = "SELECT DISTINCT a FROM Application a, IN(a.databases) b WHERE b.name = :name")
@Table(name = "PARENT")
public class Application {
    private int id;

    @Id
    @Column(name = "ID_PARENT", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @ElementCollection(targetClass = Databases.class, fetch = FetchType.EAGER)
    @CollectionTable(name="CHILD", joinColumns = @JoinColumn(name = "ID_PARENT_CH"))
    private Collection databases = new LinkedList();



}
