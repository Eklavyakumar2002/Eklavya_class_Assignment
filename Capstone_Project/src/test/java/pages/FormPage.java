package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.WaitUtils;

public class FormPage {

    WebDriver driver;
    WaitUtils wait;

    // text fields
    By name     = By.id("name");
    By email    = By.id("email");
    By phone    = By.id("phone");
    By address  = By.id("textarea");

    // gender
    By male     = By.xpath("//input[@value='male']");
    By female   = By.xpath("//input[@value='female']");

    // days checkboxes
    By sunday    = By.id("sunday");
    By monday    = By.id("monday");
    By tuesday   = By.id("tuesday");
    By wednesday = By.id("wednesday");
    By thursday  = By.id("thursday");
    By friday    = By.id("friday");
    By saturday  = By.id("saturday");

    // dropdowns
    By country = By.id("country");
    By colors  = By.id("colors");

    // date pickers
    By date1 = By.xpath("//input[@type='date'][1]");
    By date2 = By.xpath("//input[@type='date'][2]");

    public FormPage(WebDriver driver) {
        this.driver = driver;
        this.wait   = new WaitUtils(driver);
    }

    public void enterName(String val) {
        wait.visible(name).clear();
        driver.findElement(name).sendKeys(val);
    }

    public void enterEmail(String val) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(val);
    }

    public void enterPhone(String val) {
        driver.findElement(phone).clear();
        driver.findElement(phone).sendKeys(val);
    }

    public void enterAddress(String val) {
        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(val);
    }

    public void selectGender(String gender) {
        By loc = gender.equalsIgnoreCase("male") ? male : female;
        WebElement rb = driver.findElement(loc);
        if (!rb.isSelected()) rb.click();
    }

    public void selectDay(String day) {
        By loc;
        switch (day.toLowerCase()) {
            case "sunday":    loc = sunday;    break;
            case "monday":    loc = monday;    break;
            case "tuesday":   loc = tuesday;   break;
            case "wednesday": loc = wednesday; break;
            case "thursday":  loc = thursday;  break;
            case "friday":    loc = friday;    break;
            default:          loc = saturday;  break;
        }
        WebElement cb = driver.findElement(loc);
        if (!cb.isSelected()) cb.click();
    }

    public void selectCountry(String val) {
        new Select(driver.findElement(country)).selectByVisibleText(val);
    }

    public void selectColor(String val) {
        new Select(driver.findElement(colors)).selectByVisibleText(val);
    }

    public void enterDate1(String val) {
        driver.findElement(date1).sendKeys(val);
    }

    public void enterDate2(String val) {
        driver.findElement(date2).sendKeys(val);
    }

    // getters for assertion
    public String getName()    { return driver.findElement(name).getAttribute("value"); }
    public String getEmail()   { return driver.findElement(email).getAttribute("value"); }
    public boolean isMale()    { return driver.findElement(male).isSelected(); }
    public boolean isFemale()  { return driver.findElement(female).isSelected(); }

    public boolean isDayChecked(String day) {
        By loc;
        switch (day.toLowerCase()) {
            case "sunday":    loc = sunday;    break;
            case "monday":    loc = monday;    break;
            case "tuesday":   loc = tuesday;   break;
            case "wednesday": loc = wednesday; break;
            case "thursday":  loc = thursday;  break;
            case "friday":    loc = friday;    break;
            default:          loc = saturday;  break;
        }
        return driver.findElement(loc).isSelected();
    }

    public String getCountry() {
        return new Select(driver.findElement(country)).getFirstSelectedOption().getText();
    }
}
