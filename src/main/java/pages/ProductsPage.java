package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
  private WebDriver driver;
  private By productBanner = By.cssSelector(".title");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String verifyUserOnProductsPage() {
      System.out.println("Page Title: "+driver.getTitle());
      String banner = driver.findElement(productBanner).getText();
      return banner;

    }
}
