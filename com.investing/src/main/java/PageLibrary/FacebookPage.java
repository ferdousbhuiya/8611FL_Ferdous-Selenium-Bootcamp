package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends BasePage {

    public FacebookPage()
    {
        PageFactory.initElements(driver, this);
    }

}
