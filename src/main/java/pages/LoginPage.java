package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class LoginPage {

    private WebDriver driver;

    private By emailField = By.id("email");

    private By passwordField = By.id("pass");

    private By loginBtn = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(emailField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickLoginSuccessful(){
        clickLoginBtn();
        return new HomePage(driver);
    }

    public boolean clickLoginUnsuccessful(){
        clickLoginBtn();
        WaitStrategies wait = new WaitStrategies(driver);
        wait.waitElementToBeClickable(loginBtn);
        return driver.findElement(loginBtn).isDisplayed();
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }
}


