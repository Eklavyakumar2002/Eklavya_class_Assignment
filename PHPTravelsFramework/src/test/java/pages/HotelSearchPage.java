package pages;
import org.openqa.selenium.By;
import base.BaseClass;

public class HotelSearchPage extends BaseClass
{
    public void searchHotel()
    {
        getDriver().findElement(
            By.id("destination"))
            .sendKeys("Mumbai");

        getDriver().findElement(
            By.id("checkin"))
            .sendKeys("30-05-2026");

        getDriver().findElement(
            By.id("checkout"))
            .sendKeys("05-06-2026");

        getDriver().findElement(
            By.id("submit"))
            .click();
    }
}