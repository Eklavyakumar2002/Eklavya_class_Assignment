package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.AfterStep;
import utilities.ScreenshotUtil;

public class Hooks extends BaseClass {
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get("https://phptravels.net/login");
	}

	@After
	public void tearDown() {
		getDriver().quit();
	}

	@AfterStep
	public void takeScreenshot() throws Exception {
		ScreenshotUtil.capture("Test");
	}
}
