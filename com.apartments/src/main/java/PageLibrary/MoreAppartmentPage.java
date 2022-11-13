package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MoreAppartmentPage extends BasePage {


    @FindBy(xpath = "//h3[@id='mapResultBox']")
    public WebElement MoreAppartment;

}