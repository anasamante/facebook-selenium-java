package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStrategies {

    public WaitStrategies(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public void waitElementToBeClickable(By elementToWait){
        WebDriverWait wait = new  WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(elementToWait));
    }

}
