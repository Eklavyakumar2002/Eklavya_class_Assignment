package com.restApi;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UpdateUserTest {

    @Test
    public void updateUser() throws Exception {

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

                .put("https://dummyjson.com/users/1")

            .then()

                .statusCode(200)
                .log().all();

            System.out.println("User Updated: "
                    + firstName);
            
            System.out.println(firstName + lastName);
        }

        workbook.close();
    }
}