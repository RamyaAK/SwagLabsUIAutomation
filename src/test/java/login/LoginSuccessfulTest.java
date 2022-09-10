package login;

import base.BaseTest;
import constants.UserProperties;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginSuccessfulTest extends BaseTest {

    UserProperties user = new UserProperties();

    @BeforeTest
    public void initializeTestData(){
       user.setUsername("standard_user");
       user.setPassword("secret_sauce");
    }

    @Test
    public void testSuccessfulUserLogin(){

        loginPage.enterUserName(user.getUsername())
                 .enterPassword(user.getPassword())
                 .clickOnLoginButton();
        String textResult = productsPage.verifyUserOnProductsPage();
        Assert.assertEquals(textResult,"PRODUCTS");
    }

    @AfterTest
    public void closeTest(){
        System.out.println("Test closed!");
    }
}
