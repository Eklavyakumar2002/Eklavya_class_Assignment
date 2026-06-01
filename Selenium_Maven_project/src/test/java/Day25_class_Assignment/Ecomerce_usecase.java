package Day25_class_Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecomerce_usecase{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);

        driver.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement addToCart = wait.until( ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));

        addToCart.click();

        System.out.println("Product added to cart successfully");

        driver.quit();
    }
}