package Pages;

import Drivers.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;
    public BasePage(){
        this.driver= Driver.driverInit();
    }
}
