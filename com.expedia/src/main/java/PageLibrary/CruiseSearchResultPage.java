package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CruiseSearchResultPage extends BasePage {

    @FindBy(xpath = "//span[normalize-space()='Cruises']")
    public WebElement CruiseSearch;

    @FindBy(id = "cruise-destination")
    public WebElement CruiseDestination;


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
            waitForVisibilityOfElement(CruiseSearch);
            clickOnElement(CruiseSearch);
            switchToTab();
            safeClickOnElement(CruiseDestination);
            String Destination = excel.readStringArrays("Sheet2")[1][1];
            System.out.println("the Destination is: " + Destination);
            selectFromDropdownByVisibleText(CruiseDestination, Destination);
            safeClickOnElement(DatepickerForCruiseStart);
            safeClickOnElement(DatepickerForCruiseDestination);
            safeClickOnElement(SearchButtonofCruise);
        }

    }



