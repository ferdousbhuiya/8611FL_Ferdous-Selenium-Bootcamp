package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "headerMenuLink")
    public WebElement headerLink;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li")
    public List<WebElement> menuNavigationList;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li[4]/ul/li[1]/a")
    public WebElement subMenuAccount;


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

    @FindBy(id = "recaptcha-anchor")
    public WebElement checkBox;

    @FindBy(id = "signupBtn")
    public WebElement signUpButton;

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

    @FindBy(id = "loginModalHeader")
    public static WebElement signInIntoYourAccountText;


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

    public void navigateToCreateAnAccount() throws SQLException {
        String passwordInput = "SELECT password FROM locations.password where id=4;";
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
        clickOnElement(headerLink);
        clickOnElement(menuNavigationList.get(3).findElement(By.tagName("a")));
        waitForVisibilityOfElement(subMenuAccount);
        clickOnElement(subMenuAccount);
        return new MyAccountsPage();
    }

}
