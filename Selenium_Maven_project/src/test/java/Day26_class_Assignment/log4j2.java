package Day26_class_Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j2{

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {

        logger.info("Excel file opening started");

        FileInputStream fis = new FileInputStream("C:\\Users\\rekha\\Desktop\\Book1.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        logger.info("Workbook created successfully");

        Sheet sh = wb.getSheet("Sheet1");

        logger.info("Sheet accessed successfully");

        int rows = sh.getLastRowNum();

        logger.info("Total rows found: " + rows);

        for(int i = 1; i <= rows; i++) {

            logger.info("Reading data from row: " + i);

            String username = sh.getRow(i).getCell(0).getStringCellValue();

            String password = sh.getRow(i).getCell(1).getStringCellValue();

            logger.info("Username fetched: " + username);

            WebDriver driver = new ChromeDriver();

            logger.info("Chrome browser launched");

            driver.get("https://www.saucedemo.com");

            logger.info("Website opened successfully");

            driver.findElement(By.id("user-name")).sendKeys(username);

            logger.info("Username entered");

            driver.findElement(By.id("password")).sendKeys(password);

            logger.info("Password entered");

            driver.findElement(By.id("login-button")).click();

            logger.info("Login button clicked");

            driver.quit();

            logger.info("Browser closed");
        }

        wb.close();

        logger.info("Workbook closed successfully");
    }
}