package StepDefenetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user visit the website")
	public void user_visit_the_website() {
		System.out.println("visit");
	}
	
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("visit");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("visit");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("visit");
	}


}
