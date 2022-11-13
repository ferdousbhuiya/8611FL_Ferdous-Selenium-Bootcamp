package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {



    public SignInPage()
    {
        PageFactory.initElements(driver, this);
    }
}
