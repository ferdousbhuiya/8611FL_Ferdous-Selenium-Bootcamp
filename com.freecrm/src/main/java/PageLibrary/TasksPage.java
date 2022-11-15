package PageLibrary;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends BasePage {

    public TasksPage()
    {
        PageFactory.initElements(driver, this);
    }



}
