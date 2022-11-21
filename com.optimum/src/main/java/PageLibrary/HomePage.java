package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class = 'bui-group bui-button-group bui-group--inline bui-group--align-end bui-group--vertical-align-middle']/div")
    public List<WebElement> MainNavBar;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "(//span[@class='yfCvx60qsR50VNBG15jF'])[2]")
    public WebElement continueWithEmailBtn;

    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement FirstpasswordInputForRegistration;

    @FindBy(xpath = "//input[@id='confirmed_password']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "(//a[@class='wl252-modal__skip'])[3]")
    public WebElement skipButton;


    @FindBy(xpath = "//input[@id='ss']")
    public WebElement SearchField;

    @FindBy(xpath = "//div[contains(@data-mode,'checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]")
    public WebElement CheckInDate;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }


    public void RegisterTo()
    {
        String password  = "Asdfghjkl123#";
        clickAnElementMatchingText(MainNavBar, "Register");
        sendKeysToElement(usernameInput, GenerateData.email());
        safeClickOnElement(continueWithEmailBtn);
        sendKeysToElement(FirstpasswordInputForRegistration, password);
        sendKeysToElement(confirmPassword, password);
        clickOnElement(continueButton);
        safeClickOnElement(skipButton);

    }

    public void searchForVisitLocation()
    {
        clearSendKeysToElement(SearchField, "Florida");
        clearSendKeysToElement(CheckInDate, "Wed, Nov 30");
    }
}
