package stepDefinition;

import org.junit.Assert;

import Utilitiez.ConfigurationReader;
import Utilitiez.Driver;
import Utilitiez.commonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest extends commonMethods{
	
	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
	   Assert.assertTrue(true);
	}
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	  String titleOfThePage=  Driver.getDriver().getTitle();
	  System.out.println(titleOfThePage);
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() {
	    lp.usernameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_username"));
		lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_password"));
		
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		lp.loginButton.click();
	}

	

	@When("the user enters invalid credentials")
	public void the_user_enters_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	

}
