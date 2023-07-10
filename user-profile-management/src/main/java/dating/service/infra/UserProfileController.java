package dating.service.infra;

import dating.service.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/userProfiles")
@Transactional
public class UserProfileController {

    @Autowired
    UserProfileRepository userProfileRepository;

    @RequestMapping(
        value = "userProfiles/{id}//user-profiles/{username}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public UserProfile updateUserProfile(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateUserProfileCommand updateUserProfileCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /userProfile/updateUserProfile  called #####"
        );
        Optional<UserProfile> optionalUserProfile = userProfileRepository.findById(
            id
        );

        optionalUserProfile.orElseThrow(() -> new Exception("No Entity Found"));
        UserProfile userProfile = optionalUserProfile.get();
        userProfile.updateUserProfile(updateUserProfileCommand);

        userProfileRepository.save(userProfile);
        return userProfile;
    }
}
