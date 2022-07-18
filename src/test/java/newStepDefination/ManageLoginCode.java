package newStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageLoginCode
{
   WebDriver driver;
   @Given("^I login into orange hr service$")
   public void i_login_into_orange_hr_service() throws Throwable {

      System.setProperty("webdriver.chrome.driver", "C:\\Sunny\\chromedriver\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
   }

   @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
   public void i_enter_uname_password(String uname,String pass)
   {
      driver.findElement(By.id("txtUsername")).sendKeys(uname);
      driver.findElement(By.id("txtPassword")).sendKeys(pass);
   }

   @Then("^I am able to click on login button$")
   public void i_am_able_to_login()
   {
      driver.findElement(By.id("btnLogin")).click();
      String title=driver.getTitle();
      System.out.println(title);
      driver.close();
   }
}
