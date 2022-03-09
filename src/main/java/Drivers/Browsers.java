package Drivers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Browsers{
    public static WebDriver driver;
    public WebDriver selectBrowser(String browser) throws MalformedURLException {
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver");
                driver=new ChromeDriver();
                /*DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setBrowserName("chrome");
                capabilities.setPlatform(Platform.WINDOWS);*/

                //driver = new RemoteWebDriver(new URL("http://localhost:444/wd/hub"),capabilities);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/geckodriver");
                driver= new FirefoxDriver();
                break;
            case "safari":
                driver=new SafariDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/main/resources/msedgedriver");
                driver= new EdgeDriver();
                break;
            default:
                System.out.println("Please provide valid browser name..........");

        }
        return driver;
    }
}
