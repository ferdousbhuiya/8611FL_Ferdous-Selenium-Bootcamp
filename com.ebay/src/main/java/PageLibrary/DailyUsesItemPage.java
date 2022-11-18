package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DailyUsesItemPage extends BasePage {
    @FindBy(xpath = "//div[@id='mainContent']/section[3]/div[2]/a[4]")
    public WebElement jeans;

    @FindBy(xpath = "(//div[@class='b-visualnav__grid'])[2]/a")
    public List<WebElement> MensWearList;


    public DailyUsesItemPage() {
        PageFactory.initElements(driver, this);
    }

    public ShoesSelectionPage navigateToShoesSelection() {

        clickAnElementMatchingText(MensWearList, "Men's Shoes");
        return new ShoesSelectionPage();
    }
}
