package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;
import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='global-navigation-row-container']/div/div[2]/a[2]")
    public WebElement supportLink;

    @FindBy(xpath = "//div[@class='global-navigation-row-container']/div/div[2]/button")
    public static WebElement LanguageChange;

    @FindBy(id = "site-selector")
    public WebElement selectCountry;

    @FindBy(id = "language-selector")
    public WebElement selectLanguage;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;


    @FindBy(xpath = "//div[@class='global-navigation-row-container']/div/div[2]/div[1]//button")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id='wizardMainRegionV2']//div[@class='uitk-tabs-container']/ul/li")
    public List<WebElement> tabContainer;


    @FindBy(xpath = "//form[@id='wizard-hotel-pwa-v2-1']/div[2]/div//button[@data-stid='location-field-destination-menu-trigger']")
    public WebElement goingToInputField;

    @FindBy(id = "d1-btn")
    public WebElement checkInButton;

    @FindBy(xpath = "//div[@class='uitk-date-picker date-picker-menu']/div/div[2]/div[1]//tbody/tr[4]/td[5]")
    public WebElement checkInPickUpDate;

    @FindBy(xpath = "//div[@class='uitk-date-picker date-picker-menu']/div/div[2]/div[1]//tbody/tr[5]/td[2]")
    public WebElement checkoutDate;

    @FindBy(xpath = "//div[@class='uitk-date-picker date-picker-menu']/div[2]//button")
    public WebElement doneButton;

    @FindBy(xpath = "//ul[@class='no-bullet']/li[2]//button")
    public WebElement destination;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement searchButton;


    @FindBy(xpath = "//div[@id='location-field-leg1-origin-menu']/div[1]/div[1]//button")
    public WebElement leavingFromInput;

    @FindBy(xpath = "//div[@id='location-field-leg1-destination-menu']/div[1]//button")
    public WebElement goingToInput;

    @FindBy(id = "location-field-leg1-origin")
    public WebElement departureInputSearch;

    @FindBy(id = "location-field-leg1-destination")
    public WebElement destinationInputSearch;

    @FindBy(xpath = "//ul[@data-stid='location-field-leg1-origin-results']/li[1]/button")
    public WebElement departureAirport;

    @FindBy(xpath = "//ul[@data-stid='location-field-leg1-destination-results']/li[1]/button")
    public WebElement arrivalAirport;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement searchFlightButton;

    @FindBy(xpath = "//div[@id='location-field-locn-menu']/div[1]/div[1]//button")
    public WebElement pickUpButton;

    @FindBy(id = "location-field-locn")
    public WebElement pickUpSearchInput;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement confirmSignInButton;

    @FindBy(xpath = "//button[@aria-label='Things to do in']")
    public WebElement ButtonfortheLocationOfThingsTodo;

    @FindBy(xpath = "//input[@id='location-field-location']")
    public WebElement locationFieldForToDoThings;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement SearchTheLocationForToDo;


    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public SignInPage signIn() {
        jsClickOnElement(signInButton);
        jsClickOnElement(confirmSignInButton);
        return new SignInPage();
    }public StaysSearchResultPage searchForStay() {

        clickOnElement(goingToInputField);
        clickOnElement(destination);
        clickOnElement(checkInButton);
        clickOnElement(checkInPickUpDate);
        clickOnElement(checkoutDate);
        clickOnElement(doneButton);
        clickOnElement(searchButton);
        return new StaysSearchResultPage();
    }
    public FlightSearchPage searchFoFlight() {
        clickOnElement(tabContainer.get(1).findElement(By.tagName("a")));
        clickOnElement(leavingFromInput);
        sendKeysToElement(departureInputSearch, excel.readStringArrays("Sheet1")[0][3]);
        clickOnElement(departureAirport);
        clickOnElement(goingToInput);
        sendKeysToElement(destinationInputSearch, excel.readStringArrays("sheet1")[0][4]);
        clickOnElement(arrivalAirport);
        clickOnElement(checkInButton);
        clickOnElement(checkInPickUpDate);
        clickOnElement(checkoutDate);
        clickOnElement(doneButton);
        clickOnElement(searchFlightButton);
        return new FlightSearchPage();
    }

    public CarSearchResultPage searchingCar() {
        clickOnElement(tabContainer.get(2).findElement(By.tagName("a")));
        clickOnElement(pickUpButton);
        sendKeysToElement(pickUpSearchInput, excel.readStringArrays("Sheet1")[0][3]);
        clickOnElement(destination);
        clickOnElement(checkInButton);
        clickOnElement(checkInPickUpDate);
        clickOnElement(checkoutDate);
        clickOnElement(doneButton);
        clickOnElement(searchButton);
        return new CarSearchResultPage();
    }

    public SupportPage chatWithVirtualAgent() {
        clickOnElement(supportLink);
        return new SupportPage();
    }

    public void switchCountryLanguage() {
        clickOnElement(LanguageChange);
        waitForVisibilityOfElement(selectCountry);
        selectFromDropdownByIndex(selectCountry,38);
        selectFromDropdownByIndex(selectLanguage,0);
        clickOnElement(saveButton);
    }


    public ThingsToDoResultPage ThingsTodo()
    {
        clickOnElement(tabContainer.get(4));
        clickOnElement(ButtonfortheLocationOfThingsTodo);
        sendKeysToElement(locationFieldForToDoThings, "Miami");
        locationFieldForToDoThings.sendKeys(Keys.ENTER);
        clickOnElement(checkInButton);
        clickOnElement(checkInPickUpDate);
        clickOnElement(doneButton);
        clickOnElement(SearchTheLocationForToDo);
        return new ThingsToDoResultPage();
    }
}
