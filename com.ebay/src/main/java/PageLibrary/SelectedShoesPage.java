package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectedShoesPage extends BasePage {
    @FindBy(xpath = "//div[@class='pagecontainer__top']//h1")
    public static WebElement brandShoesName;

    @FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']/li")
    public List<WebElement> listOfAllJeans;
    public SelectedShoesPage(){
        PageFactory.initElements(driver,this);
    }
    public ItemPage selectShoes(){
        waitForVisibilityOfElement(listOfAllJeans.get(7));
        clickOnElement(listOfAllJeans.get(7));
        switchToTab();
        return new ItemPage();
    }
}
