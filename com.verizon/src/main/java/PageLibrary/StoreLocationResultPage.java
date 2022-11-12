package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreLocationResultPage extends BasePage {

    @FindBy(id = "slMap")
    public static WebElement mapPage;

    public StoreLocationResultPage(){
        PageFactory.initElements(driver,this);
    }

}

