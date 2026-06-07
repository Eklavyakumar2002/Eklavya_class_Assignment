package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class BaseClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));
        // Note: ExtentTest is created in TestListener.onTestStart
        // so we do NOT call ExtentManager.createTest() here
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
        // flush is done in TestListener.onFinish — no need here
    }
}
