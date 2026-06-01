package Day22_portal_Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class firstusecase{

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tirabeauty.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("search")).click();

        driver.findElement(By.id("search")).sendKeys("Cleanser");

        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='Category']/div/button/img")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='scroll-bar']/li[3]/div/div[1]/img")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='Concern']/div/button/img")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[normalize-space()='Acne']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='Skin Type']//img[@alt='arrow icon']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[normalize-space()='Sensitive']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='Rating']//img[@alt='arrow icon']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[normalize-space()='4 star & above']")).click();

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//img[contains(@alt,'Innisfree Bija Trouble Cleansing Foam')]"))
                .click();

        Thread.sleep(3000);

        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("CustomerProduct.png");

        FileHandler.copy(src, dest);

        System.out.println("Screenshot Captured Successfully");

        Thread.sleep(3000);

        driver.quit();
    }
}
