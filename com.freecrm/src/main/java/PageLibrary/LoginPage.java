package PageLibrary;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LoginPage extends BasePage {
    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailAddressInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public static WebElement loginButton;



    public UserAccountPage login()  {
        clearSendKeysToElement(emailAddressInput, excel.readStringArrays("Sheet1")[0][0]);
        clearSendKeysToElement(passwordInput,excel.readStringArrays("Sheet1")[0][1]);
        clickOnElement(loginButton);
        return new UserAccountPage();

    }
}
