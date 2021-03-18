package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.LoginPage;

public class BaseTests {

    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        //hide automation bar warning
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //avoid cache issues
        options.addArguments("--incognito");
        //avoid chrome notifications
        options.addArguments("--disable-notifications");
        return options;
    }
}
