package dating.service.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class CreateUserProfileCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String username;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Integer age;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String gender;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; interests;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Address address;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private File profileImage;


}
