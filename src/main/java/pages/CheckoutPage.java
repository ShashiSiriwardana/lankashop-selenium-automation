package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    By checkoutButton = By.name("checkout");

    public void clickCheckout(){
        driver.findElement(checkoutButton).click();
    }
}