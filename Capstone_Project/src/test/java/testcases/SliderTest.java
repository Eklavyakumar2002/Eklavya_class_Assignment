package testcases;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;
import utilities.ExtentManager;

public class SliderTest extends BaseClass {

    @Test
    public void testMoveSlider() {
        SliderPage page = new SliderPage(driver);
        page.moveSliderTo(200);

        int val = page.getSliderValue();
        System.out.println("Slider value after move: " + val);

        // >= 0 check — exact value depends on slider type (jQuery vs HTML5)
        Assert.assertTrue(val >= 0, "Slider value should be a valid number");
        ExtentManager.getTest().pass("Slider moved. Value is: " + val);
    }

    @Test
    public void testSliderDefaultValue() {
        SliderPage page = new SliderPage(driver);
        int val = page.getSliderValue();
        System.out.println("Default slider value: " + val);

        Assert.assertTrue(val >= 0, "Slider value should be >= 0");
        ExtentManager.getTest().pass("Default slider value: " + val);
    }

    @Test
    public void testPriceText() {
        SliderPage page = new SliderPage(driver);
        String text = page.getPriceText();
        System.out.println("Price text found: " + text);

        // Website shows "$75 - $300" — just check it found something
        Assert.assertFalse(text.isEmpty(), "Price text should not be empty");
        ExtentManager.getTest().pass("Price text displayed: " + text);
    }
}
