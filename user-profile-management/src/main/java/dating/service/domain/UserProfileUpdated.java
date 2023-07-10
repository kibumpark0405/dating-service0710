package dating.service.domain;

import dating.service.domain.*;
import dating.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserProfileUpdated extends AbstractEvent {

    private String username;

    public UserProfileUpdated(UserProfile aggregate) {
        super(aggregate);
    }

    public UserProfileUpdated() {
        super();
    }
}
