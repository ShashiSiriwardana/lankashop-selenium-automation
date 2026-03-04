package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {

        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lankashop.ch/account/login");

        loginPage.login("testuser@email.com", "testpassword");

        System.out.println("Login attempted.");

    }
}