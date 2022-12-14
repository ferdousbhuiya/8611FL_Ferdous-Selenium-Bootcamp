package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends BasePage {

    @FindBy(xpath = "//span[@class='myAccount topBarText']")
    public WebElement usernameTextDisplay;

    @FindBy(xpath = "//div[@id='serverErrors']")
    public WebElement invaliduserNameText;

    @FindBy(xpath = "//a[normalize-space()='Verify Code']")
    public WebElement VerifyTextAfterSignup;


    public SigninPage()
    {
        PageFactory.initElements(driver, this);
    }

    public String invalidTextDisplay()
    {
        String text=invaliduserNameText.getText().trim();
        return text;
    }
}
