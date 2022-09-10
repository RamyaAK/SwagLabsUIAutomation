package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By user_name = By.cssSelector("#user-name");
    private By user_password = By.cssSelector("#password");

    private By loginButton = By.cssSelector("#login-button");
    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }

    public LoginPage enterUserName(String username) {
        driver.findElement(user_name).sendKeys(username);

        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(user_password).sendKeys(password);
        return this;
    }

    public ProductsPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }
}
