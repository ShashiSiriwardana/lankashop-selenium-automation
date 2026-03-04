package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    By firstProduct = By.partialLinkText("Damro");

    public void openFirstProduct(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(firstProduct));

        driver.findElement(firstProduct).click();
    }
}