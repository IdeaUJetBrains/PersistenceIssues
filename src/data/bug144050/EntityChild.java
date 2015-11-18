package data.bug144050;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

/**
 * Created by Olga Pavlova on 11/18/2015.
 */
@Entity
@NamedQuery(
        name = EntityChild.FIND_RENEWAL_POLICY_IDS_BY_DRIVER_OID,
        query = "SELECT a FROM EntityParent a WHERE a.id = 1"
)
public class EntityChild extends  EntityParent {
    protected static final String FIND_RENEWAL_POLICY_IDS_BY_DRIVER_OID = "";

}
