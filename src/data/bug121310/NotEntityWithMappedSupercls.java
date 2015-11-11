package data.bug121310;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class NotEntityWithMappedSupercls {
    @Id
    private int id;
}

