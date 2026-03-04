package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.initDriver();
        driver.get("https://lankashop.ch");

        HomePage homePage = new HomePage(driver);
        homePage.acceptCookiesIfPresent();

    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();

    }


}
