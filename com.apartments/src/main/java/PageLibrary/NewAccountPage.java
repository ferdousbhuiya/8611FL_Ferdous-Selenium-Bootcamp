package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage extends BasePage {


    @FindBy(xpath = " //p[contains(text(),'Create an account')]")
    public static WebElement CreateAccontHeading;


    public NewAccountPage() {
        PageFactory.initElements(driver, this);
    }


}

