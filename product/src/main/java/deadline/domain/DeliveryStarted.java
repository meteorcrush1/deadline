package deadline.domain;

import deadline.domain.*;
import deadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String address;
    private String status;
}
