package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;
    public static WebDriver driverInit(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        return driver;
    }
    public static void tearDown(){
        if (driver !=null) {
            driver.quit();
            driver=null;
        }
    }
}
