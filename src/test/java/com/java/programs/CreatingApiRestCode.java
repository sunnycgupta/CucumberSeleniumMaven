package com.java.programs;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class CreatingApiRestCode {
	@Test
	public void getData() {
		
	Response response=	RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	String str=response.asString();
		int page=JsonPath.from(str).getInt("page");
	System.out.println(page);
	List<String> getEmailList=JsonPath.from(str).getList("data.email");
	System.out.println(getEmailList);
	
	}
}
