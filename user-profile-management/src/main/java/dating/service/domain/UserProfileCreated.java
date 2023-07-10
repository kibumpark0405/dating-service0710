package dating.service.domain;

import dating.service.domain.*;
import dating.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserProfileCreated extends AbstractEvent {

    private String username;

    public UserProfileCreated(UserProfile aggregate) {
        super(aggregate);
    }

    public UserProfileCreated() {
        super();
    }
}
