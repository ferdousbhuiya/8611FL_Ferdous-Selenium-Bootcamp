package PageLibrary;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class IndexPage extends BasePage {

    @FindBy(xpath = "//span[@class='global-header__menu-l1-list-button-label global-header__menu-l1-list-button-utility-inner']")
    public WebElement SigninButtonIndexPage;

    @FindBy(xpath = "//button[contains(@class,'nav-profile__login nav-profile__button button button_primary button--wide')]")
    public WebElement LoginToContinue;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//button[@id='continue']")
    public WebElement ContinueBtnForLogin;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordInputBox;

    @FindBy(xpath = "//button[@id='confirm']")
    public WebElement NextBtnForLogin;


    @FindBy(xpath = "//input[@type='text']")
    public WebElement emailForSubscription;

    @FindBy(xpath = "//span[contains(.,'Subscribe')]")
    public WebElement SubscriptionButton;


    @FindBy(xpath = "//a[@title='YouTube']")
    public WebElement youtubeLink;

    @FindBy(xpath = "//a[@href='/en/charge']")
    public WebElement ChargingInstructions;

    @FindBy(xpath = "//a[contains(text(),'Charge on the Go')]")
    public WebElement ChargingOnTheGobtn;


    public IndexPage()
    {
        PageFactory.initElements(driver, this);
    }


    public HomePage LognIn(String usrnm, String pswd)
    {
        safeClickOnElement(SigninButtonIndexPage);
        safeClickOnElement(LoginToContinue);
        sendKeysToElement(userNameInputBox, usrnm);
        safeClickOnElement(ContinueBtnForLogin);
        sendKeysToElement(PasswordInputBox, pswd);
        safeClickOnElement(NextBtnForLogin);
        return new HomePage();
    }

    public HomePage subscriptionbyEmail() throws InterruptedException {
        HomePage homePage = new HomePage();
        sendKeysToElement(emailForSubscription, GenerateData.email());
        safeClickOnElement(SubscriptionButton);
        waitForVisibilityOfElement(homePage.ThankYouNotice);
        return new HomePage();
    }


    public  void visitTheYoutubePage()
    {
        safeClickOnElement(youtubeLink);
        switchToTab();
    }

    public HomePage visitTheChargingInstruction()
    {
        scrollDown(ChargingInstructions);
        safeClickOnElement(ChargingInstructions);
        scrollBar(ChargingOnTheGobtn);
        jsClickOnElement(ChargingOnTheGobtn);
        return new HomePage();

    }






}
