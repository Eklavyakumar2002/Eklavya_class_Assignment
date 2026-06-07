package Day23_class_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parabankTestngMaven{

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void signupTest() throws InterruptedException {

        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Eklavya");

        driver.findElement(By.id("customer.lastName")).sendKeys("Kumar");

        driver.findElement(By.id("customer.address.street")).sendKeys("Banka Bihar");

        driver.findElement(By.id("customer.address.city")).sendKeys("Banka");

        driver.findElement(By.id("customer.address.state")).sendKeys("Bihar");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("813102");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");

        driver.findElement(By.id("customer.ssn")).sendKeys("123456");

        driver.findElement(By.id("customer.username")).sendKeys("Eklavya12");

        driver.findElement(By.id("customer.password")).sendKeys("Password12");

        driver.findElement(By.id("repeatedPassword")).sendKeys("Password12");

        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void loginTest() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys("Eklavya12");

        driver.findElement(By.name("password")).sendKeys("Password12");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void transferFundsTest() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys("Eklavya12");

        driver.findElement(By.name("password")).sendKeys("Password12");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Transfer Funds"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.id("amount")).sendKeys("500");

        Thread.sleep(1000);

        Select fromAccount =
        new Select(driver.findElement(By.id("fromAccountId")));

        fromAccount.selectByIndex(0);

        Thread.sleep(1000);

        Select toAccount =
        new Select(driver.findElement(By.id("toAccountId")));

        toAccount.selectByIndex(1);

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Transfer']")).click();

        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}