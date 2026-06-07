package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By cart = By.id("cart-total");

    By viewCart = By.linkText("View Cart");

    By checkout = By.linkText("Checkout");

    public void proceedCheckout() {

        driver.findElement(cart).click();

        driver.findElement(viewCart).click();

        driver.findElement(checkout).click();
    }
}