package dating.service.infra;

import dating.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserProfileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserProfile>> {

    @Override
    public EntityModel<UserProfile> process(EntityModel<UserProfile> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//user-profiles/{username}"
                )
                .withRel("/user-profiles/{username}")
        );

        return model;
    }
}
