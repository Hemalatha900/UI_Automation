import Drivers.Driver;
import Pages.UserRegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import Pages.LoginPage;

import java.io.IOException;


public class SeleniumTest  extends BaseTest{

    @Test
    public  void test() throws InterruptedException, IOException {
        new LoginPage().loginPortal().checkLoginSuccessOrNot();
        Driver.tearDown();
    }
}
