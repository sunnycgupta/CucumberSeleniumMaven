package stepsDefination;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckLoginFeature {

	 @Given("^I am on the landing page of bank$")
	    public void i_am_on_the_landing_page_of_bank() throws Throwable {
	     System.out.println("On the first method");
	    }

	    @When("^I log in with username and password$")
	    public void i_log_in_with_username_and_password() throws Throwable {
	    	 System.out.println("On the second method");
	    }

	    @Then("^I should be logged in successfully$")
	    public void i_should_be_logged_in_successfully() throws Throwable {
	    	 System.out.println("On the third method");
	    }

	    @And("^My username should be displayed \"([^\"]*)\"$")
	    public void my_username_should_be_displayed(String val) throws Throwable {
	    	 System.out.println("On the fourth method "+val);
	    }

	    @When("^I log in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void i_log_in_with_username_something_and_password_something(String s1, String s2) throws Throwable {
	        System.out.println("Username is "+s1);
	        System.out.println("Username is "+s2);
	    }
	   
	    @When("I log in with {string} and  {string}")
	    public void i_log_in_with_and(String string1, String string2) {
	       System.out.println("This scenario will run twice");
	       System.out.println("Username is "+ string1);
	       System.out.println("Password is "+ string2);
	       
	    }




}
