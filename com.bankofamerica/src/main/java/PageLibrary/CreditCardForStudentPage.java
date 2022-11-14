package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardForStudentPage extends BasePage {
    @FindBy(xpath = "//div[@class='action-buttons']/div/a[2][@id='home_4060817~PR~en_US']")
    public WebElement applyNowButton;


    public CreditCardForStudentPage() {
        PageFactory.initElements(driver, this);
    }

    public ApplicationFormCreditCard applyNow(){
        clickOnElement(applyNowButton);
        return new ApplicationFormCreditCard();
    }
}
