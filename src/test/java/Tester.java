import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Tester {

   public static void main(String[] args) throws ParseException
   {

      Screen screen =new Screen();
      Pattern patten=new Pattern("");

      System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\UpdatedDrivers\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
      driver.findElement(By.id("btnLogin")).click();
      driver.close();
      }

}



