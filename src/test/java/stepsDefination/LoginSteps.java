package stepsDefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import base.BaseUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;



public class LoginSteps extends BaseUtils{
	
	private BaseUtils base;
	
	public LoginSteps(BaseUtils base)
	{
		this.base=base;
	}
	
	


	@Given("^I navigate to the application \"([^\"]*)\"$")
    public void i_navigate_to_the_application_something(String broswerName) throws Throwable{
	    System.out.println("Navigating to application");
	    if(broswerName.equalsIgnoreCase("chrome"))
	    		{
	    System.setProperty("webdriver.chrome.driver", "/home/sunny/SeleniumSetup/chromedriver");
		base.driver=new ChromeDriver();
	    		}
	    else if(broswerName.equalsIgnoreCase("firefox"))
	    {
	    System.setProperty("webdriver.gecko.driver", "/home/sunny/SeleniumSetup/geckodriver");
	    base.driver=new FirefoxDriver();
	    }
	    base.driver.manage().window().maximize();
	    base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    base.driver.get("https://demoqa.com/login");
	}

	@When("I login with username and password")
	public void i_login_with_username_and_password(DataTable valuesTable) throws Exception {
			Map<String,String> datamap=valuesTable.asMap(String.class, String.class);
		   System.out.println("Hello " + datamap.get("username") +" is the  "+ datamap.get("password"));
		   LoginPage loginPage=new LoginPage(base.driver);
		   loginPage.enterDetails(datamap.get("username"), datamap.get("password"));
		   
		   
	}

	@Then("I click on login button")
	public void i_click_on_login_button() throws Exception {
		Thread.sleep(5000);
		LoginPage loginPage=new LoginPage(base.driver);
	loginPage.clickLogin();
	}

	@Then("I log out in the application")
	public void i_log_out_in_the_application() {
		String value=base.driver.findElement(By.id("userName-value")).getText();
		if(value.equalsIgnoreCase("sunny123"))
		   System.out.println("Hello you found the page");
		   base.driver.close();
	}

	 @When("^I login with (.+) and (.+) as$")
	    public void i_login_with_and_as(String username, String password) throws Throwable {
	       System.out.println("user is : "+username);
	       System.out.println("password is : "+password);
	    }






}
