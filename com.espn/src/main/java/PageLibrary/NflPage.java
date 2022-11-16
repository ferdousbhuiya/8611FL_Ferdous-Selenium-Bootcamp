package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NflPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'NFL Scoreboard')]")
    public static WebElement nflScoreText;
    public NflPage(){
        PageFactory.initElements(driver,this);
    }
}
