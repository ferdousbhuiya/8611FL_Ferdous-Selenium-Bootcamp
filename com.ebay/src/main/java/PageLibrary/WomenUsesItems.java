package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomenUsesItems extends BasePage {

    @FindBy(xpath = "//div[@id='mainContent']/section[2]/div[2]/a[1]")
    public WebElement luxuryWatch;

    @FindBy(xpath = "//div[@id='mainContent']/section[3]/div[2]/a[1]")
    public WebElement fineJewelry;

    @FindBy(xpath = "//section[@class='b-module b-module-related-event-listings clearfix']/ul[1]/li[5]//a")
    public WebElement watchOrRings;

    @FindBy(xpath = "//ul[contains(.,'Body Jewelry')]/li")
    public List<WebElement> JewellerySelectionList;


    @FindBy(xpath = "(//ul[@class='b-accordion-subtree'])[5]/li")
    public List<WebElement> RingSelection;

    @FindBy(xpath = "//ul[@aria-label='Save 20% off LeVian Great deals from an authorized reseller.']/li")
    public List<WebElement> RingSelections;

    @FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']/li")
    public List<WebElement> AnkletSeletction;

    public WomenUsesItems() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLuxuryWatch() {
        clickOnElement(luxuryWatch);
    }

    public ItemPage clickOnWatch() {
        clickOnElement(watchOrRings);
        return new ItemPage();
    }

    public ItemPage addWatchToCart() {
        clickOnLuxuryWatch();
        return clickOnWatch();
    }
    public void clickFineJewelry(){
        clickAnElementMatchingText(JewellerySelectionList, "Fine Jewelry");
        //clickOnElement(RingSelections.get(6));
        clickAnElementMatchingText(RingSelection, "Rings");
        clickOnElement(AnkletSeletction.get(45));
    }
    /*public ItemPage clickOnRing(){
        clickOnElement(watchOrRings);
        return new  ItemPage();
    }
    public ItemPage addRingToCart(){
        clickFineJewelry();
        return  clickOnRing();
    }*/
}
