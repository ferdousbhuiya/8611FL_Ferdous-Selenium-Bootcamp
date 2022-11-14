package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileOnlinePage extends BasePage {
    @FindBy(id = "exploreAllFeaturesLink")
    public WebElement getTheMobileAppButton;

    public MobileOnlinePage() {
        PageFactory.initElements(driver, this);
    }

    public MobileBankingFeatures selectDevice() {
        clickOnElement(getTheMobileAppButton);
        return new MobileBankingFeatures();
    }

}
