package Day22_class_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank_signup{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Eklavya");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Kumar");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("Banka");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Patna");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("Bihar");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("800001");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("Eklavya123");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("Password123");
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Log Out")).click();

        Thread.sleep(5000);

        driver.findElement(By.name("username")).sendKeys("Eklavya123");

        driver.findElement(By.name("password")).sendKeys("Password123");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}