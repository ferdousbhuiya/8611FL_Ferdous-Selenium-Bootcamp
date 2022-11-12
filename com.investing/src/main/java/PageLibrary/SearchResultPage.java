package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {


    @FindBy(xpath = "//body[1]/div[5]/section[1]/div[1]/h1[1]")
    public WebElement subHeadingOfSearchPage;

    public SearchResultPage()
    {
        PageFactory.initElements(driver, this);
    }



}
