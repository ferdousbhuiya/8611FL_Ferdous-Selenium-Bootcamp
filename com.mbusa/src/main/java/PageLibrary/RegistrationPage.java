package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//span[@class='global-header__menu-l1-list-button-label global-header__menu-l1-list-button-utility-inner']")
    public WebElement MyAccountLink;

    @FindBy(xpath = "//button[@class='nav-profile__register nav-profile__link ']")
    public WebElement RegisterLinkButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UsernameInputField;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement FirstNameField;

    @FindBy(xpath = " //input[@id='lastname']")
    public WebElement LastnameField;


    @FindBy(xpath = " //input[@id='password']")
    public WebElement passwordField;


    @FindBy(xpath = "//input[@id='legaltext0']")
    public WebElement IAgreeCheckBox;


    @FindBy(xpath = "//button[.='Create a user account']")
    public WebElement CreateAnUserAccountButton;



    public RegistrationPage()
    {
        PageFactory.initElements(driver, this);
    }

    public RegistrationConfirmationPage RegisterNewAccount(String eml, String fnam, String lnm, String pswd)
    {
        moveToElementAndClick(MyAccountLink);
        jsClickOnElement(RegisterLinkButton);
        sendKeysToElement(UsernameInputField,eml);
        sendKeysToElement(FirstNameField, fnam);
        sendKeysToElement(LastnameField, lnm);
        sendKeysToElement(passwordField, pswd);
        jsClickOnElement(IAgreeCheckBox);
        moveToElementAndClick(CreateAnUserAccountButton);
        return new RegistrationConfirmationPage();



    }



}
