package Pages;

import Drivers.Driver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public static By welcomeBanner = By.xpath("//button[@aria-label = 'Close Welcome Banner']");
    public static By myAccount = By.id("navbarAccount");
    public static By login = By.id("navbarLoginButton");
    public static By cookieButton = By.xpath("//a[@aria-label='dismiss cookie message']");

    public HomePage skipBanner(){
        driver.findElement(welcomeBanner).click();
        driver.findElement(cookieButton).click();
        return this;
    }
    public void navigateToLogin(){
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
    }

}
