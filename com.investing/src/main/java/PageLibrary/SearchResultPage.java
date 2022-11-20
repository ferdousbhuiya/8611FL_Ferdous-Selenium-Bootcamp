package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {


    @FindBy(xpath = "//body[1]/div[5]/section[1]/div[1]/h1[1]")
    public WebElement subHeadingOfSearchPage;

    @FindBy(xpath = "//ul[@class = 'subNavUL']/li")
    public List<WebElement> PopularsubNavUL;

    @FindBy(xpath = "//h1[@class='text-2xl font-semibold content-header_title__qFtZ7']")
    public WebElement subHeading;

    public SearchResultPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void subMenuTest()
    {
        clickAnElementMatchingText(PopularsubNavUL, "Major Indices");
    }

}
