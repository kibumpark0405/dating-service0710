package dating.service.domain;

import dating.service.domain.*;
import dating.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DateScheduleDeleted extends AbstractEvent {

    private String id;

    public DateScheduleDeleted(DateSchedule aggregate) {
        super(aggregate);
    }

    public DateScheduleDeleted() {
        super();
    }
}
