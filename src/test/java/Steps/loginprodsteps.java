package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class loginprodsteps {

	@Then("user validates captcha in application")
	public void user_validates_captcha_in_application() {
	    System.out.println("user validates captcha in application");
	}
	
	@And("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
//	    List<List<String>> data = dataTable.asLists();
//	    System.out.println("User enters Firstname : "+ data.get(0).get(0));
		
		List<Map<String, String>> map = dataTable.asMaps();
		System.out.println(map.get(0).get("Firstname")+ "----Lastname is :"+map.get(0).get("Lastname"));
		System.out.println(map.get(1).get("Firstname")+ "----Lastname is :"+map.get(1).get("Lastname"));
	}
	
	

}
