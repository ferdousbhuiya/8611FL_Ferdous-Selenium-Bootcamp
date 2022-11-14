package TestFiles;

import PageLibrary.FlightSearchPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class FlightSelectionTest extends BasePage {

    @Test
    public void testSelectingFlight()  {
        HomePage homePage =new HomePage();
        homePage.searchFoFlight().selectFlight();
        waitForVisibilityOfElement(FlightSearchPage.farSelectedText);
        assertTrue(FlightSearchPage.farSelectedText.isDisplayed());
    }
}
