package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {
    public SignUpPage()
    {
        PageFactory.initElements(driver, this);
    }
}
