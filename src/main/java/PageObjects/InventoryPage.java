package PageObjects;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BaseClass {

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Webelements of InventoryPage (the below is the web elements that flows del framework)
    @FindBy(xpath = "//*[contains(text(),'ADD TO CART')]")
            private WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(),'REMOVE')]")
    private WebElement removeButton;

    @FindBy(xpath = "//*[@class = 'shopping_cart_link fa-layers fa-fw']")
    private WebElement shoppingCartIcon;

    //here goes the methods and web elements that interact with the flow
    public boolean verifyAddToCartBtn(){
        return isDisplayed(addToCartButton);
    }
     //here we are doing a click on the cart button which is needed for tc03 for remove button verification
    public void clickAddToCartButton(){
        click(addToCartButton);
    }

    public boolean verifyRemoveBtn(){
        return isDisplayed(removeButton);
    }

    public void clickShoppingCart(){
        click(shoppingCartIcon);
    }

    //@FindBy()
}
