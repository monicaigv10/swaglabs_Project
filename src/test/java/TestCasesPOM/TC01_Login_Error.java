package TestCasesPOM;

import PageObjects.LoginPage;
import Utils.BaseClass;
import Utils.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_Login_Error {

    //DeclarE e intialize webdriver
    WebDriver driver = BaseClass.setupDriver();

    //PageObject
    LoginPage loginPage = new LoginPage(driver);

    @BeforeTest
    public void startWebDriver(){
        driver.get(GlobalVariables.HOME_PAGE);
    }

    @Test
    public void TC01(){
        //Step 1 - login
        //String username = BaseClass.getJsonValue("TC01","username") //this login is using json file
        //loginPage.login(username, "wrong_pwd");

        loginPage.login(GlobalVariables.STANDARD_USER,"wsdfdfdas"); //(this is using pom - global variables)
        String error = loginPage.getLoginError();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
    }

    @AfterTest
    public void closeDriver(){

        BaseClass.takeScreenShot(driver, "TC01");
        BaseClass.quitDriver(driver);


    }





}
