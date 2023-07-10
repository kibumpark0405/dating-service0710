package dating.service.domain;

import dating.service.domain.*;
import dating.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserProfileDeleted extends AbstractEvent {

    private String username;

    public UserProfileDeleted(UserProfile aggregate) {
        super(aggregate);
    }

    public UserProfileDeleted() {
        super();
    }
}
