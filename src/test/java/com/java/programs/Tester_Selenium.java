package com.java.programs;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


@Listeners(Student.class)
public class Tester_Selenium {


   public static void mainWebProgram() throws ParseException
   {

      Screen screen =new Screen();
      Pattern patten=new Pattern("");

      System.setProperty("webdriver.chrome.driver", "C:\\Sunny\\chromedriver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
      driver.findElement(By.id("btnLogin")).click();
      driver.close();
      }

	public static void mainFirefoxWebProgram() throws ParseException
	   {

	      Screen screen =new Screen();
	      Pattern patten=new Pattern("");

	      System.setProperty("webdriver.gecko.driver", "C:\\Sunny\\geckodriver\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	      driver.findElement(By.id("btnLogin")).click();
	      driver.close();
	      }
	   
	
	public static void mainRestMethod() {
		RestAssured.baseURI="https://restapi.demoqa.com/authentication/CheckForAuthentication/";
		
		Response response=RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").get();
		
		System.out.println(response.asString());
		JSONObject json=new JSONObject();
		json.put("username", "sunny");
		json.put("password", "sunny1");
		JsonPath.from(response.asString()).get("sunny");
	}
   
	
	public void runTestOnFirefoxServer() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		
		
		
		
		WebDriver driver=new RemoteWebDriver(new    URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		//Delay execution for 5 seconds to view the maximize operation
			Thread.sleep(5000);
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		      driver.findElement(By.id("btnLogin")).click();
		      driver.close();
		
	}
	

	public void runTestOnChromeServer() throws MalformedURLException {
		
		 
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
	
		
		WebDriver driver=new RemoteWebDriver(new    URL("http://localhost:4444/wd/hub"), cap);
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	      driver.findElement(By.id("btnLogin")).click();
	      driver.close();
		
	}

	public static void mainUsingWebDriverManagerProgram() throws ParseException
	   {

		WebDriverManager.chromedriver().setup();
	
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	      driver.findElement(By.id("btnLogin")).click();
	      driver.close();
	      }
	
	@Test
	public static void mainUsingWebDriverManagerFirefoxProgram() throws ParseException
	   {

		WebDriverManager.firefoxdriver().setup();
	
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	      driver.findElement(By.id("btnLogin")).click();
	      driver.close();
	      }

	public void setChromeOptionsMethodToRemovePopups() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://naukri.com");
		Thread.sleep(5000);
		driver.quit();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement doc=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='hello']")));
		
		PageFactory.initElements(driver, this);
	
		/*
		 * List<WebElement>
		 * allHeaders=driver.findElements(By.xpath("//table[@id='dtable']//th"));
		 * Assert.assertEquals(5,allHeaders.size(),"column Value doesnot match");
		 * 
		 * List<WebElement>
		 * allData=driver.findElements(By.xpath("//table[contains(text(),'']//tr"));
		 * 
		 * boolean flag=false; for(WebElement ele:allData) { String text=ele.getText();
		 * if(text.contains("ola")) { flag=true; System.out.println(text); break; } }
		 * Assert.assertTrue(flag,"Value is not true");
		 * 
		 * List<WebElement> allSiblings=driver.findElements(By.xpath(
		 * "//table[starts-with(@id,'sunny']//td[2]"));
		 * 
		 * WebElement checkboxValue=driver.findElement(By.xpath(
		 * "//td[text()='selenium']//preceding-sibling::td//input"));
		 * 
		 * WebElement linkValue=driver.findElement(By.xpath(
		 * "//td[text()='ola']//following-sibling::td//a"));
		 */
		
		/*
		 * TestNG runner=new TestNG();
		 * runner.setTestSuites(Arrays.asList("C:\\sunny\\suite.xml")); runner.run();
		 */
		
		
	}
	
	
}



