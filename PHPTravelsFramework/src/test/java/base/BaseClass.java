package base;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driver.get();
	}
}
