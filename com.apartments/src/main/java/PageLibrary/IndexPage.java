package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;
import java.util.List;

public class IndexPage extends BasePage {

    @FindBy(id = "headerMenuLink")
    public WebElement headerLink;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li")
    public List<WebElement> menuNavigationList;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li[4]/ul/li[1]/a")
    public WebElement subMenuAccount;

    @FindBy(xpath = "//i[@id='headerMeunIcon']")
    public List<WebElement> menuBarInHeading;

    @FindBy(id = "quickSearchLookup")
    public WebElement searchInput;

    @FindBy(id = "username")
    public WebElement userNameSignIn;

    @FindBy(id = "password")
    public WebElement passwordForSignin;

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    public WebElement signInButton;

    @FindBy(id = "headerAddProperty")
    public WebElement addAProperty;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public WebElement SignUpForNewAccount;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public WebElement SigninForExistingAccount;

    @FindBy(xpath = "//a[contains(text(),'Search')]")
    public WebElement searchButton;


    @FindBy(xpath = "//div[@class='modalBody']//iframe")
    public static WebElement iframe3ForAppleLogin;

    @FindBy(xpath = "//div[@id='loginContainer']//iframe")
    public static WebElement iframeLoginContainer;

    @FindBy(id = "googleLogin")
    public WebElement googleLogIn;

    @FindBy(id = "applelggin")
    public WebElement Applelogin;

    @FindBy(xpath = "//a[contains(text(),'View More')]")
    public WebElement moreAppartment;

    @FindBy(xpath = "//body[1]/div[1]/header[1]/nav[1]/div[2]/a[1]/span[1]")
    public WebElement changeLaguage;

    @FindBy(xpath = "//span[contains(text(),'Español')]")
    public WebElement Espanol;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }



    public NewAccountPage CreateNewAccount()
    {
        clickOnElement(SignUpForNewAccount);
        return new NewAccountPage();
    }

    public HelpCenterPage navigeteToHelpCenter()
    {
        clickOnElement(headerLink);
        waitForVisibilityOfElement(menuNavigationList.get(6));
        clickOnElement(menuNavigationList.get(6));
        switchToTab();
        return new HelpCenterPage();
    }


    public MoreAppartmentPage searchMoreAppartment()
    {
        clickOnElement(moreAppartment);
        return new MoreAppartmentPage();
    }

    public EspanolPage changeLanguage()
    {
        clickOnElement(changeLaguage);
        waitForVisibilityOfElement(Espanol);
        hoverOverElement(Espanol);
        jsClickOnElement(Espanol);

        return new EspanolPage();
    }

}
