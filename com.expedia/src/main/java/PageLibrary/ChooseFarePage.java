package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFarePage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Choose departing flight')]")
    public static WebElement chooseFareText;


    public ChooseFarePage(){
        PageFactory.initElements(driver,this);
    }

}
