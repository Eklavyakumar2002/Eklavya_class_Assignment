package com.restApi;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        // Create HTML report file
        ExtentSparkReporter sparkReporter =
                new ExtentSparkReporter("test-output/ExtentReport.html");

        // Report Name
        sparkReporter.config().setReportName("CRUD API Automation Report");

        // Report Title
        sparkReporter.config().setDocumentTitle("REST Assured Report");

        // Create Extent Report object
        extent = new ExtentReports();

        // Attach report to project
        extent.attachReporter(sparkReporter);

        // Return report
        return extent;
    }
}