package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddedNewCarPage extends BasePage {


    @FindBy(xpath = "//h1[contains(@class,'shopping-assist__intro--heading')]")
    public WebElement ThanksForNewCustomerText;


    @FindBy(xpath = "//h1[normalize-space()='Contact a Dealer']")
    public WebElement ThanksForNewCarText;


    public AddedNewCarPage()
    {
        PageFactory.initElements(driver, this);
    }

}
