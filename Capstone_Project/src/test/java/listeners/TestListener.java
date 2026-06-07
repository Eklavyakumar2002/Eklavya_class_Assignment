package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.ExtentManager;
import utilities.ScreenshotUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult r) {
        // Create the ExtentTest node here so it always exists
        // before onTestFailure / onTestSuccess is called
        ExtentManager.createTest(r.getName());
    }

    @Override
    public void onTestSuccess(ITestResult r) {
        if (ExtentManager.getTest() != null) {
            ExtentManager.getTest().pass("PASS: " + r.getName());
        }
    }

    @Override
    public void onTestFailure(ITestResult r) {
        if (ExtentManager.getTest() != null) {
            ExtentManager.getTest().fail(r.getThrowable());
            try {
                String shot = ScreenshotUtils.capture(r.getName());
                ExtentManager.getTest().addScreenCaptureFromPath(shot);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult r) {
        if (ExtentManager.getTest() != null) {
            ExtentManager.getTest().skip("SKIP: " + r.getName());
        }
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        ExtentManager.flush();
    }
}
