package pages;
import org.openqa.selenium.By;
import base.BaseClass;

public class BookingPage extends BaseClass
{
    public void bookHotel()
    {
        getDriver().findElement(
            By.xpath("//button[contains(text(),'Book')]"))
            .click();

        getDriver().findElement(
            By.id("traveller"))
            .sendKeys("Akanksha");

        getDriver().findElement(
            By.id("confirm"))
            .click();
    }
}