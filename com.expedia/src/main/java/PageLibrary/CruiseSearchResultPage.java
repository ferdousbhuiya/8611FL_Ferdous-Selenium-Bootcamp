package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CruiseSearchResultPage extends BasePage {

    //a[@href='?pwaLob=wizard-cruise-pwa']
    @FindBy(xpath = "//span[normalize-space()='Cruises']")
    public WebElement CruiseSearch;

    @FindBy(id = "cruise-destination")
    public WebElement CruiseDestination;

    @FindBy(xpath = "//button[@class='cruise-destination-dialog-trigger uitk-fake-input uitk-form-field-trigger']")
    public WebElement dropdownBoxForCuriseDestination;

    @FindBy(xpath = "//span[normalize-space()='Europe']")
    public WebElement placeforCruiseDestination;

    @FindBy(xpath = "//button[@id='d1-btn']")
    public WebElement DatepickerForCruiseStart;

    @FindBy(xpath = "//button[@id='d2-btn']")
    public WebElement DatepickerForCruiseDestination;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement SearchButtonofCruise;
    public CruiseSearchResultPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void SelectCruise()  {
        for(int i=1; i<=7; i++){
            waitForVisibilityOfElement(CruiseSearch);
            clickOnElement(CruiseSearch);
            switchToTab();
            safeClickOnElement(CruiseDestination);
            String Destination = excel.readStringArrays("Sheet2")[i][1];
            System.out.println("the Destination is: " + Destination);
            fluentWait(driver);
            selectFromDropdownByVisibleText(CruiseDestination, Destination);
            safeClickOnElement(DatepickerForCruiseStart);
            safeClickOnElement(DatepickerForCruiseDestination);
            safeClickOnElement(SearchButtonofCruise);
        }

    }

    private void fluentWait(WebDriver driver) {
    }

}
