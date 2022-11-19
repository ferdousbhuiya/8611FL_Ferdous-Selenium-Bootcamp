package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@class='custom-button __b secondary']")
    public WebElement registerButton;

    @FindBy(id = "email")
    public WebElement emailInputField;

    @FindBy(id = "password")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public static WebElement loginButton;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }



    public HomePage clickLoginButton(){
        clickOnElement(loginButton);
        return new HomePage();
    }



    public HomePage fillOutLoginForm(){
        sendKeysToElement(emailInputField, excel.readStringArrays("Sheet1")[0][0]);
        sendKeysToElement(passwordInputField, excel.readStringArrays("Sheet1")[0][1]);
        return clickLoginButton();
    }

    public RegistrationPage clickRegisterButton(){
        clickOnElement(registerButton);
        return new RegistrationPage();
    }
}
