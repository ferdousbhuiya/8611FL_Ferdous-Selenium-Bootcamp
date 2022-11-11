package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage extends BasePage {

    @FindBy(xpath = "//a[.='Contact Us']")
    public WebElement ContactUsButton;

    @FindBy(xpath = "//span[contains(.,'Chat With Us')]")
    public WebElement ChattingwithDealerlink;


    public ContactusPage()
    {
        PageFactory.initElements(driver, this);
    }


    public CustomerSupportPage NavigateToCustomerSupport()
    {
        moveToElementAndClick(ContactUsButton);
        safeClickOnElement(ChattingwithDealerlink);
        switchToTab();
        return new CustomerSupportPage();

    }
}
