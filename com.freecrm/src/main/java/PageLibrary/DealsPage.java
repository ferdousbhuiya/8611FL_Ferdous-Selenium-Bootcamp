package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class DealsPage extends BasePage {



    public DealsPage()
    {
        PageFactory.initElements(driver, this);
    }
}
