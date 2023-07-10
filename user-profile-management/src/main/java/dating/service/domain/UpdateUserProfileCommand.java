package dating.service.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class UpdateUserProfileCommand {

        private String username;
        private Integer age;
        private String gender;
        private List&lt;String&gt; interests;
        private Address address;
        private File profileImage;


}
