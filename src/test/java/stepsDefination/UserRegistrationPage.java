package stepsDefination;

import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationPage {

	@Given("User navigates to registration page")
	public void user_navigates_to_registration_page() {
	  System.out.println("Step 6 registration page ");
	}

	@When("User enters the below details")
	public void user_enters_the_below_details(DataTable dataTable) {
	   List<List<String>> userlist=dataTable.asLists(String.class);
	   for(List<String> users: userlist) {
		   System.out.println(users);
	   }
	}

	@Then("user logs out of the application")
	public void user_logs_out_of_the_application() {
	   System.out.println("Step 8 log out page ");
	}
	
	@When("User enters the below details as list of map")
	public void user_enters_the_below_details_as_list_of_map(DataTable dataTable) {
		List<Map<String,String>> usermap=dataTable.asMaps(String.class,String.class);
		for(Map<String,String> map:usermap) {
			System.out.println(map.get("name"));
			System.out.println(map.get("age"));
			System.out.println(map.get("email"));
			System.out.println(map.get("phone"));
			System.out.println(map.get("state"));
			System.out.println(map.get("country"));
		}
	}
	
	@When("User enters the below details using single list")
	public void user_enters_the_below_details_using_single_list(DataTable dataTable) {
	   List<String> alist=dataTable.asList(String.class);
	   System.out.println(alist);
	}
	
	@When("User enters the below details as single map")
	public void user_enters_the_below_details_as_single_map(DataTable dataTable) {
	    
		Map<String,String> hmap=dataTable.asMap(String.class, String.class);
		System.out.println(hmap);
	}
	
}
