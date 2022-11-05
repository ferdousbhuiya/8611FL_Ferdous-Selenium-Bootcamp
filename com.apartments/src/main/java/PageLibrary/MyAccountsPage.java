package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage extends BasePage {

    public MyAccountsPage()
    {
        PageFactory.initElements(driver, this);
    }
}
