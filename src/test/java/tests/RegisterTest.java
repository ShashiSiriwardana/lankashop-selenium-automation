package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utils.RandomDataGenerator;

public class RegisterTest extends BaseTest {

    @Test
    public void registerNewUser() {
        driver.get("https://lankashop.ch/account/logout");

        driver.get("https://lankashop.ch/account/register");

        RegisterPage registerPage = new RegisterPage(driver);
        String email = RandomDataGenerator.generateRandomEmail();


        registerPage.registerUser(
                "Test",
                "User",
                email,
                "Test@1234"
        );

        Assert.assertTrue(driver.getCurrentUrl().contains("/account"));

        System.out.println("Registration successful with email:"+email);
    }
}