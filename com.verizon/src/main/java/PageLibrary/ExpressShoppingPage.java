package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class ExpressShoppingPage extends BasePage {

public ExpressShoppingPage()
{
    PageFactory.initElements(driver, this);
}
}
