package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/newfeatures",glue= {"classpath:newStepDefination"},plugin = { "pretty", "html:target/cucumber-reports" }, tags ="@sunny" )
public class TestRunnerOrange
{

}
