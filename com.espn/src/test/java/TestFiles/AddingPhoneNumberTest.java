package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class AddingPhoneNumberTest extends BasePage {

    @Test
    public void testAddingPhoneNumber() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.singIn().addPhoneNumberEspnProfile();
        assertTrue(isElementVisible(HomePage.verifyMobileText));
    }
}
