package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultTestPage extends BasePage {

    @Test
    public void searchresultTest()
    {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        homePage.searchItems();
        waitForVisibilityOfElement(searchResultPage.subHeadingOfSearchPage);
        String actual = searchResultPage.subHeadingOfSearchPage.getText();
        Assert.assertEquals(actual, "Search Results for \"dollar\":");

    }
}
