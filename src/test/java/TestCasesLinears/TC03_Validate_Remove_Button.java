package TestCasesLinears;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class TC03_Validate_Remove_Button {

    @Test
    public void TC03(){
        //Initiate driver
        ChromeOptions options = new ChromeOptions();
        Map prefs = new HashMap();
        prefs.put("credentials_enable_service",false);
        prefs.put("profile.password_manager_enable",false);
        prefs.put("password_manager_leak_detection",false);

        //options.addArguments("--disable-blink-features=AutomationControlled"); this is use to bypass pop ups
        options.addArguments();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);

        //Open website swaglabs
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize(); //to maximize browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Step 1: Enter username (will use xpath)
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");

        //Step 2: Enter password (correct)
        driver.findElement(By.xpath("//*[@data-test = 'password']")).sendKeys("secret_sauce");

        //Step 3: Click on login
        driver.findElement(By.xpath("//*[@id = 'login-button']")).click();

        //Step 4: Click Add to Cart
        //boolean addtoCartDisplayed = driver.findElement(By.xpath("//*[contains(text(), 'ADD TO CART')]")).isDisplayed();
        //Assert.assertTrue(addtoCartDisplayed);

        WebElement addtoCartButton = new WebDriverWait(driver,Duration.ofSeconds(60)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'btn_primary btn_inventory']")));
                addtoCartButton.click();

       //Step 5: Verify remove button is present
        boolean removeButtonDisplayed = driver.findElement(By.xpath("//*[contains(text(),'REMOVE')]")).isDisplayed();
        Assert.assertTrue(removeButtonDisplayed);

        //driver.close(); //only close the last window opened by driver
        driver.quit(); //close all windows that driver opened

    }
}
