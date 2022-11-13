package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class EspanolPage extends BasePage {


    public EspanolPage()
    {
        PageFactory.initElements(driver, this);
    }
}
