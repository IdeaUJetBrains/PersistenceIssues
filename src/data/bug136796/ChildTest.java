package data.bug136796;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 11/16/2015.
 */
@Entity
@Table(name = "CONSTRAINT_TABLE_USAGE", schema = "INFORMATION_SCHEMA")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})
public class ChildTest  implements Serializable{
    private static final long serialVersionUID = 111;

    @Id
    private Integer id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TABLE_NAME")
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {

        return id;
    }
}
