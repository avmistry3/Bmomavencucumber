package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/archana/eclipse-workspace/Bmomavencucumber/src/main/java/features/testbmo.feature",glue= {"StepDefination"})


public class testrunner {

}
