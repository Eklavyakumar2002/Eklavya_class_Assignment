package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.WaitUtils;

public class MouseActionPage {

    WebDriver driver;
    WaitUtils wait;
    Actions   actions;

    By hoverBtn  = By.xpath("//button[text()='Point Me']");
    By copyBtn   = By.xpath("//button[text()='Copy Text']");
    By field1    = By.id("field1");
    By field2    = By.id("field2");
    By dragElem  = By.id("draggable");
    By dropElem  = By.id("droppable");

    public MouseActionPage(WebDriver driver) {
        this.driver  = driver;
        this.wait    = new WaitUtils(driver);
        this.actions = new Actions(driver);
    }

    public void hoverPointMe() {
        actions.moveToElement(wait.visible(hoverBtn)).perform();
    }

    public void doubleClickCopy() {
        actions.doubleClick(wait.clickable(copyBtn)).perform();
    }

    public String getField1() { return driver.findElement(field1).getAttribute("value"); }
    public String getField2() { return driver.findElement(field2).getAttribute("value"); }

    public void dragAndDrop() {
        WebElement src = wait.visible(dragElem);
        WebElement tgt = driver.findElement(dropElem);
        actions.dragAndDrop(src, tgt).perform();
    }

    public String getDropText() {
        return driver.findElement(dropElem).getText();
    }
}
