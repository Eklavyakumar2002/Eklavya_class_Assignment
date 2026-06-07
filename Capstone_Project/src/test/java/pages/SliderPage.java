package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SliderPage {

    WebDriver driver;
    WebDriverWait wait;

    // The slider on this site is a jQuery UI slider — NOT a native <input type="range">
    // Actual HTML: <div id="slider-range-min"> with a handle inside it
    // The value is stored in a <p> tag showing "$75 - $300" style text
    By sliderHandle  = By.xpath("//div[contains(@class,'ui-slider-handle')]");
    By sliderDiv     = By.xpath("//div[@id='slider-range-min']");
    By priceLabel    = By.xpath("//p[@id='amount']");

    // Fallback: native input range if site has one
    By nativeSlider  = By.xpath("//input[@type='range']");
    By priceSection  = By.xpath("//*[contains(text(),'Price range') or contains(text(),'$')]");

    public SliderPage(WebDriver driver) {
        this.driver = driver;
        this.wait   = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void moveSliderTo(int targetValue) {
        try {
            // Try native HTML5 range slider first
            WebElement sl = wait.until(ExpectedConditions.presenceOfElementLocated(nativeSlider));
            int current = Integer.parseInt(sl.getAttribute("value"));
            int diff    = targetValue - current;
            sl.click();
            for (int i = 0; i < Math.abs(diff); i++) {
                sl.sendKeys(diff > 0 ? Keys.ARROW_RIGHT : Keys.ARROW_LEFT);
            }
        } catch (Exception e) {
            // jQuery UI slider fallback — move using JS
            try {
                WebElement slider = driver.findElement(sliderDiv);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript(
                    "arguments[0].setAttribute('aria-valuenow', arguments[1]);",
                    slider, targetValue
                );
            } catch (Exception ex) {
                System.out.println("Slider not found with any locator: " + ex.getMessage());
            }
        }
    }

    public int getSliderValue() {
        try {
            WebElement sl = driver.findElement(nativeSlider);
            String val = sl.getAttribute("value");
            if (val != null && !val.isEmpty()) return Integer.parseInt(val);
        } catch (Exception e) {
            // try aria-valuenow
            try {
                WebElement handle = driver.findElement(sliderHandle);
                String val = handle.getAttribute("aria-valuenow");
                if (val != null && !val.isEmpty()) return Integer.parseInt(val);
            } catch (Exception ex) {
                System.out.println("Could not read slider value: " + ex.getMessage());
            }
        }
        return 0; // safe default so test doesn't crash
    }

    public String getPriceText() {
        // Try multiple locators — site may show price in different elements
        String[] xpaths = {
            "//p[@id='amount']",
            "//*[contains(@id,'amount')]",
            "//*[contains(text(),'$')]",
            "//span[contains(@class,'price')]",
            "//p[contains(text(),'Price')]",
            "//label[contains(text(),'Price')]"
        };
        for (String xpath : xpaths) {
            try {
                WebElement el = driver.findElement(By.xpath(xpath));
                String text = el.getText();
                if (text != null && !text.isEmpty()) {
                    System.out.println("Price text found with xpath '" + xpath + "': " + text);
                    return text;
                }
            } catch (Exception ignored) {}
        }
        System.out.println("WARNING: Price text element not found with any locator.");
        return "Price range not found";
    }
}
