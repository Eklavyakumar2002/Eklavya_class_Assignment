package com.restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport{

    @Test
    public void getUsers() {

        ExtentSparkReporter sparkReporter =
                new ExtentSparkReporter("test-output/ExtentReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        ExtentTest test = extent.createTest("Get Users API Test");

        given()

        .when().get("https://dummyjson.com/users/1")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("API Test Passed");

        extent.flush();
    }
}