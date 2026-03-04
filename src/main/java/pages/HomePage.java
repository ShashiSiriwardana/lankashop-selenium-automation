package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookiesIfPresent() {

        try {
            By acceptButton = By.xpath("//button[normalize-space()='Akzeptieren']");

            if (!driver.findElements(acceptButton).isEmpty()) {
                driver.findElement(acceptButton).click();
                System.out.println("Cookie banner accepted.");
            }

        } catch (Exception e) {
            System.out.println("Cookie banner not present.");
        }
    }
}