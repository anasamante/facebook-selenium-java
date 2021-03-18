package home;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AmigosPage;
import pages.GruposPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class HomeTests extends BaseTests {

    @Test
    public void testNavigateToAmigos(){
        loginPage.setUsername("Fbautomationjava@gmail.com");
        loginPage.setPassword("automationjava");
        HomePage homePage = loginPage.clickLoginSuccessful();
        AmigosPage amigosPage = homePage.clickAmigosBtn();
        assertTrue(amigosPage.isAmigosPageDisplayed());
        homePage.logOut();
    }

    @Test
    public void testNavigateToGrupos(){
        loginPage.setUsername("Fbautomationjava@gmail.com");
        loginPage.setPassword("automationjava");
        HomePage homePage = loginPage.clickLoginSuccessful();
        GruposPage gruposPage = homePage.clickGruposBtn();
        assertTrue(gruposPage.isGruposPageDisplayed());
        homePage.logOut();
    }
}
