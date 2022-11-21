package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryEnded extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer deliveryState;

    public DeliveryEnded(Order aggregate){
        super(aggregate);
    }
    public DeliveryEnded(){
        super();
    }
}
