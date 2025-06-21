package PageObjects;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BaseClass {

    public CheckoutCompletePage(WebDriver driver) {
                PageFactory.initElements(driver, this);
    }

    //Web Elements CheckoutCompletepage
    @FindBy(className= "complete-header")
    private WebElement correctMessage;


    //Methods of checkoutPage
    public String getThankYouMessage(){
        return getText(correctMessage);
    }

}