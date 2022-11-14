package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class FranchiseFinancePage extends BasePage {

    @FindBy(id="firstName")
    public WebElement firstNameInputField;

    @FindBy(id="lastName")
    public WebElement lastNameInputField;

    @FindBy(id="company")
    public WebElement companyNameInputField;

    @FindBy(id="state")
    public WebElement selectBusinessInputField;

    @FindBy(id="email")
    public WebElement emailInputField;

    @FindBy(id="phone")
    public WebElement phoneInputField;

    @FindBy(id="financingType")
    public WebElement selectFinancingInputField;

    @FindBy(id="Submit_Your_Request_CTA")
    public WebElement submitButton;


    public FranchiseFinancePage(){
        PageFactory.initElements(driver,this);

    }
    public SmallBusinessFinancialAdvicePage fillOutTheForm(){
        sendKeysToElement(firstNameInputField, GenerateData.firstName());
        sendKeysToElement(lastNameInputField, GenerateData.lastName());
        sendKeysToElement(companyNameInputField, GenerateData.city());
        selectFromDropdownByIndex(selectBusinessInputField,2);
        sendKeysToElement(emailInputField, GenerateData.email());
        sendKeysToElement(phoneInputField, GenerateData.mobilePhone());
        selectFromDropdownByIndex(selectFinancingInputField,1);
        clickOnElement(submitButton);
        return new SmallBusinessFinancialAdvicePage();
    }
}
