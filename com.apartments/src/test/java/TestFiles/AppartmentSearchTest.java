package TestFiles;

import PageLibrary.AppartmentResultsPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class AppartmentSearchTest extends BasePage {
    @Test
    public void validateAppartmentSearchTest() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.signInUsingExistentAccount().searchApartments();
        waitForVisibilityOfElement(AppartmentResultsPage.renterViewText);
        assertTrue(AppartmentResultsPage.renterViewText.isDisplayed());
    }
}
