package dating.service.common;

import dating.service.UserProfileManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserProfileManagementApplication.class })
public class CucumberSpingConfiguration {}
