package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='global-header__menu-l1-list-button-label global-header__menu-l1-list-button-utility-inner']")
    public WebElement UserNameDisplay;

    @FindBy(xpath = "//span[@class='global-header__menu-l1-list-button-label']")
    public WebElement DealerSearch;

    @FindBy(xpath = "//input[@data-analytics-trigger='locator-search']")
    public WebElement zipCodeBoxForDealerSearch;

    @FindBy(xpath = "//button[@class='button button_primary']")
    public WebElement SearchButton;

    @FindBy(xpath = "//div[@class='dealer-result ']")
    public List<WebElement> DealerLocation;

    @FindBy(xpath = "//button[text()='Shopping']")
    public WebElement ShoppingLinkButton;


    @FindBy(xpath = "//a[contains(text(),'Vehicle Accessories')]")
    public WebElement vehicleAccessoriesLinkbtn;

    @FindBy(xpath = "//div[contains(@class,'vehicle-selector__years')]//span[@class='select-control__caret-icon']")
    public WebElement SelectYeardrpdwnMenu;

    @FindBy(xpath = "//li[@aria-label='2019' or @aria-label='2020' or @aria-label='2021' or @aria-label='2021'  or @aria-label='2022' or @aria-label='2023'  ]")
    public List<WebElement> yearDrpdwnlist;

    @FindBy(xpath = "//span[text()='Select Class']")
    public WebElement SelectClassdropdwnMenu;

    @FindBy(xpath = "//li[@class='select-control__option ']")
    public List<WebElement> ClassDrpdwnList;

    @FindBy(xpath = "//span[text()='Select Model']")
    public WebElement SelectModeldrpdwnMenu;

    @FindBy(xpath = "//li[@class='select-control__option ']")
    public List<WebElement> ModeldropdwnList;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    public WebElement SubmitbtnForAccessories;

    @FindBy(xpath = "//p[@class='stay-connected__subscribed-message']")
    public WebElement ThankYouNotice;

    @FindBy(xpath = "//h2[contains(text(),'How to Start a Charging Session')]")
    public WebElement InstructionPageheading;





    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public DealerLocationPage dealerSearch()
    {

        safeClickOnElement(DealerSearch);
        sendKeysToElement(zipCodeBoxForDealerSearch, excel.readStringArrays("Sheet2")[5][0]);
        safeClickOnElement(SearchButton);
        scrollDown(DealerLocation.get(0));
        safeClickOnElement(DealerLocation.get(0));
        return new DealerLocationPage();
    }


    public AccessoriesPage AccessoriesShopping()
    {
        moveToElementAndClick(ShoppingLinkButton);
        scrollBar(vehicleAccessoriesLinkbtn);
        safeClickOnElement(vehicleAccessoriesLinkbtn);
        moveToElementAndClick(SelectYeardrpdwnMenu);
        safeClickOnElement(yearDrpdwnlist.get(1));
        moveToElementAndClick(SelectClassdropdwnMenu);
        safeClickOnElement(ClassDrpdwnList.get(3));
        moveToElementAndClick(SelectModeldrpdwnMenu);
        safeClickOnElement(ModeldropdwnList.get(1));
        safeClickOnElement(SubmitbtnForAccessories);
        return new AccessoriesPage();
    }

    public String ShowingTheSubHeading()
    {
        String actualText = InstructionPageheading.getText();
        return actualText;
    }



}
