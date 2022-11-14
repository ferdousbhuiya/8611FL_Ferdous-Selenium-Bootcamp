package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThingsToDoResultPage extends BasePage {

    @FindBy(xpath = "//section[4]//h2[1]")
    public WebElement ThigsToDoSubHeading;


    public ThingsToDoResultPage()
    {
        PageFactory.initElements(driver, this);
    }


    public String TextOfSubheading()
    {
        waitForThePresenceOfTheElement(By.xpath("//section[4]//h2[1]"));
        String txt = ThigsToDoSubHeading.getText();
        return txt;
    }
}
