import Drivers.Browsers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CrossBrowserTesting extends Browsers {


    @Parameters("browser")
    @BeforeMethod
    public void SetUp(String browser) throws InterruptedException, MalformedURLException {
        Browsers drivers=new Browsers();
        driver=drivers.selectBrowser(browser);
        driver.get("http://juice-shop.herokuapp.com/#/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Close Welcome Banner']")).click();
        driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']")).click();

    }

    @Test
    public void Login() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("hemalatha123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//button[@aria-label='Show the shopping cart']")).isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
