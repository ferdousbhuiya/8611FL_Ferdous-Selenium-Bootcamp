package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationCenter extends BasePage {

    @FindBy(xpath = "//div[@class='location-information-wrapper']")
    public static WebElement locationCenterName;

    public LocationCenter() {
        PageFactory.initElements(driver, this);
    }
}
