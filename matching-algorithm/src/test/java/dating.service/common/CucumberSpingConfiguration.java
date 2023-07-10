package dating.service.common;

import dating.service.MatchingAlgorithmApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MatchingAlgorithmApplication.class })
public class CucumberSpingConfiguration {}
