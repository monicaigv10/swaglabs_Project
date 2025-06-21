package TestCasesPOM;

import PageObjects.CartPage;
import PageObjects.InventoryPage;
import PageObjects.LoginPage;
import Utils.BaseClass;
import Utils.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC05_Validate_Two_Items_in_Cart {

    //Declare e intialize webdriver
    WebDriver driver = BaseClass.setupDriver();

    //PageObject
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    CartPage cartPage = new CartPage(driver);

    @BeforeTest
    public void startWebDriver(){
        driver.get(GlobalVariables.HOME_PAGE);
    }

    @Test
    public void TC05(){
        //Step 1: Login
        loginPage.login(GlobalVariables.STANDARD_USER,GlobalVariables.GLOBAL_PWD);

        //Step 2: Add 1 item to cart
        inventoryPage.clickAddToCartButton();


        //Step 3: Go to Shopping cart and click on continue to shopping
        inventoryPage.clickShoppingCart();
        cartPage.clickContinueShoppingButton();


        //Step 4: Add a second item to cart
        inventoryPage.clickAddToCartButton();
        inventoryPage.clickShoppingCart();


        //Verify text of second item (use xpath)













    }
    @AfterTest
    public void closeDriver() {
        BaseClass.quitDriver(driver);
    }


}
