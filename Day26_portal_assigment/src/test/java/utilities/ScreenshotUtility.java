package utilities; 
 
import java.io.File; 
import java.io.IOException; 
 
import org.apache.commons.io.FileUtils; 
 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
 
public class ScreenshotUtility { 
 
    public static void takeScreenshot( 
            WebDriver driver, 
            String fileName) 
            throws IOException { 
 
        TakesScreenshot ts = 
                (TakesScreenshot) driver; 
 
        File src = 
                ts.getScreenshotAs( 
                        OutputType.FILE); 
 
        File dest = 
                new File( 
                        "screenshots/" 
                        + fileName 
                        + ".png"); 
 
        FileUtils.copyFile(src, dest); 
    } 
}