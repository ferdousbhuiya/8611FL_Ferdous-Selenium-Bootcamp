package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyingCdsAccountPage extends BasePage {

    @FindBy(id = "byaSelectedProductDepositsModule")
    public static WebElement startApplicationForm;



    public ApplyingCdsAccountPage(){
        PageFactory.initElements(driver,this);
    }
}
