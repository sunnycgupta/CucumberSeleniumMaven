package soapandrestpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestApiPractice {
	@Test
	public void getResponse() {
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");
	String resp=response.asString();
	int page= JsonPath.from(resp).getInt("per_page");
	System.out.println("Number of Pages is "+page);
	}
	@Test
	public void postPayload() {
		
		JSONObject obj=new JSONObject();
		obj.put("name", "Sunny");
		obj.put("job", "TL");
		String payload=obj.toJSONString();
		
		RestAssured.baseURI="https://reqres.in/api";
		int resp=given().body(payload).when().post("/users").getStatusCode();
		System.out.println("Code for post "+resp);
	}
	@Test
	public void putPayload() {
		JSONObject obj=new JSONObject();
		obj.put("name", "Sunny");
		obj.put("job", "SDET");
		
		String payload=obj.toJSONString();
		
		RestAssured.baseURI="https://reqres.in/";
		int code=given().body(payload).put("api/users/2").getStatusCode();
		System.out.println("COde for put api is "+code);
		
	}
	@Test
	public void patchPayload() {
		
		JSONObject jso=new JSONObject();
		jso.put("name", "Sunny");
		jso.put("job", "flicker");
		String payload=jso.toJSONString();
		
		RestAssured.baseURI="https://reqres.in/";
		int code=given().body(payload).patch("api/users/2").getStatusCode();
		System.out.println("COde for [patch "+code);
		
	}
	@Test
	public void deleteAPI()
	{
		RestAssured.baseURI="https://reqres.in/";
		int code=given().delete("api/users/2").getStatusCode();
		System.out.println("Code for delete "+code);
	}
	
}







