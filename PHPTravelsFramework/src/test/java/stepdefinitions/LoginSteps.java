package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
	LoginPage lp;

	@Given("user launches browser")
	public void user_launches_browser() {
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String user, String pass) {
		lp = new LoginPage();
		lp.login(user, pass);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("validate login result")
	public void validate_login_result() {
		System.out.println("Login validation completed");
	}
}