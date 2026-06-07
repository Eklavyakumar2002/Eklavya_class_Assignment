package com.restApi;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData{

    @Test
    public void getUsers() throws Exception {

        FileInputStream file =
                new FileInputStream("userdata.xlsx");

        XSSFWorkbook workbook =
                new XSSFWorkbook(file);

        XSSFSheet sheet =
                workbook.getSheet("Sheet1");

        int rows = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rows; i++) {

            Row row = sheet.getRow(i);

            int userId =
                    (int) row.getCell(0).getNumericCellValue();

            given()

            .when()

                .get("https://dummyjson.com/users/1")

            .then()

                .statusCode(200)
                .log().all();

            System.out.println("Fetched User ID: "
                    + userId);
        }

        workbook.close();
    }
}