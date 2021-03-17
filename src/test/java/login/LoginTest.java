package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {

    @Test(priority = 1)
    public void testUnsuccessfulLogin(){
        loginPage.setUsername("aaa@gmail.com");
        loginPage.setPassword("automationjava");
        assertTrue(loginPage.clickLoginUnsuccessful());
    }

    @Test(priority = 2)
    public void testSuccessfulLogin(){
        loginPage.setUsername("Fbautomationjava@gmail.com");
        loginPage.setPassword("automationjava");
        HomePage homePage = loginPage.clickLoginSuccessful();
        assertTrue(homePage.isHomePageDisplayed());
    }
}
