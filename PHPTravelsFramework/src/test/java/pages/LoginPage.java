package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;

	public LoginPage() {
		this.driver = getDriver();
	}

	By email = By.xpath("//input[@type='email']");

	By password = By.xpath("//input[@type='password']");

	By loginBtn = By.xpath("//button[@type='submit']");

	public void login(String user, String pass) {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(email).sendKeys(user);

		driver.findElement(password).sendKeys(pass);

		driver.findElement(loginBtn).click();
	}
}