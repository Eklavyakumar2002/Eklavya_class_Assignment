package Day27_class_Assignment;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    WebDriver driver;

    @Test

    @Parameters("browser")

    public void browserTest(String browser)
    {

        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }

        else if(browser.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }

        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}