package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaveAndCompleteLaterPage extends BasePage {

    @FindBy(id = "icaiContinueButton")
    public static WebElement saveAndComplete;
    public SaveAndCompleteLaterPage(){
        PageFactory.initElements(driver,this);

    }
}
