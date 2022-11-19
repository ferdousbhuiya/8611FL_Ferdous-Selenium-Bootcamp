package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityPage extends BasePage {

@FindBy(xpath = "//h1[@role='heading']")
    public WebElement SecurityPageHeading;


public SecurityPage()
{
    PageFactory.initElements(driver, this);
}
}
