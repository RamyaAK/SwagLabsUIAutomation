package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.ProductsPage;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        initializePageObjects();
        launchURL(driver);
    }
    private void initializePageObjects(){
     loginPage = new LoginPage(driver);
     productsPage = new ProductsPage(driver);
    }

    private void launchURL(WebDriver driver){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
