package Pages;

import Drivers.Driver;
import org.openqa.selenium.By;

import java.util.Random;

public class UserRegistrationPage extends BasePage {
    static Random randomGenerator = new Random();
    public static int randomInt = randomGenerator.nextInt(1000);
    public static String email_add = "username" + randomInt + "@gmail.com";
    public static String password_add = "Hello";
    public static By myAccount = By.id("navbarAccount");
    public static By login = By.id("navbarLoginButton");
    public static By newCustomerLink = By.id("newCustomerLink");
    public static By email = By.id("emailControl");
    public static By password = By.id("passwordControl");
    public static By repeatPassword = By.id("repeatPasswordControl");
    public static By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
    public static By openDropDown = By.className("mat-select-arrow");
    public static By securityAnswer = By.id("securityAnswerControl");
    public static By registerButton = By.id("registerButton");
    //mat-select[@aria-label="Selection list for the security question"]

    public UserRegistrationPage clickOnAccountAndNavigateToLoginPage(){
        driver.findElement(myAccount).click();
        driver.findElement(login).click();

        driver.findElement(myAccount).click();
        driver.findElement(login).click();
        return this;
    }
    public UserRegistrationPage clickOnNewCustomerLink(){
        driver.findElement(newCustomerLink).click();
        return this;
    }
    public UserRegistrationPage fillRegistrationFormAndSubmit() throws InterruptedException {
        driver.findElement(email).sendKeys(email_add);
        driver.findElement(password).sendKeys(password_add);
        driver.findElement(repeatPassword).sendKeys(password_add);
        driver.findElement(By.xpath("//*[@id='registration-form']/div[1]/mat-form-field[1]/div/div[1]/div[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='mat-option-5']/span")).click();
        driver.findElement(securityAnswer).sendKeys("Test");
        driver.findElement(registerButton).click();
        Thread.sleep(1000);
        return this;
    }
}
