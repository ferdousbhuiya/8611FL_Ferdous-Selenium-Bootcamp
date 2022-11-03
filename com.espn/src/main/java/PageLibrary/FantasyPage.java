package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FantasyPage extends BasePage {

    @FindBy(xpath = "//span[@class='positioning']//a[@itemprop='url']//span[@class='link-text'][contains(text(),'Fantasy')] ")
    public static WebElement FantasyLogo;

    public FantasyPage()
    {
        PageFactory.initElements(driver, this);
    }


}
