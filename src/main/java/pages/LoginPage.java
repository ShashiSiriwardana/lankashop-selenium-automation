package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By emailField = By.id("CustomerEmail");
    private By passwordField = By.id("CustomerPassword");
    private By loginBUutton = By.xpath("//button[normalize-space()='Anmelden']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBUutton).click();
    }

}


