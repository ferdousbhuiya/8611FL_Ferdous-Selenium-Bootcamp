package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//button[@data-analytics-trigger='search']")
    public WebElement Searchbutton;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement SearchTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SearchButtonAfterputtingText;

    @FindBy(xpath = "//span[normalize-space()='Load More']")
    public WebElement LoadMoreButton;

    @FindBy(xpath = "//h2[contains(@class,'search-results__result-title')]")
    public List<WebElement> Searchsuggestionlist;

    @FindBy(xpath = "//div[@class='all-vehicles__class module-separator']")
    public List<WebElement> CarSelectionList;

    @FindBy(xpath = "//a[normalize-space()='View All Mercedes-Benz Vehicles']")
    public WebElement MoreMecedezbtton;

    @FindBy(xpath = "//a[@class='button button_primary model-section__cta-build ']")
    public List<WebElement> BuildButtonForChoosenCar;

    @FindBy(xpath = "//a[@class='model-line-selector__line-btn button button_primary button--full-width']")
    public List<WebElement> StartBuildButton;

    @FindBy(xpath = "//button[normalize-space()='Continue My Build']")
    public WebElement ContinueButton;

    public SearchPage()
    {
        PageFactory.initElements(driver, this);
    }


    public AvailabilityPage searchingItem() throws InterruptedException {
        moveToElementAndClick(Searchbutton);
        sendKeysToElement(SearchTextBox, excel.readStringArrays("Sheet3")[3][0]);
        clickOnElement(SearchButtonAfterputtingText);
        moveToElementAndClick(LoadMoreButton);
        Thread.sleep(5000); // Need long time to wait.
        moveToElementAndClick(LoadMoreButton);
        fluentWait.until(ExpectedConditions.elementToBeClickable(Searchsuggestionlist.get(13)));
        moveToElementAndClick(Searchsuggestionlist.get(13));
        safeClickOnElement(MoreMecedezbtton);
        hoverOverElement(CarSelectionList.get(2));
        safeClickOnElement(CarSelectionList.get(5));
        moveToElementAndClick(BuildButtonForChoosenCar.get(2));
        return new AvailabilityPage();
    }




}
