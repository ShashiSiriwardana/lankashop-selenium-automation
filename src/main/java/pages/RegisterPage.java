package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    private By firstNameField = By.id("RegisterForm-FirstName");
    private By lastNameField = By.id("RegisterForm-LastName");
    private By emailField = By.id("RegisterForm-email");
    private By passwordField = By.id("RegisterForm-password");
    private By registerButton = By.xpath("//button[normalize-space()='Erstellen']");

    public void registerUser(String firstName, String lastName, String email, String password){

        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);

        driver.findElement(registerButton).click();



    }
}

