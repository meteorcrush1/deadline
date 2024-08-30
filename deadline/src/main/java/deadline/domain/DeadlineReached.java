package deadline.domain;

import deadline.domain.*;
import deadline.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeadlineReached extends AbstractEvent {

    private Long id;
    private Date deadline;
    private Long orderId;
    private Date startedTime;

    public DeadlineReached(Deadline aggregate) {
        super(aggregate);
    }

    public DeadlineReached() {
        super();
    }
}
//>>> DDD / Domain Event
