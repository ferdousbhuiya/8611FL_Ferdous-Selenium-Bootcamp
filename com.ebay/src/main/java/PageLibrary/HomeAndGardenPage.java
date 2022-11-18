package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndGardenPage extends BasePage {

    @FindBy(xpath = "//div[@id='mainContent']/section[3]/div[2]/a[1]")
    public WebElement furniture;

    @FindBy(xpath = "//div[@id='mainContent']/section[2]/div[2]/a[1]")
    public WebElement holidayAndSeasonalDecor;

    @FindBy(xpath = "//section[@class='b-module b-module-related-event-listings clearfix']/ul[1]/li[5]//a")
    public WebElement drawerOrPersonalizedChristmas;

    public HomeAndGardenPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnFurniture(){
        clickOnElement(furniture);
    }
    public void clickOnHolidaySeasonalDecor(){
        clickOnElement(holidayAndSeasonalDecor);
    }
    public ItemPage clickOnDrawerOrPersonalizedChristmas(){
        clickOnElement(drawerOrPersonalizedChristmas);
        return new ItemPage();
    }
    public ItemPage addItemsToCart(){
        clickOnFurniture();
        return clickOnDrawerOrPersonalizedChristmas();
    }
    public ItemPage SpecialDayItemAdd(){
        clickOnHolidaySeasonalDecor();
        return clickOnDrawerOrPersonalizedChristmas();
    }
}
