package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(id = "NAV_WEALTH_MANAGEMENT")
    public WebElement wealthManagementLink;


    @FindBy(id = "footer_bofa_careers")
    public WebElement careerLink;

    @FindBy(id = "finCenterLocator")
    public WebElement findClosetCenterLink;

    @FindBy(id = "NAV_BUSINESS_ADVANTAGE")
    public WebElement smallBusinessLink;

    @FindBy(id = "useAutoLoanCalculator")
    public WebElement autoLoanCalculatorLink;

    @FindBy(id = "visitBetterMoneyHabitsTabletUp")
    public WebElement visitBetterMoneyHabitButton;

    @FindBy(xpath = "//ul[@class='main-nav-links']/li[7]/a[@id='navInvesting']")
    public WebElement investingButton;

    @FindBy(xpath = "//a[@id='NAV_EN_ES']")
    public WebElement ChangeLaguage;

    @FindBy(xpath = "//a[@id='NAV_EN_ES']")
    public WebElement EnglishPageIndication;



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
        clickOnElement(wealthManagementLink);
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
        clickOnElement(smallBusinessLink);
        return  new SmallBusinessPage();
    }

    public AutoLoanCalculator clickAutoLoanCalculator(){
        clickOnElement(autoLoansButton);
        clickOnElement(autoLoanCalculatorLink);
        return new AutoLoanCalculator();
    }

}
