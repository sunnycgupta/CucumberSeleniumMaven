package stepsDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.runner.Request;

import static io.restassured.RestAssured.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Utils {

	RequestSpecification res;

	
	public RequestSpecification getRequest() throws Exception {
		res=new RequestSpecBuilder().setBaseUri(getKeyProperty("baseUrl")).addQueryParam("key ", "qaclick123").addHeader("Content-Type", "application/json").build();
		return given().spec(res);
	}
	
	public static String getKeyProperty(String key) throws Exception {
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("src/test/java/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
}
