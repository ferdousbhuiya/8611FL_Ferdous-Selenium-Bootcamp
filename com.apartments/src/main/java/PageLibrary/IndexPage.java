package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {



    public IndexPage()
    {
        PageFactory.initElements(driver, this);
    }

}
