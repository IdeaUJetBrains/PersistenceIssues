package data.bug125306;

import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.MetaValue;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MappedSuperclass;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public class ABlocableEntity implements IBlockableEntity {

    @ManyToAny(
            metaColumn = @Column(name = "PARENT_TYPE"))
    @AnyMetaDef(idType = "long", metaType = "string",
            metaValues = {
                    @MetaValue(value = "MESSAGE", targetEntity = AccountMessage.class),
                    @MetaValue(value = "EVENT", targetEntity = AccountEvent.class)
            })
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinTable(name = "CHILD", joinColumns = @JoinColumn(name = "ID_PARENT_CH"),
            inverseJoinColumns = @JoinColumn(name = "ID_CHILD"))
    private List<IBlockableEntity> blockList = new ArrayList<IBlockableEntity>();
}
