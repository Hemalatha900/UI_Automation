import Drivers.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Pages.BasePage;
import Pages.HomePage;


public class BaseTest extends BasePage{

    @BeforeMethod
    public void setUp() throws InterruptedException{
        Thread.sleep(3000);
        this.driver= Driver.driverInit();
        System.out.println("Drives  " +driver);
        driver.get("http://juice-shop.herokuapp.com/#/login");
        Thread.sleep(2000);
        new HomePage().skipBanner().navigateToLogin();
        driver.manage().window().maximize();
    }
}
