package TestCasesLinears;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_Validate_Error_Login_Message {

    @Test
    public void TC01(){
        //Initiate driver
        WebDriver driver = new ChromeDriver();

        //Open website swaglabs
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize(); //to maximize browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Step 1: Enter username (will use xpath)
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");

        //Step 2: Enter password (incorrect)
        driver.findElement(By.xpath("//*[@data-test = 'password']")).sendKeys("wrongPwd");

        //Step 3: Click on login
        driver.findElement(By.xpath("//*[@id = 'login-button']")).click();

        //Step 4: Validate error message
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service"; //this is ex. of test data
        String actualMessage = driver.findElement(By.xpath("//*[@data-test = 'error']")).getText();


        Assert.assertEquals(actualMessage,expectedMessage);

        String expectedEpicSadFace = "Something went wrong";
        boolean isTrue = actualMessage.contains(expectedEpicSadFace);
        Assert.assertFalse(isTrue);

        driver.quit(); //close all windows that driver opened
        //driver.close(); //only close the last window opened by driver

    }
}
