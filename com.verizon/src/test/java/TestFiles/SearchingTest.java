package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SearchingTest extends BasePage {

    @Test
    public void searchTesting()
    {
        HomePage homePage= new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        homePage.searchinganItem();
        String text = searchResultPage.SearchResultpageSearcBox.getText();
        assertEquals(searchResultPage.searchedItem.getAttribute("value").trim().toLowerCase(),excel.readStringArrays("Sheet2")[1][0]);
    }
}
