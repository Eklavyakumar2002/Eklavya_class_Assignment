package utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils
{
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils() throws Exception
    {
        String path =
            "src/test/resources/testdata/UserData.xlsx";

        FileInputStream fis =
            new FileInputStream(path);

        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
    }

    public String getData(int row, int cell)
    {
        return sheet.getRow(row)
                    .getCell(cell)
                    .getStringCellValue();
    }
}