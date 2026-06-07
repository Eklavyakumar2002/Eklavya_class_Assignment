package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest
{
    @Test
    public void loginTest()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}