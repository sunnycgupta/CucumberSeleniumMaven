package soapandrestpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SoapApiPractice {
	@Test
	public void testSoapRequest() throws IOException {
		
		File file=new File("./zsoapRequestFile/add.xml");
		FileInputStream fis=new FileInputStream(file);
		String payload=IOUtils.toString(fis, "UTF-8");
		
		RestAssured.baseURI="http://dneonline.com";
		Response response=RestAssured.given().header("Content-Type","text/xml").accept(ContentType.XML)
		.body(payload).post("/calculator.asmx");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}
}
