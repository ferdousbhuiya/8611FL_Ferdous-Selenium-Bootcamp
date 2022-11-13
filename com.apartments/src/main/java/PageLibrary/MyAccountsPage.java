package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountsPage extends BasePage {


    @FindBy(xpath = "//h1[normalize-space()='My Account']")
    public WebElement MyAccountText;

    @FindBy(xpath = "//iframe[@name='AccountSettingIframe']")
    public WebElement iframeOfAccountSettings;


    public MyAccountsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public String getText() throws InterruptedException {
        switchToFrameByElement(iframeOfAccountSettings);
        Thread.sleep(12000); // Takes very long time to load the oage
        String te = MyAccountText.getText();
        return te;
    }
}
