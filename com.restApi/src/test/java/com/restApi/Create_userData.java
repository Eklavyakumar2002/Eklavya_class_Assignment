package com.restApi;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

// Extent Report imports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Create_userData {

    @Test
    public void createUser() throws Exception {

        // Start Extent Report
        ExtentReports extent =
                ExtentManager.getReport();

        // Create test entry in report
        ExtentTest test =
                extent.createTest("CREATE USER API TEST");

        FileInputStream file =
                new FileInputStream("userdata.xlsx");

        XSSFWorkbook workbook =
                new XSSFWorkbook(file);

        XSSFSheet sheet =
                workbook.getSheet("Sheet1");

        int rows = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rows; i++) {

            Row row = sheet.getRow(i);

            String firstName =
                    row.getCell(0).getStringCellValue();

            String lastName =
                    row.getCell(1).getStringCellValue();

            String body = "{\n" +
                    "\"firstName\":\"" + firstName + "\",\n" +
                    "\"lastName\":\"" + lastName + "\"\n" +
                    "}";

            given()

                .header("Content-Type", "application/json")
                .body(body)

            .when()

                .post("https://dummyjson.com/users/add")

            .then()

                .statusCode(200)
                .log().all();

            System.out.println("User Created: "
                    + firstName);

            // PASS status in report
            test.pass("User Created Successfully: "
                    + firstName);
        }

        workbook.close();

        // Save report
        extent.flush();
    }
}