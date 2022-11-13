package TestFiles;

import PageLibrary.AddPropertysPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class AddToPropertyTest extends BasePage {

    @Test
    public void testAddProperty() throws SQLException {

        HomePage homePage = new HomePage();
        homePage.signInUsingExistentAccount();
        homePage.navigateToPropertyPage().fillOutAddPropertyForm();
        waitForVisibilityOfElement(AddPropertysPage.addPropertyText);
        assertTrue(AddPropertysPage.addPropertyText.isDisplayed());
    }
}
