package Day22_class_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}