package PageLibrary;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(id = "gnav20-sign-id")
    public WebElement SigninfromHomePage;

    @FindBy(xpath = "//div[@class='gnav20-utility-wrapper']//div//a[@aria-label='Stores'][normalize-space()='Stores']")
    public WebElement StoreLink;

    @FindBy(xpath = "//button[@id='gnav20-search-icon-mobile']")
    public WebElement SearchIcon;


    @FindBy(xpath = "//input[@id='search_box_gnav_input']")
    public WebElement SearchInputBox;

    @FindBy(xpath = "//ul[@class='gnav20-dropdown']/li[2]")
    public WebElement SignInToMyAccountButton;

    @FindBy(xpath = "//button[@id='gnav20-Shop-L1']")
    public WebElement shopLinkinHomePage;

    @FindBy(id = "gnav20-Shop-L2-3")
    public WebElement deviceLink;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L3-1']")
    public WebElement smartPhoneLink;


    @FindBy(xpath = "//a[@data-label='Español']")
    public WebElement ChangingLanguage;

    @FindBy(xpath = "//button[@id='gnav20-Shop-L1']")
    public WebElement ShopButton;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L2-8']")
    public WebElement EntertainmentLink;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L3-32']")
    public WebElement AppleMusicLink;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L2-5']")
    public WebElement PlansLink;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L3-14']")
    public WebElement InternationalServicLink;

    @FindBy(xpath = "//a[@aria-label='Follow Verizon Fios on Facebook']//*[name()='svg']")
    public WebElement followinFacebook;


    @FindBy(xpath = "//a[@data-label='Stores']")
    public WebElement StoreLocationButton;


    @FindBy(xpath = "//span[contains(@class,'support_header_title')][normalize-space()='Chat with us']")
    public WebElement ChatWithUsBox;

    @FindBy(xpath = "//span[contains(text(),'Make a Payment')]")
    public WebElement makeApaymentBox;

    @FindBy(xpath = "//span[contains(text(),'Billing and payments')]")
    public WebElement billingAndPaymentBox;

    @FindBy(xpath = "//span[normalize-space()='Mobile']")
    public WebElement MobileBox;
    @FindBy(xpath = "//a[@id='gnav20-Support-L2-5']")
    public WebElement ContactUslink;

    @FindBy(xpath = "//button[@id='gnav20-Support-L1']")
    public WebElement Supportlink;



    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public ChattingPage supportForMobileService()  {
        ChattingPage chattingPage = new ChattingPage();
        safeClickOnElement(Supportlink);
        safeClickOnElement(ContactUslink);
        hoverOverElement(MobileBox);
        safeClickOnElement(MobileBox);
        hoverOverElement(billingAndPaymentBox);
        waitForVisibilityOfElement(billingAndPaymentBox);
        safeClickOnElement(billingAndPaymentBox);
        hoverOverElement(makeApaymentBox);
        scrollDown(makeApaymentBox);
        safeClickOnElement(makeApaymentBox);
        scrollDown(ChatWithUsBox);
        waitForVisibilityOfElement(ChatWithUsBox);

        return new ChattingPage();

    }
    public RegistrationPage signintoRegistrationPage()
    {
        waitForVisibilityOfElement(SigninfromHomePage);
        safeClickOnElement(SigninfromHomePage);
        scrollDown(SignInToMyAccountButton);
        clickOnElement(SignInToMyAccountButton);
        return new RegistrationPage();
    }

    public SearchResultPage searchinganItem()
    {
        SearchResultPage searchResultPage = new SearchResultPage();
        safeClickOnElement(SearchIcon);
        clearSendKeysToElement(SearchInputBox, excel.readStringArrays("Sheet2")[1][0]);
        SearchInputBox.sendKeys(Keys.ENTER);
        return new SearchResultPage();

    }


    public ShoppingItemsPage shoppingSmartPhone() {
        clickOnElement(shopLinkinHomePage);
        waitForVisibilityOfElement(deviceLink);
        clickOnElement(deviceLink);
        waitForVisibilityOfElement(smartPhoneLink);
        clickOnElement(smartPhoneLink);
        return new ShoppingItemsPage();
    }

    public void changingLanguage()
    {
        safeClickOnElement(ChangingLanguage);
    }

    public void NavigateToAppleMusicPage()
    {
        safeClickOnElement(ShopButton);
        hoverOverElement(EntertainmentLink);
        safeClickOnElement(EntertainmentLink);
        scrollDown(AppleMusicLink);
        AppleMusicLink.sendKeys(Keys.ENTER);
    }


    public void NavigateToInternationalService()
    {
        safeClickOnElement(ShopButton);
        hoverOverElement(PlansLink);
        safeClickOnElement(PlansLink);
        scrollDown(InternationalServicLink);
        InternationalServicLink.sendKeys(Keys.ENTER);
    }

    public void followInFacebookPage()
    {
        scrollDown(followinFacebook);
        safeClickOnElement(followinFacebook);
    }

    public StoreLocationsPage searchStoreLocation()
    {
        safeClickOnElement(StoreLocationButton);
        return new StoreLocationsPage();
    }

}
