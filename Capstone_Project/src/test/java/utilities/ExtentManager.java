package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.File;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentReports getInstance() {
        if (extent == null) {
            String dir  = System.getProperty("user.dir") + "/test-output/";
            String path = dir + "ExtentReport.html";

            // Create test-output folder if it doesn't exist
            new File(dir).mkdirs();

            ExtentSparkReporter spark = new ExtentSparkReporter(path);
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Capstone Test Report");
            spark.config().setReportName("GUI Automation - testautomationpractice.blogspot.com");

            extent = new ExtentReports();
            extent.attachReporter(spark);
            System.out.println("ExtentReport will be saved at: " + path);
        }
        return extent;
    }

    public static void createTest(String name) {
        test.set(getInstance().createTest(name));
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}
