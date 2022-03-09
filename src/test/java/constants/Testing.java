package constants;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Testing {
    @Test
    public void test2() throws IOException {
        File file = new File("credentials.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet=wb.getSheet("Sheet1");
        String username=sheet.getRow(1).getCell(0).getStringCellValue();
        String password=sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(username+"  "+password);

    }
}
