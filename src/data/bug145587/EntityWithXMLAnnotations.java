package data.bug145587;

import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

@Entity
@Access(AccessType.FIELD)
@XmlType(namespace = "http://www.example.org/package", propOrder = {"xmlID", "realm", "group", "qualifier"})
public class EntityWithXMLAnnotations {

    @Transient
    @XmlID
    @XmlAttribute(required = true)
    @SuppressWarnings("all")
    private  String xmlID;




    private  String realm;
    private  String group;
    private  String qualifier;


    public String getXmlID() {
        return xmlID;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public void setGroup(String group) {

        this.group = group;
    }

    public void setRealm(String realm) {

        this.realm = realm;
    }

    public void setXmlID(String xmlID) {

        this.xmlID = xmlID;
    }

    public String getQualifier() {

        return qualifier;
    }

    public String getGroup() {

        return group;
    }

    public String getRealm() {

        return realm;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
