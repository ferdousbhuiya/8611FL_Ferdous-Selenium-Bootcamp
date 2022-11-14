package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.GenerateData;

import java.util.List;

public class ApplicationFormCreditCard extends BasePage {
    @FindBy(id = "customerFirstName")
    public WebElement firstNameInputField;
    @FindBy(id = "customerLastName")
    public WebElement lastNameInputField;
    @FindBy(id = "customerResidentialAddressOne")
    public WebElement residentialInputField;
    @FindBy(id = "customerAddressCity")
    public WebElement cityInputField;
    @FindBy(id = "customerAddressState")
    public WebElement selectState;
    @FindBy(id = "customerAddressInput")
    public WebElement zipCodeInputField;
    @FindBy(id = "customerPrimaryPhoneNumber")
    public WebElement phoneNumberInputField;
    @FindBy(name = "phoneNumberType")
    public List<WebElement> mobilePhoneNUmberRadio;
    @FindBy(id = "customerEmailAddress")
    public WebElement emailAddressInputField;
    @FindBy(id = "icaiSaveApplication")
    public WebElement saveAndExitButton;

    public ApplicationFormCreditCard() {
        PageFactory.initElements(driver, this);
    }

    public SaveAndCompleteLaterPage fillOutThForm() {
        sendKeysToElement(firstNameInputField, GenerateData.firstName());
        sendKeysToElement(lastNameInputField, GenerateData.lastName());
        sendKeysToElement(residentialInputField, GenerateData.streetAddress());
        sendKeysToElement(cityInputField, GenerateData.city());
        Select select = new Select(selectState);
        select.selectByIndex(1);
        sendKeysToElement(zipCodeInputField, GenerateData.zipCode());
        sendKeysToElement(phoneNumberInputField, GenerateData.mobilePhone());
        for (WebElement r : mobilePhoneNUmberRadio) {
            if (r.getAttribute("value").equalsIgnoreCase("CellularPhone")) {
                Actions actions = new Actions(driver);
                actions.moveToElement(r).perform();
                r.isDisplayed();
                jsClickOnElement(r);
            }
        }
        sendKeysToElement(emailAddressInputField, GenerateData.email());
        clickOnElement(saveAndExitButton);
        return new SaveAndCompleteLaterPage();
    }

}
