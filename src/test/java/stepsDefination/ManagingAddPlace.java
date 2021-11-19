package stepsDefination;

import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

import base.APIResource;
import base.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojoClasses.Address;
import pojoClasses.Location;

public class ManagingAddPlace extends Utils{

	
	@Given("I login in to the rahul shetty site")
	public void i_login_in_to_the_rahul_shetty_site() throws Exception {
		Location location=new Location(-38.3834945,33.4273624);
		Address address=new Address(location, 70, "Frontline house", "(+91) 983 893 3937", "29, side layout, cohen 0944",
				Arrays.asList("Selenium","Mobile"), "http://google.com","Hinglish");
		ObjectMapper om=new ObjectMapper();
		String str=om.writeValueAsString(address);
		Response response=getRequest().body(str).when().post("/maps/api/place/add/json");
		int retriverdCode=response.getStatusCode();
		String jsonString=response.asString();
		System.out.println(retriverdCode);
		System.out.println(jsonString);
		String value=APIResource.valueOf("ADDPLACEAPI").getResource();
		System.out.println(value);
	}
	@When("I Add all the details provided")
	public void i_add_all_the_details_provided() {
	   System.out.println("I will not back down");
	}
	@Then("The place should be added successfully")
	public void the_place_should_be_added_successfully() {
	  System.out.println("I will continously improve myself");
	}



}
