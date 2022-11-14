package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;

public class WealthManagementPage extends BasePage {

    @FindBy(id="firstname-0")
    public WebElement firstNameInputField;

    @FindBy(id="lastname-0")
    public WebElement lastNameInputField;

    @FindBy(id="emailaddress-0")
    public WebElement emailInputField;

    @FindBy(id="confirmemailaddress-0")
    public WebElement confirmEmailInputField;

    @FindBy(id="businessphone-0")
    public WebElement phoneNumberInputField;

    @FindBy(id="zipcode-0")
    public WebElement zipCodeInputField;

    @FindBy(xpath="//div[@class='form--btn']/button")
    public WebElement getStartedButton;

    @FindBy(xpath="//p[@class='pdcContactForm--success__title']")
    public static WebElement confirmationMessage;
    public WealthManagementPage(){
        PageFactory.initElements(driver,this);
    }
    public void fillOutConnectForm()  {
        String email = GenerateData.email();
        sendKeysToElement(firstNameInputField, GenerateData.firstName());
        sendKeysToElement(lastNameInputField, GenerateData.lastName());
        sendKeysToElement(emailInputField, email);
        sendKeysToElement(confirmEmailInputField, email);
        sendKeysToElement(phoneNumberInputField, "7896793786");
        sendKeysToElement(zipCodeInputField, GenerateData.zipCode());
        clickOnElement(getStartedButton);
    }

}
