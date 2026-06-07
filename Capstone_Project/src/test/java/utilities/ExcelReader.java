package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class ExcelReader {

    public static Object[][] getData(String filePath, String sheetName) {
        Object[][] data = null;
        try {
            Workbook wb    = new XSSFWorkbook(new FileInputStream(filePath));
            Sheet sheet    = wb.getSheet(sheetName);
            int rows       = sheet.getLastRowNum();
            int cols       = sheet.getRow(0).getLastCellNum();
            data           = new Object[rows][cols];
            DataFormatter f = new DataFormatter();
            for (int r = 1; r <= rows; r++) {
                for (int c = 0; c < cols; c++) {
                    data[r - 1][c] = f.formatCellValue(sheet.getRow(r).getCell(c));
                }
            }
            wb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
