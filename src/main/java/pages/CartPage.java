package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {

    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartIcon = By.cssSelector("a[href='/cart']");
    private By cartProduct = By.partialLinkText("Damro");

    public void openCart() {
        driver.findElement(cartIcon).click();
    }
    public boolean isProductDisplayed(){
        return driver.findElement(cartProduct).isDisplayed();
    }
}
