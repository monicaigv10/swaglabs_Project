package PageObjects;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutTwoPage extends BaseClass {

    public CheckoutTwoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Web Elements CheckoutTwopage
    @FindBy(xpath = "//*[contains(text(),'FINISH')]")
    private WebElement finishBUtton;



    //Methods of checkoutPage2
    public void clickFinishButton(){
        click(finishBUtton);
    }

}