package PageLibrary;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@id='IDToken1']")
    public WebElement emailInInput;

    @FindBy(xpath = "//button[@id='continueBtn']")
    public WebElement continueButton;

    @FindBy(xpath = "(//input[@id='IDToken2'])[1]")
    public WebElement passwordInput;

    @FindBy(xpath = "(//button[@id='login-submit'])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "//h1[contains(text(),'Sign in')]")
    public static WebElement signInText;

    public RegistrationPage()
    {
        PageFactory.initElements(driver, this);
    }
    public MyVerizonDashboard SigninToAccount(String useremail, String pswd)
    {
        sendKeysToElement(emailInInput, useremail);
        emailInInput.sendKeys(Keys.ENTER);
        sendKeysToElement(passwordInput, pswd);
        waitForVisibilityOfElement(signInButton);
        clickOnElement(signInButton);
        return new MyVerizonDashboard();
    }



}
