package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	List<WebElement> addToCartButtons;
	@FindBy(className = "shopping_cart_link")
	WebElement cartIcon;

	public void addProductsToCart() {
		addToCartButtons.get(0).click();
		addToCartButtons.get(1).click();
	}

	public void openCart() {
		cartIcon.click();
	}
}