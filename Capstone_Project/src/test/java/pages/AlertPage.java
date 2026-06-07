package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class AlertPage {

    WebDriver driver;
    WaitUtils wait;

    By simpleBtn  = By.xpath("//button[text()='Simple Alert']");
    By confirmBtn = By.xpath("//button[text()='Confirmation Alert']");
    By promptBtn  = By.xpath("//button[text()='Prompt Alert']");
    By newTabBtn  = By.xpath("//button[text()='New Tab']");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        this.wait   = new WaitUtils(driver);
    }

    public void clickSimpleAlert() {
        driver.findElement(simpleBtn).click();
    }

    public void clickConfirmAlert() {
        driver.findElement(confirmBtn).click();
    }

    public void clickPromptAlert() {
        driver.findElement(promptBtn).click();
    }

    public void clickNewTab() {
        driver.findElement(newTabBtn).click();
    }

    public String getAlertText() {
        wait.forAlert();
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        wait.forAlert();
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        wait.forAlert();
        driver.switchTo().alert().dismiss();
    }

    public void typeInPrompt(String text) {
        wait.forAlert();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }
}
