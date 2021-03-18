package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class GruposPage {
    private WebDriver driver;


    public GruposPage(WebDriver driver) {
        this.driver = driver;
    }

    private By gruposBtnSelected = By.cssSelector("a[aria-label = 'Grupos'][aria-current='page']");

    private By gruposNavigationMenu = By.cssSelector("div[aria-label='Lista de grupos'][role='navigation']");


    public boolean isGruposPageDisplayed(){
        WaitStrategies wait = new WaitStrategies(driver);
        wait.waitElementToBeClickable(gruposNavigationMenu);
        return driver.findElement(gruposBtnSelected).isDisplayed();
    }
}
