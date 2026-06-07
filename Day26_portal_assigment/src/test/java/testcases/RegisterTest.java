package testcases;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.RegisterPage;

public class RegisterTest extends BaseClass {
	@Test
	public void registerTest() {
		RegisterPage rp = new RegisterPage(driver);
		rp.registerUser();
	}
}