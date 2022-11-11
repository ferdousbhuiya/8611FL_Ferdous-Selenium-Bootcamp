package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerSupportPage extends BasePage {



    @FindBy(xpath = "//a[text()='Customer Support']")
    public WebElement CustomerSupportHeading;

    public CustomerSupportPage()
    {
        PageFactory.initElements(driver, this);
    }
}
