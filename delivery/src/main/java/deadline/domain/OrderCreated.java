package deadline.domain;

import deadline.domain.*;
import deadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCreated extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private String productId;
    private String productName;
    private Integer qty;
    private String address;
}
