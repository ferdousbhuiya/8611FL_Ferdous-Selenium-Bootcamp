package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.StaysSearchResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HotelSelectionTest extends BasePage {

    @Test
    public void testSelectHotel() {
        HomePage homePage =new HomePage();
        homePage.searchForStay().selectHotel();
        waitForVisibilityOfElement(StaysSearchResultPage.verificationText);
        assertTrue(StaysSearchResultPage.verificationText.isDisplayed());
    }
}
