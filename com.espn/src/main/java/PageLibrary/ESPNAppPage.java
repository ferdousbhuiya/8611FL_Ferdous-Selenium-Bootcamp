package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESPNAppPage extends BasePage {
    @FindBy(id = "btn-android-top")
    public WebElement androidLink;

    public ESPNAppPage() {
        PageFactory.initElements(driver, this);
    }

    public PlayStorePage downloadAndroidApp() {
        clickOnElement(androidLink);
        return new PlayStorePage();
    }

}
