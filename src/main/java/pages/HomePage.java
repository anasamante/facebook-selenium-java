package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class HomePage {

    private WebDriver driver;

    private By homepageBtnSelected = By.cssSelector("a[aria-label = 'Inicio'][aria-current='page']");

    private By facebookBtn = By.cssSelector("a[aria-label='Facebook']");
    private By amigosBtn = By.cssSelector("a[aria-label = 'Amigos']");
    private By gruposBtn = By.cssSelector("a[aria-label = 'Grupos']");
    private By cuentaBtn = By.cssSelector("[aria-label='Cuenta']");
    private By cerrarSesionBtn = By.xpath("//div[@role='button']/div[contains(.,'Cerrar sesión')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageDisplayed(){
        WaitStrategies wait = new WaitStrategies(driver);
        wait.waitElementToBeClickable(facebookBtn);
        return driver.findElement(homepageBtnSelected).isDisplayed();
    }

    public AmigosPage clickAmigosBtn(){
        WaitStrategies wait = new WaitStrategies(driver);
        wait.waitElementToBeClickable(amigosBtn);
        driver.findElement(amigosBtn).click();
        return new AmigosPage(driver);
    }

    public GruposPage clickGruposBtn(){
        WaitStrategies wait = new WaitStrategies(driver);
        wait.waitElementToBeClickable(gruposBtn);
        driver.findElement(gruposBtn).click();
        return new GruposPage(driver);
    }

    public LoginPage logOut(){
        driver.findElement(cuentaBtn).click();
        driver.findElement(cerrarSesionBtn).click();
        return new LoginPage(driver);
    }

}