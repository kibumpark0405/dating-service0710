package dating.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DeleteUserProfileCommand {

    private String username;
}
