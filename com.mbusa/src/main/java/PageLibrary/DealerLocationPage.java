package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class DealerLocationPage extends BasePage {

    public DealerLocationPage()
    {
        PageFactory.initElements(driver, this);
    }
}
