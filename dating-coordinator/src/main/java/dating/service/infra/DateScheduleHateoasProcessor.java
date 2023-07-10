package dating.service.infra;

import dating.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DateScheduleHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DateSchedule>> {

    @Override
    public EntityModel<DateSchedule> process(EntityModel<DateSchedule> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//date-schedules/{id}"
                )
                .withRel("/date-schedules/{id}")
        );

        return model;
    }
}
