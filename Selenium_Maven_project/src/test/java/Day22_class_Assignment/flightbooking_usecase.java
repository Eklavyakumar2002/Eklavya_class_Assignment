package Day22_class_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class flightbooking_usecase{
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
      
        driver.findElement(By.id("acknowledgeDemoWarning")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/nav/button[2]/span[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("kolkata");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/span[2]")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//*[@id=\"arrival_airport_input\"]")).sendKeys("dubai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/span[2]")).click();
        Thread.sleep(1000);
        //21
        driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[5]/div")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div/div/form/div[3]/div[3]/button/span[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(5000);
       
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[1]/div/div[2]/div[3]/div[1]/div[1]/select"))).selectByIndex(1);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[1]/div/div[2]/div[3]/div[1]/div[2]/input")).sendKeys("Eklavya");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[1]/div/div[2]/div[3]/div[1]/div[3]/input")).sendKeys("Kumar");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[1]/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("Eklavya12345@gmail.com");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[1]/div/div[2]/div[3]/div[2]/div[2]/select")))
        .selectByVisibleText("IN +91");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[1]/div/div[2]/div[3]/div[2]/div[3]/input")).sendKeys("8210732645");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div[2]/div[1]/select")))
        .selectByVisibleText("India");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div[2]/div[2]/div/select[1]")))
        .selectByVisibleText("10");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div[2]/div[2]/div/select[2]")))
        .selectByVisibleText("Oct");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div[2]/div[2]/div/select[3]")))
        .selectByVisibleText("2003");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div[3]/div[1]/input")).sendKeys("1234567");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[2]/div/div[1]/div[1]/select"))).selectByIndex(1);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[2]/div/div[1]/div[2]/input")).sendKeys("eklavya");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[2]/div/div[1]/div[3]/input")).sendKeys("kumar");
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[2]/div/div[2]/div[1]/select")))
        .selectByVisibleText("India");
        
        
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[2]/div[2]/div[2]/div/div[3]/div[1]/input")).sendKeys("12345627");
        
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[7]/div[2]/div/div[1]/div/div/div[1]/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[8]/div[2]/div[2]/div/div/div/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[8]/div[2]/button/span[3]")).click();
       
      driver.quit();
    }
}
