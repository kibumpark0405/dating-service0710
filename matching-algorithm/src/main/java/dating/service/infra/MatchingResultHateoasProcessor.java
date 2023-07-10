package dating.service.infra;

import dating.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MatchingResultHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MatchingResult>> {

    @Override
    public EntityModel<MatchingResult> process(
        EntityModel<MatchingResult> model
    ) {
        return model;
    }
}
