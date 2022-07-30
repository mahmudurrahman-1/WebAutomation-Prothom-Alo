package driver;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;

import java.time.Duration;


public class BaseDriver {
    WebDriver driver = null;
    public String baseurl = "https://www.prothomalo.com/";

    public void setup() {
        String browser = System.getProperty("browser", "chrome");
        if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.contains("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else if (browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(baseurl);

           /*implicity wait tells browser to wait for a certain amount of time before throwing
        n"No Such Elements Found"
        * */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getinstance().setdriver(driver);
    }

    @AfterSuite
    @Step("Everthing will be quit after all process")
    public void teardown() {
        PageDriver.getCurrentDriver().quit();
    }
}
