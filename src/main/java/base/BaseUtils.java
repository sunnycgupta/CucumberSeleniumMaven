package base;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtils {

	public WebDriver driver;
	
	public ExtentReports extent;
	
	public static ExtentTest scenarioDef;
	
	public static ExtentTest feature;
	
	public static String filepath="/home/sunny/EXTReports/";
	
}
