package data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Target;

import java.io.Serializable;

@Entity
public class EmbeddableInterfaceTest {

    //~ Instance fields --------------------------------------------------------

    private String m_id;


    private Face m_face;

    //~ Methods ----------------------------------------------------------------

    // 'Basic' attribute should not be 'Face'
    //@EmbeddedId
    @Target(Impl.class)
    public Face getFace() {
        return m_face;
    }

    @Id
    String getId() {
        return m_id;
    }

    public void setFace(Face face) {
        m_face = face;
    }

    void setId(String id) {
        m_id = id;
    }

    //~ Inner Interfaces -------------------------------------------------------

    static interface Face {
    }

    //~ Inner Classes ----------------------------------------------------------

    @Embeddable
    static class Impl implements Face, Serializable {
    }
}
