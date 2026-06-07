package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> tl = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (tl.get() == null) {
            String browser = ConfigReader.get("browser");
            WebDriver driver;

            if (browser != null && browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
            }

            tl.set(driver);
        }
        return tl.get();
    }

    public static void quitDriver() {
        if (tl.get() != null) {
            tl.get().quit();
            tl.remove();
        }
    }
}
