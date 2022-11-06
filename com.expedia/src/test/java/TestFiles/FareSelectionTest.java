package TestFiles;

import PageLibrary.ChooseFarePage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class FareSelectionTest extends BasePage {

    @Test
    public void testSelectingFare() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.searchFoFlight().selectFlight().selectFare();
        waitForVisibilityOfElement(ChooseFarePage.chooseFareText);
        assertTrue(ChooseFarePage.chooseFareText.isDisplayed());

    }
}
