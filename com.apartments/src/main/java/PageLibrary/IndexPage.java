package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
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

    @FindBy(id = "loginButton")
    public WebElement signInButton;

    @FindBy(id = "headerAddProperty")
    public WebElement addAProperty;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public WebElement SignUpForNewAccount;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public WebElement SigninForExistingAccount;

    @FindBy(id = "newPw")
    public WebElement password;

    @FindBy(id = "NewPasswordConfirm")
    public WebElement confirmPassword;

    @FindBy(id = "setNewPassword")
    public WebElement setPasswordButton;

    @FindBy(xpath = "//p[contains(text(),'Create an account')]")
    public static WebElement createAccountText;
    @FindBy(xpath = "//a[contains(text(),'Search')]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='signupReCaptcha']/div//iframe")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='finalizeRegistrationForm']//iframe")
    public WebElement iframe2;

    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/iframe[1]")
    public static WebElement iframe3;

    @FindBy(xpath = "//div[@id='loginContainer']//iframe")
    public static WebElement iframeLoginContainer;

    @FindBy(id = "googleLogin")
    public WebElement googleLogIn;

    @FindBy(xpath = "//span[contains(text(), 'Continue with Apple')]")
    public WebElement Applelogin;
    @FindBy(xpath = "//div[@id='headerLoginSection']/a")
    public List<WebElement> manageSignUpSignInBar;

    @FindBy(xpath = "//a[contains(text(),'View More')]")
    public WebElement moreAppartment;

    @FindBy(xpath = "//body[1]/div[1]/header[1]/nav[1]/div[2]/a[1]/span[1]")
    public WebElement changeLaguage;

    @FindBy(xpath = "//span[contains(text(),'Español')]")
    public WebElement Espanol;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }


    public IndexPage signInUsingExistentAccount() throws SQLException {
        String passwordInput = "SELECT password FROM locations.password where id=4;";
        String emailInput = "SELECT email FROM locations.emails where emailID=3;";
        clickOnElement(SigninForExistingAccount);
        waitForVisibilityOfElement(iframeLoginContainer);
        switchToFrameByElement(iframeLoginContainer);
        waitForVisibilityOfElement(userNameSignIn);
        sendKeysToElement(userNameSignIn, db.executeQueryReadAll("emailInput").toString());
        sendKeysToElement(passwordForSignin, db.executeQueryReadAll("passwordInput").toString());
        waitForVisibilityOfElement(signInButton);
        clickOnElement(signInButton);
        //System.out.println("username is : "+excel.readStringArrays("Aptmnt")[3][4]+"  Your password is "+excel.readStringArrays("Aptmnt")[3][1]);

        return new IndexPage();
    }

    public AppartmentResultsPage searchApartments() {
        clickOnElement(searchInput);
        clearSendKeysToElement(searchInput, GenerateData.city());
        jsClickOnElement(searchButton);
        return new AppartmentResultsPage();
    }
 
    public AddPropertysPage navigateToPropertyPage() {
        waitForVisibilityOfElement(addAProperty);
        clickOnElement(addAProperty);
        return new AddPropertysPage();
    }

    public MyAccountsPage navigateToMyAccount() {
        clickOnElement(headerLink);
        clickOnElement(menuNavigationList.get(3).findElement(By.tagName("a")));
        waitForVisibilityOfElement(subMenuAccount);
        clickOnElement(subMenuAccount);
        return new MyAccountsPage();
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

    public void signInWithAppleAccount() {
        clickOnElement(manageSignUpSignInBar.get(4));
        waitForVisibilityOfElement(iframeLoginContainer);
        switchToFrameByElement(iframeLoginContainer);
        clickOnElement(Applelogin);
        switchToParentFrame();
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
