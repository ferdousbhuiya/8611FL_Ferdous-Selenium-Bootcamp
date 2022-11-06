package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SignInPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BasePage {

    @Test
    public void testingLogin() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.signIn().fillOutSignInForm();
        waitForVisibilityOfElement(SignInPage.verificationText);
        assertTrue(SignInPage.verificationText.isDisplayed());
    }
}
