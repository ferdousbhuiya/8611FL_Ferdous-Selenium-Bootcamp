package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BasePage {

    @FindBy(id="cgv")
    private WebElement terms;

    @FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckOutBtn;

    public ShippingPage() {
        PageFactory.initElements(driver, this);
    }

    public void checkTheTerms() throws Throwable {
        terms.click();
    }

    public PaymentPage clickOnProceedToCheckOut() throws Throwable {

        proceedToCheckOutBtn.click();
        return new PaymentPage();
    }
}
