package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClasses {

    public WaitClasses(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public void explicitWait(By elementToWait){
        WebDriverWait wait = new  WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(elementToWait));
    }

}
