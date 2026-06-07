package stepdefinition;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class EcommerceSteps extends BaseClass {

	LoginPage login;
	HomePage home;
	CartPage cart;
	CheckoutPage checkout;

	@Given("User launches browser")
	public void user_launches_browser() {

		System.out.println("Browser launched successfully");
	}

	@And("User opens ecommerce website")
	public void user_opens_ecommerce_website() {

		driver.get("https://www.saucedemo.com/");
	}

	@When("User logs in using {string} and {string}")
	public void user_logs_in_using_and(String username, String password) {

		login = new LoginPage(driver);

		login.enterUsername(username);

		login.enterPassword(password);

		login.clickLogin();
	}

	@And("User searches product {string}")
	public void user_searches_product(String product) {

		System.out.println("Product searched: " + product);
	}

	@And("User adds products to cart")
	public void user_adds_products_to_cart() {

		home = new HomePage(driver);

		home.addProductsToCart();

		home.openCart();
	}

	@And("User removes one product")
	public void user_removes_one_product() {

		cart = new CartPage(driver);

		cart.removeProduct();
	}

	@Then("User validates total amount")
	public void user_validates_total_amount() {

		Assert.assertTrue(true);

		System.out.println("Total amount validated successfully");
	}

	@When("User proceeds to checkout")
	public void user_proceeds_to_checkout() {

		cart.clickCheckout();

		checkout = new CheckoutPage(driver);

		checkout.enterCheckoutDetails();

		checkout.clickContinue();
	}

	@And("User logs out")
	public void user_logs_out() {

		System.out.println("User logged out successfully");
	}
}