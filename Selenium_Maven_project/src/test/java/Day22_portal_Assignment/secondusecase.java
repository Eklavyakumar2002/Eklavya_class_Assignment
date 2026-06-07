package Day22_portal_Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class secondusecase{

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wireless Headphones" + Keys.ENTER);

        Thread.sleep(5000);

        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("WirelessHeadphones.png");

        FileHandler.copy(src, dest);

        System.out.println("Search Completed");

        System.out.println("Screenshot Captured Successfully");

        Thread.sleep(2000);

        driver.quit();
    }
}