package dating.service.common;

import dating.service.DatingCoordinatorApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DatingCoordinatorApplication.class })
public class CucumberSpingConfiguration {}
