package testcases;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MouseActionPage;
import utilities.ExtentManager;

public class MouseActionTest extends BaseClass {

    @Test
    public void testMouseHover() {
        MouseActionPage page = new MouseActionPage(driver);
        page.hoverPointMe();
        try { Thread.sleep(1000); } catch (Exception e) {}
        // After hover, dropdown menu should appear
        ExtentManager.getTest().pass("Mouse hover performed on Point Me button");
    }

    @Test
    public void testDoubleClick() {
        MouseActionPage page = new MouseActionPage(driver);
        String before = page.getField1();
        page.doubleClickCopy();
        try { Thread.sleep(500); } catch (Exception e) {}
        String after = page.getField2();
        Assert.assertEquals(after, before, "Field2 should have same text as Field1 after double click");
        ExtentManager.getTest().pass("Double click worked. Copied: " + after);
    }

    @Test
    public void testDragAndDrop() {
        MouseActionPage page = new MouseActionPage(driver);
        page.dragAndDrop();
        try { Thread.sleep(1000); } catch (Exception e) {}
        String dropText = page.getDropText();
        Assert.assertFalse(dropText.isEmpty(), "Drop target should have text after drop");
        ExtentManager.getTest().pass("Drag and drop done. Target text: " + dropText);
    }
}
