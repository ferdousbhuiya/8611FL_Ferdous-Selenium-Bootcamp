package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class SignInTest extends BasePage {

    @Test
    public void testSignIn() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.singIn();
        hoverOverElement(HomePage.userIcon);
        assertTrue(isElementVisible(HomePage.signOutButton));

    }

}
