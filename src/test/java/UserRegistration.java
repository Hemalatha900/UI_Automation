import Drivers.Driver;
import Pages.UserRegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.Random;

public class UserRegistration extends BaseTest {

    public UserRegistration(){
        super();
    }
    @Test
    public  void testRegistrationPage() throws InterruptedException {
        new UserRegistrationPage().clickOnAccountAndNavigateToLoginPage().clickOnNewCustomerLink().fillRegistrationFormAndSubmit();
        Driver.tearDown();
    }
}

