package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayStorePage extends BasePage {

    @FindBy(xpath ="//div[@class='bGJWSe']//div[@class='u4ICaf']//button")
    public static WebElement installButton;

    public PlayStorePage(){
        PageFactory.initElements(driver,this);
    }
}
