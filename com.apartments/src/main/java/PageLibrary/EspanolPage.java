package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EspanolPage extends BasePage {

@FindBy(xpath = "//a[contains(@class,'header-is-selected-language')]//span[contains(text(),'Español')]")
public WebElement EspanolLanguage;


    public EspanolPage()
    {
        PageFactory.initElements(driver, this);
    }
}
