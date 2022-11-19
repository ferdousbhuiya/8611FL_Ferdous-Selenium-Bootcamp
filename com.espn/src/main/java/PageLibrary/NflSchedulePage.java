package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NflSchedulePage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'NFL Schedule')]")
    public static WebElement nflScheduleText;
    public NflSchedulePage(){
        PageFactory.initElements(driver,this);
    }
}
