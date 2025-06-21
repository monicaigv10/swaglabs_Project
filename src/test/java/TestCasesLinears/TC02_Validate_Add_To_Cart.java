package TestCasesLinears;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC02_Validate_Add_To_Cart {

    @Test
    public void TC02(){
        //Initiate driver
        WebDriver driver = new ChromeDriver();

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

        //Step 4: Validate Add to Cart in present
        boolean addtoCartDisplayed = driver.findElement(By.xpath("//*[contains(text(), 'ADD TO CART')]")).isDisplayed();
        Assert.assertTrue(addtoCartDisplayed);

        WebElement addtoCartButton = new WebDriverWait(driver,Duration.ofSeconds(60)).
                                     until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'btn_primary btn_inventory']")));

        //driver.close(); //only close the last window opened by driver
        driver.quit(); //close all windows that driver opened

    }
}
