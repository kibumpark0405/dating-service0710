package dating.service.domain;

import dating.service.UserProfileManagementApplication;
import dating.service.domain.UserProfileCreated;
import dating.service.domain.UserProfileDeleted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserProfile_table")
@Data
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String username;

    private Integer age;

    private String gender;

    private List<String> interests;

    private Address address;

    private File profileImage;

    @PostPersist
    public void onPostPersist() {
        UserProfileCreated userProfileCreated = new UserProfileCreated(this);
        userProfileCreated.publishAfterCommit();

        UserProfileDeleted userProfileDeleted = new UserProfileDeleted(this);
        userProfileDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserProfileRepository repository() {
        UserProfileRepository userProfileRepository = UserProfileManagementApplication.applicationContext.getBean(
            UserProfileRepository.class
        );
        return userProfileRepository;
    }

    public void updateUserProfile(
        UpdateUserProfileCommand updateUserProfileCommand
    ) {
        //implement business logic here:

        UserProfileUpdated userProfileUpdated = new UserProfileUpdated(this);
        userProfileUpdated.publishAfterCommit();
    }
}
