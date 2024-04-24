package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginuser_steps {
	
	@Given("user navigates to facebook website")
	public void user_navigates_to_facebook_website() {
	    
		System.out.println("User navigated to website");
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
	    
		System.out.println("User successfully validated homepage title");
	}

	@Then("user enters {string} username")
	public void user_enters_username(String username) {
	   
		System.out.println("User entered "+username+" username in application");
	}

	@Then("user enters {string} password")
	public void user_enters_password(String password) {
	    
		System.out.println("User entered "+password+" password in application");
	}

	@Then("user clicks on the sigin button")
	public void user_clicks_on_the_sigin_button() {
	    
		System.out.println("User clicked on sign in button");
	}

	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
	    
		System.out.println("user navigates to facebook website");
	}

	@Then("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
	   
		System.out.println("user clicked on sign in button");
	}

}
