package TestFiles;

import PageLibrary.SearchPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTest extends BasePage {

    @Test
    public void SearchingTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        boolean flag = searchPage.searchingItem().AvailabilityNotice.isDisplayed();
        assertTrue(flag);
    }
}
