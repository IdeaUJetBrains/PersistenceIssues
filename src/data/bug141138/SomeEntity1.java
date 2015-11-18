package data.bug141138;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

import static data.bug138672.SomeEntity.QUERY_MIN_DATE;
import static data.bug138672.SomeEntity.QUERY_PARAM_USER_ID;

/**
 * Created by Olga Pavlova on 11/16/2015.
 */
@Entity
@Data
@Table(name = "SOMETABLE")
@NamedQueries({
        @NamedQuery(name = QUERY_MIN_DATE, query = "select min(aDate) from "
                + "SomeEntity1 where id2 = :" + QUERY_PARAM_USER_ID)
})
public class SomeEntity1 {
        public static final String QUERY_MIN_DATE = "QUERY_MIN_DATE";
        public static final String QUERY_PARAM_USER_ID = "QUERY_PARAM_USER_ID";

        @Id @Column(name = "ID1", nullable = false) private String id1;
        @Column(name = "ID2", nullable = false) private Long id2;
        @Column(name = "A_DATE", nullable = false) private Date aDate = new Date();

}
