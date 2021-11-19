package stepsDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseUtils{
	
	private BaseUtils base;
	public Hooks(BaseUtils base) {
		this.base=base;
	}

	@Before
	public void intializeTest() {
		System.out.println("Intializing the driver object");
		
		
	}
	
	@After
	public void tearDownTest(Scenario scenario) {
		System.out.println("End of the scenario "+ scenario.getName());
	}
	@BeforeStep
	public void beforeTestStep() {
		System.out.println("Executing before test step");
	}
	@AfterStep
	public void afterTestStep() {
		System.out.println("Executing after test step");
	}
}
