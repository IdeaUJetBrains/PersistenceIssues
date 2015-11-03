package data.bug80738;

import data.TABLENAME;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/3/2015.
 */
@Entity
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Table(name= "TABLE_NAME")
public class ChannelEntity extends Superclass1 {
}
