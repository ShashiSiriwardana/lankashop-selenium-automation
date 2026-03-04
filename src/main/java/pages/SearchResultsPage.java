package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstProduct = By.linkText("Damro Ceylon Chai Tee");

    public void openFirstProduct() {
        driver.findElement(firstProduct).click();
    }
}