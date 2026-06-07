package testcases;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseClass {
	@Test
	public void logoutTest() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		LogoutPage lo = new LogoutPage(driver);
// Login 
		lp.clickMyAccount();
		lp.clickLogin();
		lp.enterEmail("nk1711336@gmail.com");
		lp.enterPassword("Nitesh@123");
		lp.clickLoginButton();
		Thread.sleep(2000);
// Logout 
		lo.logoutUser();
		Thread.sleep(3000);
		System.out.println("Logout Successful");
	}
}