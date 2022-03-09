package Pages;
import Drivers.Driver;
import junit.runner.BaseTestRunner;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Assert;

import org.openqa.selenium.By;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class LoginPage extends BasePage {
    public static By  email = By.id("email");
    public static By password=By.id("password");
    public static By loginButton=By.id("loginButton");
    public static By assertion=By.xpath("//button[@aria-label='Show the shopping cart']");
    public LoginPage loginPortal() throws InterruptedException, IOException {
        Thread.sleep(1000);
        File file = new File("credentials.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet=wb.getSheet("Sheet1");
        driver.findElement(email).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
        driver.findElement(password).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
        driver.findElement(loginButton).click();
        return this;
    }
    public void checkLoginSuccessOrNot() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(assertion).isDisplayed());
    }
}
