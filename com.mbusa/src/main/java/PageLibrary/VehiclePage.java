package PageLibrary;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.time.Duration;
import java.util.List;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "//button[text()='Vehicles']")
    public WebElement VehiclesLinkButton;

    @FindBy(xpath = "//a[contains(@class,'global-header__vehicles-link-list-item-link')][normalize-space()='Special Offers']")
    public WebElement specialOffer;

    @FindBy(xpath = "(//input[contains(@data-analytics-trigger,'locator-search')])[2]")
    public WebElement enterZipCode;

    @FindBy(xpath = "//a[@class='offer__cta offer__cta--button button button_primary']")
    public List<WebElement> IAmInterestedButton ;

    @FindBy(xpath = "//li[@class='dealer-result-list-item']")
    public List<WebElement> ChoseADealer;

    @FindBy(xpath = "//section[@class=\"leads-form__your-details leads-form__section\"]//section//div[1]//input[1]")
    public WebElement FirstName;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement lastName;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement EmailForNewCar;

    @FindBy(xpath = "//label[@for='privacy-checkbox']")
    public WebElement CheckBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SubmitButton;




    public VehiclePage()
    {
        PageFactory.initElements(driver, this);
    }

    public AddedNewCarPage CheckSpecialOffer() {
            moveToElementAndClick(VehiclesLinkButton);
            jsClickOnElement(specialOffer);
            jsClickOnElement(IAmInterestedButton.get(40));
            clearSendKeysToElement(enterZipCode, excel.readStringArrays("Sheet2")[5][0]);
            enterZipCode.sendKeys(Keys.ENTER);
            webDriverWait.pollingEvery(Duration.ofSeconds(10));
            safeClickOnElement(ChoseADealer.get(5));
            clearSendKeysToElement(FirstName, GenerateData.firstName());
            clearSendKeysToElement(lastName, GenerateData.lastName());
            sendKeysToElement(EmailForNewCar, GenerateData.email());
            jsClickOnElement(CheckBox);
            hoverOverElement(SubmitButton);
            safeClickOnElement(SubmitButton);
        return new AddedNewCarPage();



    }
}
