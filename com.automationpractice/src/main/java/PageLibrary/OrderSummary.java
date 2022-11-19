package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary extends BasePage {

    @FindBy(xpath="//span[contains(text(),'I confirm my order')]")
    private WebElement confirmOrderBtn;

    public OrderSummary() {
        PageFactory.initElements(driver, this);
    }

    public OrderConfirmationPage clickOnconfirmOrderBtn() throws Throwable {

        confirmOrderBtn.click();
        //action.click(driver, confirmOrderBtn);
        return new OrderConfirmationPage();
    }
}
