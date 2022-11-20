package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

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

    @Test
    public void subManuTest()
    {
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.subMenuTest();
        boolean flag = searchResultPage.subHeading.isDisplayed();
        assertTrue(flag);
    }
}
