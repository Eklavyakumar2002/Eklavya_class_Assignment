package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class WaitUtils extends BaseClass
{
    public static WebElement waitForVisible(By locator)
    {
        WebDriverWait wait =
            new WebDriverWait(
                getDriver(),
                Duration.ofSeconds(10));

        return wait.until(
            ExpectedConditions
                .visibilityOfElementLocated(locator));
    }
}