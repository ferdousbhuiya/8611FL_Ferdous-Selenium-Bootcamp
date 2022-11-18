package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchItemTest extends BasePage {

    @Test
    public void SearchingItemTest()  {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        homePage.searchForItems();
        String ext = getTrimmedElementText(searchResultPage.searchResult).substring(23);
        Assert.assertEquals(ext, homePage.Searchitem);

    }
}
