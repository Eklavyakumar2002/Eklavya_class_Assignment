package Day27_class_Assignment;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid{

    WebDriver driver;

    @SuppressWarnings("deprecation")
	@Test
    @Parameters("browser")

    public void browserTest(String browser) throws Exception {

        if(browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();

            driver = new RemoteWebDriver(
            new URL("http://localhost:4444"),
            options);
        }

        else if(browser.equalsIgnoreCase("edge")) {

            EdgeOptions options = new EdgeOptions();

            driver = new RemoteWebDriver(
            new URL("http://localhost:4444"),
            options);
        }
        driver.get("https://www.saucedemo.com");

  
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
        driver.quit();
    }
}