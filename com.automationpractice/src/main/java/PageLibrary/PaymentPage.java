package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Pay by bank wire')]")
    private WebElement bankWireMethod;

    @FindBy(xpath = "//a[contains(text(),'Pay by check')]")
    private WebElement payByCheckMethod;

    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }

    public OrderSummary clickOnPaymentMethod() throws Throwable {

        bankWireMethod.click();
        //action.click(driver, bankWireMethod);
        return new OrderSummary();
    }
}
