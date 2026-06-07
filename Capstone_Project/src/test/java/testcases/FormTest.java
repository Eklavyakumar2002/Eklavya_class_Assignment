package testcases;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormPage;
import utilities.ExtentManager;

public class FormTest extends BaseClass {

    @Test
    public void testTextFields() {
        FormPage form = new FormPage(driver);
        form.enterName("Eklavya Kumar");
        form.enterEmail("eklavya@test.com");
        form.enterPhone("9876543210");
        form.enterAddress("Wipro Training Center, Batch 1");

        Assert.assertEquals(form.getName(),  "Eklavya Kumar",    "Name mismatch");
        Assert.assertEquals(form.getEmail(), "eklavya@test.com", "Email mismatch");
        ExtentManager.getTest().pass("Text fields filled and verified");
    }

    @Test
    public void testGenderRadioMale() {
        FormPage form = new FormPage(driver);
        form.selectGender("male");
        Assert.assertTrue(form.isMale(),   "Male should be selected");
        Assert.assertFalse(form.isFemale(),"Female should not be selected");
        ExtentManager.getTest().pass("Male radio button selected");
    }

    @Test
    public void testGenderRadioFemale() {
        FormPage form = new FormPage(driver);
        form.selectGender("female");
        Assert.assertTrue(form.isFemale(), "Female should be selected");
        ExtentManager.getTest().pass("Female radio button selected");
    }

    @Test
    public void testCheckboxDays() {
        FormPage form = new FormPage(driver);
        form.selectDay("monday");
        form.selectDay("wednesday");
        form.selectDay("friday");

        Assert.assertTrue(form.isDayChecked("monday"),    "Monday should be checked");
        Assert.assertTrue(form.isDayChecked("wednesday"), "Wednesday should be checked");
        Assert.assertTrue(form.isDayChecked("friday"),    "Friday should be checked");
        Assert.assertFalse(form.isDayChecked("sunday"),   "Sunday should NOT be checked");
        ExtentManager.getTest().pass("Day checkboxes selected and verified");
    }

    @Test
    public void testCountryDropdown() {
        FormPage form = new FormPage(driver);
        form.selectCountry("India");
        Assert.assertEquals(form.getCountry(), "India", "Country mismatch");
        ExtentManager.getTest().pass("Country selected: India");
    }

    @Test
    public void testColorDropdown() {
        FormPage form = new FormPage(driver);
        form.selectColor("Red");
        ExtentManager.getTest().pass("Color selected: Red");
    }

    @Test
    public void testDatePickers() {
        FormPage form = new FormPage(driver);
        form.enterDate1("06/06/2025");
        form.enterDate2("06062025");
        ExtentManager.getTest().pass("Dates entered in both date pickers");
    }

    @Test
    public void testFullFormFill() {
        FormPage form = new FormPage(driver);
        form.enterName("Eklavya Kumar");
        form.enterEmail("eklavya@test.com");
        form.enterPhone("9876543210");
        form.enterAddress("Wipro Training Center, Batch 1");
        form.selectGender("male");
        form.selectDay("monday");
        form.selectDay("saturday");
        form.selectCountry("India");
        form.selectColor("Blue");
        form.enterDate1("06/06/2025");
        form.enterDate2("06062025");

        Assert.assertEquals(form.getName(),    "Eklavya Kumar", "Name mismatch");
        Assert.assertEquals(form.getCountry(), "India",          "Country mismatch");
        Assert.assertTrue(form.isMale(),                         "Male should be selected");
        Assert.assertTrue(form.isDayChecked("monday"),           "Monday should be checked");
        ExtentManager.getTest().pass("Full form filled and all assertions passed");
    }
}
