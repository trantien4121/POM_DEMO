package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests{
    @Test
    public void testSuccessfullyLogin() {
        LoginPage loginPage = homePage.goToLogin();
        loginPage.login("huyquoc@gmail.com", "12345678");
        assertTrue(loginPage.getSuccessTitle().contains("Welcome to Safe Railway"), "Login Failed!!");
    }
}
