package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchFunctionalityStepDef {

	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		System.out.println("testing");
	}

	@When("the user enters {string} in the search bar")
	public void the_user_enters_in_the_search_bar(String string) {
		System.out.println("testing");

	}

	@When("clicks on the search button")
	public void clicks_on_the_search_button() {
		System.out.println("testing");

	}

	@Then("the user should see search results for {string}")
	public void the_user_should_see_search_results_for(String string) {
		System.out.println("testing");

	}

}
