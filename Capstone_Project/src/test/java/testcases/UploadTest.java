package testcases;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadPage;
import utilities.ExtentManager;
import java.io.File;

public class UploadTest extends BaseClass {

    // Create files at runtime so path always exists
    private String getFilePath(String fileName) {
        String dir = System.getProperty("user.dir") + "/src/test/resources/";
        new File(dir).mkdirs();
        File f = new File(dir + fileName);
        try {
            if (!f.exists()) f.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.getAbsolutePath();
    }

    @Test
    public void testSingleInputVisible() {
        UploadPage page = new UploadPage(driver);
        boolean visible = page.isSingleInputVisible();
        Assert.assertTrue(visible, "Single file input should be present on page");
        ExtentManager.getTest().pass("Single upload input is present");
    }

    @Test
    public void testMultiInputVisible() {
        UploadPage page = new UploadPage(driver);
        boolean visible = page.isMultiInputVisible();
        Assert.assertTrue(visible, "Multiple file input should be present on page");
        ExtentManager.getTest().pass("Multi upload input is present");
    }

    @Test
    public void testUploadSingleFile() {
        String file1 = getFilePath("testFile1.txt");
        UploadPage page = new UploadPage(driver);
        page.uploadSingle(file1);
        try { Thread.sleep(1500); } catch (Exception e) {}
        ExtentManager.getTest().pass("Single file upload done: " + file1);
    }

    @Test
    public void testUploadMultipleFiles() {
        String file1 = getFilePath("testFile1.txt");
        String file2 = getFilePath("testFile2.txt");
        UploadPage page = new UploadPage(driver);
        page.uploadMultiple(file1, file2);
        try { Thread.sleep(1500); } catch (Exception e) {}
        ExtentManager.getTest().pass("Multiple files upload done");
    }
}
