package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleMusicPage extends BasePage {

    @FindBy(xpath = "https://www.verizon.com/solutions-and-services/apple-music/")
    public WebElement AppleMusicPageURL;

    public AppleMusicPage()
    {
    PageFactory.initElements(driver, this);
    }
}

