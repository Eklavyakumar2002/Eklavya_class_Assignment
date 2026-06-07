package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import base.BaseClass;

public class RegistrationPage extends BaseClass
{
    By firstName = By.id("first_name");
    By country = By.id("country");

    public void registerUser()
    {
        getDriver().findElement(firstName)
                   .sendKeys("Eklavya");

        Select s =
            new Select(
                getDriver().findElement(country));

        s.selectByVisibleText("India");
    }
}