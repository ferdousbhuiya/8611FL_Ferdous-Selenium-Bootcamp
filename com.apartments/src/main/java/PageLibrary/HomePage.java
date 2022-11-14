package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='userMenuDropdown']/li")
    public List<WebElement> userMenuDropdown;

    @FindBy(xpath = "//ul[@class='userMenuDropdown']/li")
    public List<WebElement> SignImSignUpSubMenue;

    @FindBy(xpath = "//div[@id='headerLoginSection']/a")
    public List<WebElement> manageSignUpSignInBar;

    @FindBy(id = "quickSearchLookup")
    public WebElement searchInput;


    @FindBy(id = "signupFirstName")
    public WebElement firstName;

    @FindBy(id = "username")
    public WebElement userNameSignIn;

    @FindBy(id = "password")
    public WebElement existingaccountPassword;

    @FindBy(id = "loginButton")
    public WebElement signInButton;

    @FindBy(id = "headerAddProperty")
    public WebElement addAProperty;

    @FindBy(id = "signupLastName")
    public WebElement lastName;

    @FindBy(id = "signupEmail")
    public WebElement emailAddress;


    @FindBy(xpath = "//p[contains(text(),'Create an account')]")
    public static WebElement createAccountText;
    @FindBy(xpath = "//a[contains(text(),'Search')]")
    public WebElement searchButton;


    @FindBy(xpath = "//div[@id='loginContainer']//iframe")
    public static WebElement iframeLoginContainer;

    @FindBy(id = "googleLogin")
    public WebElement googleLogIn;

    @FindBy(id = "appleLogin")
    public WebElement AppleLogIn;

    @FindBy(id = "loginModalHeader")
    public static WebElement signInIntoYourAccountText;

    @FindBy(xpath = "//div[@id='username']//button//i")
    public WebElement StroyIconDown;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage signInUsingExistentAccount() throws SQLException {
        String passwordInput = "SELECT password FROM locations.password where id=4;";
        String emailInput = "SELECT email FROM locations.emails where emailID=3;";
        clickOnElement(manageSignUpSignInBar.get(2));
        waitForVisibilityOfElement(iframeLoginContainer);
        switchToFrameByElement(iframeLoginContainer);
        waitForVisibilityOfElement(userNameSignIn);
        sendKeysToElement(userNameSignIn, db.executeQueryReadOne(emailInput).toString());
        sendKeysToElement(existingaccountPassword, db.executeQueryReadOne(passwordInput).toString());
        waitForVisibilityOfElement(signInButton);
        clickOnElement(signInButton);

        //For testing of database purpose:
        System.out.println("username is : "+db.executeQueryReadOne(emailInput).toString()+"  The password is:  "+db.executeQueryReadOne(passwordInput).toString());

        return new HomePage();
    }

    public void navigateToCreateAnAccount()  {
        clickOnElement(manageSignUpSignInBar.get(1));
        sendKeysToElement(firstName, GenerateData.firstName());
        waitForVisibilityOfElement(lastName);
        sendKeysToElement(lastName, GenerateData.lastName());
        waitForVisibilityOfElement(emailAddress);
        sendKeysToElement(emailAddress, GenerateData.email());

    }

    public void signInWithGoogleAccount() {
        clickOnElement(manageSignUpSignInBar.get(2));
        waitForVisibilityOfElement(iframeLoginContainer);
        switchToFrameByElement(iframeLoginContainer);
        clickOnElement(googleLogIn);
        switchToParentFrame();
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
        clickOnElement(StroyIconDown);
        clickOnElement(SignImSignUpSubMenue.get(2));
       clickOnElement(userMenuDropdown.get(0));
       return new MyAccountsPage();
    }


    public void signInWithAppleAccount() {
        clickOnElement(manageSignUpSignInBar.get(2));
        waitForVisibilityOfElement(iframeLoginContainer);
        switchToFrameByElement(iframeLoginContainer);
        clickOnElement(AppleLogIn);
        switchToParentFrame();
    }


}
