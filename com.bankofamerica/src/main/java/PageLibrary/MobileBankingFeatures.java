package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class MobileBankingFeatures extends BasePage {

    @FindBy(id = "header_get_app")
    public WebElement getTheApp;
    @FindBy(id = "getAppDeviceSelect")
    public WebElement selectYourDeviceDropDown;
    @FindBy(id = "appChoiceSubmit")
    public WebElement goButton;
    @FindBy(xpath = "//select[@id='getAppDeviceSelect']/option[1]")
    public WebElement iphoneOperatingSystem;
    @FindBy(id = "phoneNumberFieldiPhone")
    public WebElement phoneNumberInputField;
    @FindBy(id = "sendToDeviceBtniPhone")
    public WebElement sendButton;
    @FindBy(id= "globalGetAppModalContent_title")
    public static WebElement sendConfirmation;

    public MobileBankingFeatures() {
        PageFactory.initElements(driver, this);
    }

    public void getTheApp() {
        clickOnElement(getTheApp);
        clickOnElement(selectYourDeviceDropDown);
        clickOnElement(iphoneOperatingSystem);
        clickOnElement(goButton);
        sendKeysToElement(phoneNumberInputField, GenerateData.mobilePhone());
        clickOnElement(sendButton);
    }
}
