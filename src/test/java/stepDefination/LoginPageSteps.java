package stepDefination;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps {
	
	LoginPage login = new LoginPage();
	
	@Given("user launch the url")
	public void user_launch_the_url() {
		login.Setup();
		
		
	    
	}

	@When("user enter correct username and correct password")
	public void user_enter_correct_username_and_correct_password() {
	//	login.user_enter_correct_username_and_correct_password();
	  
	}

	@And("user enter on login button")
	public void user_enter_on_login_button() {
		login.user_enter_on_login_button();
	   
	}

	@Then("validate user navigate to home")
	public void validate_user_navigate_to_home() {
	assertTrue(	login.validate_user_navigate_to_home());
	   
	}
	
	
	@When("user enter correct {string} and correct {string}")
	public void user_enter_correct_and_correct(String uname, String pass) {
		login.user_enter_correct_username_and_correct_password(uname, pass);
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
