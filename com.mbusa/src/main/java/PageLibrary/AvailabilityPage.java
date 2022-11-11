package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvailabilityPage extends BasePage {

    @FindBy(xpath = "//h1[normalize-space()=\"Availability Notice\"]")
    public WebElement AvailabilityNotice;

    public AvailabilityPage()

    {
        PageFactory.initElements(driver, this);
    }
}
