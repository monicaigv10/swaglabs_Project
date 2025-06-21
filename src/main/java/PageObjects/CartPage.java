package PageObjects;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {


        public CartPage(WebDriver driver){
            PageFactory.initElements(driver, this);
        }

        //Web Elements Cartpage
        @FindBy(xpath = "//*[contains(text(),'CHECKOUT')]")
        private WebElement checkoutButton;

        //@FindBy(xpath = "//*[contains(text(),'CONTINUE SHOPPING')]")
        //private WebElement continueShoppingButton;

        @FindBy(xpath = "//*[@class= 'btn_secondary']")
        private WebElement continueShoppingBtn;

        @FindBy(xpath = "//*[contains(text(),'Sauce Labs Bike Light')]")
        private WebElement secondItemText;


        //Methods of Cart page
        public void clickCheckOutButton(){
            click(checkoutButton);
        }

        public void clickContinueShoppingButton(){
            click(continueShoppingBtn);
        }

        public boolean verifySecondItemText(){ return secondItemText.isDisplayed(); }
}
