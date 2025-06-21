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

public class TC03_Validate_Remove_Button {

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
    public void TC03(){
        //Step 1: Login
        loginPage.login(GlobalVariables.STANDARD_USER,GlobalVariables.GLOBAL_PWD);

        //Step 2: Click Add to cart button
        inventoryPage.clickAddToCartButton();

        //Validate
        Assert.assertTrue(inventoryPage.verifyRemoveBtn());

    }

    @AfterTest
    public void closeDriver() {
        BaseClass.quitDriver(driver);
    }


}
