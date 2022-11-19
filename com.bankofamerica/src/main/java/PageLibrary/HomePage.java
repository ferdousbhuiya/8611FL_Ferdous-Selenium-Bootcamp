package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='main-nav-links']/li[1]/a[@id='navChecking']")
    public WebElement checkingButton;
    @FindBy(id = "navCheckingOnlineBanking")
    public WebElement onlineBankingLink;
    @FindBy(xpath = "//ul[@class='main-nav-links']/li[2]/a[@id='navSavings']")
    public WebElement savingsButton;
    @FindBy(id = "cdAccount")
    public WebElement CDsLink;
    @FindBy(xpath = "//ul[@class='main-nav-links']/li[3]/a[@id='navCreditCards']")
    public WebElement creditCardButton;
    @FindBy(id = "cardsForStudents")
    public WebElement creditCardForStudentButton;
    @FindBy(xpath = "//ul[@class='main-nav-links']/li[4]/a[@id='navHomeLoans']")
    public WebElement homeLoansButton;
    @FindBy(id = "findAHome")
    public WebElement findAHomeLink;
    @FindBy(xpath = "//ul[@class='main-nav-links']/li[5]/a[@id='navAutoLoans']")
    public WebElement autoLoansButton;
    @FindBy(id = "shopForCar")
    public WebElement shopForCarLink;

    @FindBy(id = "finCenterLocator")
    public WebElement findClosetCenterLink;

    @FindBy(id = "useAutoLoanCalculator")
    public WebElement autoLoanCalculatorLink;

    @FindBy(xpath = "//a[@id='NAV_EN_ES']")
    public WebElement ChangeLaguage;

    @FindBy(xpath = "//a[@id='NAV_EN_ES']")
    public WebElement EnglishPageIndication;

    @FindBy(xpath = "(//ul[@role='navigation'])[1]/li")
    public List<WebElement> MainNavigationBar;

    @FindBy(xpath = "//a[contains(@id,'getCompleteDetails')]")
    public WebElement SecurityDetalisBtn;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public MobileOnlinePage clickOnlineBankingLink() {
        clickOnElement(checkingButton);
        clickOnElement(onlineBankingLink);
        return new MobileOnlinePage();
    }

    public CdAccountPage savingClickOnCDsLink() {
        clickOnElement(savingsButton);
        clickOnElement(CDsLink);
        return new CdAccountPage();
    }

    public CreditCardForStudentPage clickOnStudentCreditCards() {
        clickOnElement(creditCardButton);
        clickOnElement(creditCardForStudentButton);
        return new CreditCardForStudentPage();
    }

    public FindYourDreamHomePage clickHomeLoanLink() {
        clickOnElement(homeLoansButton);
        clickOnElement(findAHomeLink);
        return new FindYourDreamHomePage();
    }

    public ShopVehiclesPage clickAutoLoanLink() {
        clickOnElement(autoLoansButton);
        clickOnElement(shopForCarLink);
        return new ShopVehiclesPage();
    }

    public WealthManagementPage clickWealthManagementLink() {

        clickAnElementMatchingText(MainNavigationBar, "Wealth Management");
        return new WealthManagementPage();
    }

    public void ChangelanguageToSpanish()
    {
        safeClickOnElement(ChangeLaguage);
    }


    public FinancialCenterPage clickFinancialCenterLink(){
        clickOnElement(findClosetCenterLink);
        return new FinancialCenterPage();
    }
    public SmallBusinessPage clickSmallBusinessLink(){

        clickAnElementMatchingText(MainNavigationBar, "Small Business");
        return  new SmallBusinessPage();
    }

    public AutoLoanCalculator clickAutoLoanCalculator(){
        clickOnElement(autoLoansButton);
        clickOnElement(autoLoanCalculatorLink);
        return new AutoLoanCalculator();
    }

    public void NavigateToSecurityPage()
    {
        clickAnElementMatchingText(MainNavigationBar, "Security");
        moveToElementAndClick(SecurityDetalisBtn);
    }

}
