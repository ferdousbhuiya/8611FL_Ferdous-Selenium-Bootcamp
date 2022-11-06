package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaysSearchResultPage extends BasePage {

    @FindBy(xpath = "//section[@data-stid='search-results__main']")
    public static WebElement searchResult;
    @FindBy(xpath = "//body/div[@id='app-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/a[1]")
    public static WebElement hotel;

    @FindBy(xpath = "//a[@class='uitk-header-brand-logo']")
    public static WebElement verificationText;

    public StaysSearchResultPage(){
        PageFactory.initElements(driver,this);
    }
    public void selectHotel()  {
        waitForVisibilityOfElement(hotel);
        clickOnElement(hotel);
        switchToTab();
    }

}
