package data.bug81388;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;


import java.io.Serializable;

@MappedSuperclass
public abstract class TransientMappedSup81388 implements Serializable {


        private String transientProperty = "test";

        @Transient
        public String getTransientProperty() {
            return transientProperty;
        }
}
