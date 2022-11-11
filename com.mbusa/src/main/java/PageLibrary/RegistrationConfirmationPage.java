package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationPage extends BasePage {

    @FindBy(xpath = "//div[@class='ciam-titlebar']")
    public WebElement CpnfirmationTitlebar;

    public RegistrationConfirmationPage()
    {
        PageFactory.initElements(driver, this);

    }
}
