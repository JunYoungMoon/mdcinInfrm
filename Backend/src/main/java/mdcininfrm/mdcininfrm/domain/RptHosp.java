package mdcininfrm.mdcininfrm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RptHosp {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
}
