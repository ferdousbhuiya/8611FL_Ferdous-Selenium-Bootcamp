package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class X4ModelPage extends BasePage {

    @FindBy(xpath = "//div[@class='globalnav-local__fixed-shell']")
    public static WebElement theX4Title;
    public X4ModelPage(){
        PageFactory.initElements(driver,this);
    }
}
