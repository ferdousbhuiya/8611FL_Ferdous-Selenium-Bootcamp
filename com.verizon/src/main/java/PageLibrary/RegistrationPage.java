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

    @FindBy(xpath = "//body/main[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
    public WebElement passwordInput;

    @FindBy(xpath = "//body/main[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
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
        jsClickOnElement(signInButton);
        return new MyVerizonDashboard();
    }



}
