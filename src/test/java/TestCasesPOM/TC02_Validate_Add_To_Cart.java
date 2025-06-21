package TestCasesPOM;

import PageObjects.InventoryPage;
import PageObjects.LoginPage;
import Utils.BaseClass;
import Utils.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC02_Validate_Add_To_Cart {

    //Declare e intialize webdriver
    WebDriver driver = BaseClass.setupDriver();

    //PageObject
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);

    @BeforeTest
    public void startWebDriver(){
        driver.get(GlobalVariables.HOME_PAGE);
    }

    @Test
    public void TC02(){
        //Step 1: Login
        loginPage.login(GlobalVariables.STANDARD_USER,GlobalVariables.GLOBAL_PWD);

        //Step 2: Validate  Add to cart button
        Assert.assertTrue(inventoryPage.verifyAddToCartBtn());
    }
    @AfterTest
    public void closeDriver() {
        BaseClass.quitDriver(driver);
    }


}
