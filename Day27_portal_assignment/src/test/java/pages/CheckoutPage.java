package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first-name")
	WebElement firstName;
	@FindBy(id = "last-name")
	WebElement lastName;
	@FindBy(id = "postal-code")
	WebElement postalCode;
	@FindBy(id = "continue")
	WebElement continueButton;

	public void enterCheckoutDetails() {
		firstName.sendKeys("Eklavya");
		lastName.sendKeys("Test");
		postalCode.sendKeys("81310");
	}

	public void clickContinue() {
		continueButton.click();
	}
}