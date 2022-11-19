package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifaWorldCupPage extends BasePage {

    @FindBy(xpath = "//ul[@class='first-group']/li[1]/span/a/span[2]")
    public static WebElement fifaWorldCupLink;
    public FifaWorldCupPage(){
        PageFactory.initElements(driver,this);
    }
}
