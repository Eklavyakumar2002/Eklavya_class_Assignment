package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

public class ScreenshotUtils {

    public static String capture(String testName) {
        String dir  = System.getProperty("user.dir") + "/test-output/screenshots/";
        String path = dir + testName + "_" + System.currentTimeMillis() + ".png";
        try {
            new File(dir).mkdirs();
            File src = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }
}
