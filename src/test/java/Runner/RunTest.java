package Runner;

import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features",
glue = "StepDefinition")




public class RunTest{
	
}
