package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage extends BasePage {

    public TwitterPage()
    {
        PageFactory.initElements(driver, this);
    }
}
