package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage extends BasePage {
    IndexPage indexPage = new IndexPage();


    @FindBy(id = "signupFirstName")
    public WebElement firstName;

    @FindBy(id = "signupLastName")
    public WebElement lastName;

    @FindBy(id = "signupEmail")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@id='signupIndustryProfessional']")
    public WebElement checkBoxOfIamProfessional;

    @FindBy(id = "recaptcha-anchor")
    public WebElement recapchacheckBox;
    @FindBy(xpath = " //p[contains(text(),'Create an account')]")
    public static WebElement CreateAccontHeading;

    @FindBy(xpath = "//button[@id='signupBtn']")
    public WebElement SignUpbtnForCreateAcct;

    @FindBy(xpath = "//div[@class='dropdownMenu open']")
    public WebElement IamaBrokerOrAgent;

    @FindBy(xpath = "//div[@id='signupReCaptcha']/div//iframe")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='finalizeRegistrationForm']//iframe")
    public WebElement iframe2;

    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/iframe[1]")
    public static WebElement iframe3;


    public NewAccountPage() {
        PageFactory.initElements(driver, this);
    }


}

