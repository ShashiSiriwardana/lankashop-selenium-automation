package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.name("add");

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}