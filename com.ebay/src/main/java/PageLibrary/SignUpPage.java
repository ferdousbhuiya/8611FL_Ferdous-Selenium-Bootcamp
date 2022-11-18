package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//li[@id='gh-eb-u']")
    public WebElement userNameDisplayed;

    public SignUpPage()
    {
        PageFactory.initElements(driver, this);
    }
}
