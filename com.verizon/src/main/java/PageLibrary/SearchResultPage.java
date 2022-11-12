package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//input[@id='search_box_one_search_input']")
    public WebElement SearchResultpageSearcBox;

    @FindBy(xpath = "//div[normalize-space()='Suggested filters for \"Samsung\"']")
    public WebElement searchSelection;

    @FindBy(xpath = "//div[@class='listContainer']/li")
    public List<WebElement> suggestedItemList;

    @FindBy(id = "search_box_one_search_input")
    public static WebElement searchedItem;

    public SearchResultPage()
    {
        PageFactory.initElements(driver, this);
    }




}
