package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class AddPropertysPage extends BasePage {
    @FindBy(id = "iframeAddProperty")
    public WebElement iframeAddProperty;

    @FindBy(xpath = "//div[@class='recaptcha']/div//iframe")
    public WebElement iframeCheckBox;

    @FindBy(id = "unitQuantityTypeSingle")
    public WebElement singleUnitButton;

    @FindBy(id = "cpid1-address")
    public WebElement addressInput;

    @FindBy(id = "cpid1-propertyType")
    public WebElement selectProperty;

    @FindBy(id = "cpid2-0beds")
    public WebElement selectBed;

    @FindBy(id = "cpid2-0baths")
    public WebElement selectBath;

    @FindBy(id = "recaptcha-anchor")
    public WebElement checkBox;

    @FindBy(id = "mat-option-21")
    public WebElement singleFamilyHouse;

    @FindBy(id = "mat-option-2")
    public WebElement twoBed;

    @FindBy(id = "mat-option-8")
    public WebElement oneBath;

    @FindBy(id = "mat-option-40")
    public WebElement address;


    @FindBy(xpath = "//button[contains(text(),' Add My Property ')]")
    public WebElement addPropertyButton;

    @FindBy(xpath = "//p[contains(text(),'Add Your Property')]")
    public static WebElement addPropertyText;


    public AddPropertysPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void fillOutAddPropertyForm() {
        waitForVisibilityOfElement(iframeAddProperty);
        switchToFrameByElement(iframeAddProperty);
        moveToElementAndClick(singleUnitButton);
        waitForVisibilityOfElement(addressInput);
        sendKeysToElement(addressInput, GenerateData.streetAddress());
        clickOnElement(selectProperty);
        clickOnElement(singleFamilyHouse);
        clickOnElement(selectBed);
        waitForVisibilityOfElement(twoBed);
        clickOnElement(twoBed);
        clickOnElement(selectBath);
        clickOnElement(oneBath);

    }
}
