package testcases;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
import utilities.ExtentManager;

public class AlertTest extends BaseClass {

    @Test
    public void testSimpleAlert() {
        AlertPage page = new AlertPage(driver);
        page.clickSimpleAlert();
        String text = page.getAlertText();
        Assert.assertNotNull(text, "Alert text should not be null");
        page.acceptAlert();
        ExtentManager.getTest().pass("Simple alert accepted. Text: " + text);
    }

    @Test
    public void testConfirmAlertAccept() {
        AlertPage page = new AlertPage(driver);
        page.clickConfirmAlert();
        String text = page.getAlertText();
        page.acceptAlert();
        ExtentManager.getTest().pass("Confirmation alert accepted. Text: " + text);
    }

    @Test
    public void testConfirmAlertDismiss() {
        AlertPage page = new AlertPage(driver);
        page.clickConfirmAlert();
        page.dismissAlert();
        ExtentManager.getTest().pass("Confirmation alert dismissed");
    }

    @Test
    public void testPromptAlert() {
        AlertPage page = new AlertPage(driver);
        page.clickPromptAlert();
        page.typeInPrompt("Eklavya Automation");
        ExtentManager.getTest().pass("Prompt alert filled and accepted");
    }

    @Test
    public void testNewTab() {
        AlertPage page = new AlertPage(driver);
        String original = driver.getWindowHandle();
        int before = driver.getWindowHandles().size();

        page.clickNewTab();
        try { Thread.sleep(1500); } catch (Exception e) {}

        int after = driver.getWindowHandles().size();
        Assert.assertTrue(after > before, "New tab should have opened");

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(original)) {
                driver.switchTo().window(handle);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(original);
        ExtentManager.getTest().pass("New tab opened and closed successfully");
    }
}
