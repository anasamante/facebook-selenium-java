package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class AmigosPage {
    private WebDriver driver;

    public AmigosPage(WebDriver driver) {
        this.driver = driver;
    }

    private By amigosBtnSelected = By.cssSelector("a[aria-label = 'Amigos'][aria-current='page']");
    private By amigosNavigationMenu = By.cssSelector("div[aria-label='Amigos'][role='navigation']");

    public boolean isAmigosPageDisplayed(){
        WaitStrategies wait = new WaitStrategies(driver);
        wait.waitElementToBeClickable(amigosNavigationMenu);
        return driver.findElement(amigosBtnSelected).isDisplayed();
    }
}
