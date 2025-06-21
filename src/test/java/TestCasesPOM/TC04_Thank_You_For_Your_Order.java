package TestCasesPOM;

import PageObjects.*;
import Utils.BaseClass;
import Utils.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC04_Thank_You_For_Your_Order {

    //Declare e intialize webdriver
    WebDriver driver = BaseClass.setupDriver();

    //PageObject
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutOnePage checkoutOnePage = new CheckoutOnePage(driver);
    CheckoutTwoPage checkoutTwoPage = new CheckoutTwoPage(driver);
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

    @BeforeTest
    public void startWebDriver(){
        driver.get(GlobalVariables.HOME_PAGE);
    }

    @Test
    public void TC04(){
        //Step 1: Login
        loginPage.login(GlobalVariables.STANDARD_USER,GlobalVariables.GLOBAL_PWD);

        //Step 2: Click add to cart
        inventoryPage.clickAddToCartButton();

        //Step 3: CLick in shopping cart
        inventoryPage.clickShoppingCart();

        //Step 4: Click on Checkout
        cartPage.clickCheckOutButton();

        //Step 5: Fill out checkout form and click on continue
        checkoutOnePage.fillCheckOutData("Monica","Sensei", "95111");
        checkoutOnePage.clickContinueButton();

        //Step 6: Click on Finish
        checkoutTwoPage.clickFinishButton();

        //Validate text "Thank you for your order"
        checkoutCompletePage.getThankYouMessage();
        Assert.assertEquals(checkoutCompletePage.getThankYouMessage(),"THANK YOU FOR YOUR ORDER" );
    }

    @AfterTest
    public void closeDriver() {
        BaseClass.quitDriver(driver);
    }


}
