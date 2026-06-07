package base;

import org.testng.ITestResult;
import utilities.ScreenshotUtility;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BaseClass {

	public WebDriver driver;

	ConfigReader cr = new ConfigReader();

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		// Disable automation detection
		options.addArguments("--disable-blink-features=AutomationControlled");

		options.addArguments("--disable-dev-shm-usage");

		options.addArguments("--start-maximized");

		options.addArguments("--disable-notifications");

		options.addArguments("--disable-infobars");

		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(cr.getURL());

		try {

			Thread.sleep(20000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotUtility.takeScreenshot(driver, result.getName());
		}

		if (driver != null) {

			driver.quit();
		}
	}
}