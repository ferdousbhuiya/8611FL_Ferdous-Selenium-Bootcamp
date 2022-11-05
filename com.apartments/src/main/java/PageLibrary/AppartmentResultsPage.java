package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppartmentResultsPage extends BasePage {


    @FindBy(xpath = "//label[contains(text(),'Renter View')]")
    public static WebElement renterViewText;


    public AppartmentResultsPage()
    {
        PageFactory.initElements(driver, this);
    }
}
