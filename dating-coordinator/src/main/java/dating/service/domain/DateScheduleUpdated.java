package dating.service.domain;

import dating.service.domain.*;
import dating.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DateScheduleUpdated extends AbstractEvent {

    private String id;

    public DateScheduleUpdated(DateSchedule aggregate) {
        super(aggregate);
    }

    public DateScheduleUpdated() {
        super();
    }
}
