package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class SignInPage extends BasePage {

    @FindBy(id = "loginFormEmailInput")
    public WebElement emailAddressInput;

    @FindBy(id = "loginFormPasswordInput")
    public WebElement passwordInput;

    @FindBy(id = "loginFormSubmitButton")
    public WebElement submitButton;

    @FindBy(xpath = "//iframe[@class='r34K7X1zGgAi6DllVF3T show active lightbox']")
    public static WebElement iframeParent;
    @FindBy(id = "fc-iframe-wrap")
    public static WebElement iframeSecondChild;
    @FindBy(xpath = "//div[@id='ctn-1']/iframe")
    public static WebElement iframeThirdChild;

    @FindBy(xpath = "//h2[contains(text(),'Verification')]")
    public static WebElement verificationText;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutSignInForm() throws SQLException {
        /*String email = "SELECT email FROM locations.Expedia where id =1;";
        String password = "SELECT Password FROM locations.Expedia where id =1;";
        clearSendKeysToElement(emailAddressInput, db.executeQueryReadOne(email).toString());
        clearSendKeysToElement(passwordInput, db.executeQueryReadOne(password).toString());
        */
        clearSendKeysToElement(emailAddressInput,excel.readStringArrays("Sheet1")[0][1]);
        clearSendKeysToElement(passwordInput, excel.readStringArrays("Sheet1")[0][2]);
        jsClickOnElement(submitButton);
        waitForVisibilityOfElement(iframeParent);
        switchToFrameByElement(iframeParent);
        waitForVisibilityOfElement(iframeSecondChild);
        switchToFrameByElement(iframeSecondChild);
        waitForVisibilityOfElement(iframeThirdChild);
        switchToFrameByElement(iframeThirdChild);
    }
}
