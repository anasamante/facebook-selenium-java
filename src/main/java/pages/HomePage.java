package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitClasses;


public class HomePage {

    private WebDriver driver;

    private By homepage = By.cssSelector("a[aria-label = 'Inicio'][aria-current='page']");

    private By facebookBtn = By.cssSelector("a[aria-label='Facebook']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageDisplayed(){
        WaitClasses wait = new WaitClasses(driver);
        wait.explicitWait(facebookBtn);
        return driver.findElement(homepage).isDisplayed();
    }


}