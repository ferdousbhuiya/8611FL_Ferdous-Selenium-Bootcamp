package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Inventory')]")
    public WebElement InventoryLinkButton;

    @FindBy(xpath = "//a[contains(text(),'View New Inventory')]")
    public WebElement ViewNewInventoryLink;

    @FindBy(xpath = "//iframe[@id='text-zoom-tracker']")
    public WebElement iframeToZipCodePage;

    @FindBy(xpath = "//div[@class=\"dealer-selector-location-search__bar\"]//input[@class=\"form__input-field form__input-field--can-reset\"]")
    public WebElement ZipCodeEntry;



    @FindBy(xpath = "//button[normalize-space()='Change Location']")
    public WebElement ChangeLocationButton;

    @FindBy(xpath = "//*[@class='form__radio-label']") // Value must be in between 0 to 7//
    public List<WebElement> distanceRadioButton;

    @FindBy(xpath = "//button[normalize-space()=\"View Inventory\"]")
    public WebElement ViewInventoryButton;

    @FindBy(xpath = "(//*[@class='form__checkbox-label filter-checkbox-control__label'])[v]")
    public WebElement DealerSelectionCheckBox;

    //All checkboxes (433, including car color, model everything)
    //    (//*[@class='form__checkbox-label filter-checkbox-control__label'])[v]


    @FindBy(xpath = "(//*[@class='form__checkbox-label filter-checkbox-control__label'])[ra]")
    public WebElement CheckBoxForInterior;

    @FindBy(xpath = "//a[@class=\"button button_primary shopping-assist-promo__cta\"]")
    public WebElement getStartedButton;

    @FindBy(xpath = "//div[contains(@class,'form__input form__checkbox-card--container')]")
    public List<WebElement> CarSelectionByPhoto;

    @FindBy(xpath = "//li[@class='step-navigation-card-ctas__item']")
    public WebElement continuebuttonFor;


    @FindBy(xpath = "form__checkbox-card--thumbnail--caption")
    public List<WebElement> PriceRangeSelector;

    @FindBy(xpath = "form__checkbox-card--thumbnail--caption")
    public List<WebElement> ExteriorColorChooser;

    @FindBy(xpath = "form__checkbox-card--thumbnail--caption")
    public List<WebElement> FeatureSelection;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement ContinueButtonAfterFeatureSelection;

    @FindBy(xpath = "//input[@id='shopping-assist-first-name']")
    public WebElement FirstNameOfCustomer;

    @FindBy(xpath = "//input[@id='shopping-assist-last-name']")
    public WebElement LastnameOfCustomer;

    @FindBy(xpath = "//input[@id='shopping-assist-email']")
    public WebElement EmailAddressOfCustomer;


    @FindBy(xpath = "form__checkbox-card--thumbnail--caption")
    public WebElement preferedCommunicationMethod;

    @FindBy(xpath = "//label[@for='shopping-assist-privacy-agreement']")
    public WebElement AgreeCheckBox;

    @FindBy(xpath = "//input[@id='shopping-assist-phone-number']")
    public WebElement CustomerPhoneNumber;

    @FindBy(xpath = "//button[@aria-label='Submit to Dealer']")
    public WebElement submitToDealerButton;


    public InventoryPage()
    {
        PageFactory.initElements(driver, this);
    }


    public AddedNewCarPage InventoryCheckToChooseACar()
    {
    safeClickOnElement(InventoryLinkButton);
    safeClickOnElement(ViewNewInventoryLink);
        sendKeysToElement(ZipCodeEntry, excel.readStringArrays("Sheet2")[5][0]);
        jsClickOnElement(ViewInventoryButton);
        hoverOverElement(getStartedButton);
        moveToElementAndClick(getStartedButton);

        return new AddedNewCarPage();
    }




}
