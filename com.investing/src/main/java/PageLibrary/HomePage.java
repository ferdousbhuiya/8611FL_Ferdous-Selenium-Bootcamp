package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//a[@class='register bold']")
    public WebElement SignUpBtnOnHeaderHomePage;

    @FindBy(xpath = "//a[@class='login bold']")
    public WebElement SigninBtnOnHeaderHomePage;

    @FindBy(xpath = "//input[@id='loginFormUser_email']")
    public WebElement userEmailField;

    @FindBy(xpath = "//input[@id='loginForm_password']")
    public WebElement passwordField;

    @FindBy(xpath = "//a[@class='newButton orange']")
    public WebElement SigninButtonInsideForm;

    @FindBy(xpath = "//div[@id='signup']//a[@id='signUPBtn']")
    public WebElement SignupBtninsideForm;

    @FindBy(xpath = "//input[@id='in_user_firstname']")
    public WebElement FirstNameForSignUp;

    @FindBy(xpath = "//input[@id='in_user_lastname']")
    public WebElement LstNameForSignUp;

    @FindBy(xpath = "//input[@id='in_user_email']")
    public WebElement EmailForSignUp;

    @FindBy(xpath = "//input[@id='in_password']")
    public WebElement PasswordForSignUp;

    @FindBy(xpath = "//div[@id='signup']//a[@id='signUPBtn']")
    public WebElement SignUpbuttonForSignUp;

    @FindBy(xpath = "//input[@placeholder='Search the website...']")
    public WebElement SearchBox;

    @FindBy(xpath = "//label[@class='searchGlassIcon js-magnifying-glass-icon']")
    public WebElement Searchbutton;

    @FindBy(xpath = "//ul[@class='navMenuUL']/li")
    public List<WebElement> NavMunuUL;
    @FindBy(xpath = "//a[normalize-space()='Analysis']")
    public WebElement Analysismenu;

    @FindBy(xpath = "//a[normalize-space()='Technical']")
    public WebElement TechnicalAnalysis;

    @FindBy(xpath = "//ul[@class='popular']//a[normalize-space()='Candlestick Patterns']")
    public WebElement CandleStickpattern;

    @FindBy(xpath = "//h1[normalize-space()='Candlestick Patterns']")
    public WebElement CandleStickPatternListHeader;

    @FindBy(xpath = "//a[@id='markets_subnav_link']")
    public WebElement MarketIndices;

    @FindBy(xpath = "//h1[normalize-space()='United States - Financial Markets']")
    public WebElement marketIndicesListHeading;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public SigninPage SignInforExistingAccount(String usern, String psd)
    {
        safeClickOnElement(SigninBtnOnHeaderHomePage);
        sendKeysToElement(userEmailField,usern);
        sendKeysToElement(passwordField,psd);
        safeClickOnElement(SigninButtonInsideForm);
        return new SigninPage();
    }

    public void SignUpForNewAccount(String fstnm, String lstnm, String eml, String psword)
    {
        safeClickOnElement(SignUpBtnOnHeaderHomePage);
        safeClickOnElement(SignupBtninsideForm);
        sendKeysToElement(FirstNameForSignUp,fstnm);
        sendKeysToElement(LstNameForSignUp, lstnm);
        sendKeysToElement(EmailForSignUp, eml);
        sendKeysToElement(PasswordForSignUp, psword);
        safeClickOnElement(SignUpbuttonForSignUp);
    }

    public AnalysisPage Analysis()
    {
        clickAnElementMatchingText(NavMunuUL, "Analysis");
        return new AnalysisPage();
    }

    public SearchResultPage searchItems(String searchItem)
    {
        sendKeysToElement(SearchBox, searchItem);
        jsClickOnElement(Searchbutton);
        return new SearchResultPage();
    }

    public void moveToTechnicalAnalysis()
    {
        clickAnElementMatchingText(NavMunuUL, "Technical");
        //hoverOverElement(TechnicalAnalysis);
        scrollDown(CandleStickpattern);
        jsClickOnElement(CandleStickpattern);
    }

    public void marketindicesList()
    {
        jsClickOnElement(MarketIndices);
    }

    public ProfitCalculatorPage tools()
    {
        clickAnElementMatchingText(NavMunuUL, "Tools");
        return new ProfitCalculatorPage();
    }

}
