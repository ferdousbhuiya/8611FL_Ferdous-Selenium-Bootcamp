package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePasswordPage extends BasePage {

    @FindBy(id="iFrameResizer0")
    public static WebElement iframeofCreatepassword;

    @FindBy(xpath = "//h2[contains(text(),'Create a password')]")
    public static WebElement createAPasswordText;


    public CreatePasswordPage()
    {
        PageFactory.initElements(driver, this);
    }
}
