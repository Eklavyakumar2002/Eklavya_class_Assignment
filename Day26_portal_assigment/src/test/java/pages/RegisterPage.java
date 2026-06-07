package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	By myAccount = By.xpath("//span[text()='My Account']");
	By register = By.linkText("Register");
	By firstName = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By password = By.id("input-password");
	By confirmPassword = By.id("input-confirm");
	By policy = By.name("agree");
	By continueBtn = By.xpath("//input[@value='Continue']");

	public void registerUser() {
		driver.findElement(myAccount).click();
		driver.findElement(register).click();
		driver.findElement(firstName).sendKeys("Sagarika");
		driver.findElement(lastName).sendKeys("Talukdar");
		driver.findElement(email).sendKeys("st@gmail.com");
		driver.findElement(telephone).sendKeys("8420952086");
		driver.findElement(password).sendKeys("Saga@123");
		driver.findElement(confirmPassword).sendKeys("Saga@123");
		driver.findElement(policy).click();
		driver.findElement(continueBtn).click();
	}
}