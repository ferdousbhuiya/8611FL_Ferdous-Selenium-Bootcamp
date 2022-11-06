package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.StaysSearchResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class StayTest extends BasePage {

    @Test
    public void testSearchForStay(){
        HomePage homePage =new HomePage();
        homePage.searchForStay();
        waitForVisibilityOfElement(StaysSearchResultPage.searchResult);
        assertTrue(StaysSearchResultPage.searchResult.isDisplayed());
    }
}
