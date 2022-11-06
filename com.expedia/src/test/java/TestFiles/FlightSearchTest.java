package TestFiles;

import PageLibrary.FlightSearchPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class FlightSearchTest extends BasePage {

    @Test
    public void testSearchingFlight() {
        HomePage homePage =new HomePage();
        homePage.searchFoFlight();
        waitForVisibilityOfElement(FlightSearchPage.chooseDepartingText);
        assertTrue(FlightSearchPage.chooseDepartingText.isDisplayed());
    }
}
