package dating.service.domain;

import dating.service.domain.*;
import dating.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DateScheduleCreated extends AbstractEvent {

    private String id;

    public DateScheduleCreated(DateSchedule aggregate) {
        super(aggregate);
    }

    public DateScheduleCreated() {
        super();
    }
}
