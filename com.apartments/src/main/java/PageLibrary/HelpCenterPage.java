package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage extends BasePage {

    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[1]/a[1]/img[1]")
    public WebElement HelpCenterLogo;


    public HelpCenterPage()
    {
        PageFactory.initElements(driver, this);
    }
}
