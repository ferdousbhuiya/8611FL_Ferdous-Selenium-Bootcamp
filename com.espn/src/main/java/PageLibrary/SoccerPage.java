package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoccerPage extends BasePage {

    @FindBy(xpath = "//ul[@class='first-group']/li[5]")
    public WebElement fifaWorldCupLink;
    public SoccerPage(){
        PageFactory.initElements(driver,this);
    }

    public FifaWorldCupPage  navigateToFifaWorldCupPage(){
        moveToElementAndClick(fifaWorldCupLink);
        return new FifaWorldCupPage();
    }
}
