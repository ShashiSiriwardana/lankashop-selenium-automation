package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By searchIcon = By.className("search-button");
    private By searchInput = By.id("Search-In-Drawer-1");

    public void searchProduct(String productName) {

        // Click search icon
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();

        // Wait until search input is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));

        driver.findElement(searchInput).sendKeys(productName);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
    }
}