package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.RegistrationPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestRegistration extends BasePage {

    @Test
    public void testRegistration() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().clickRegisterButton().fillOutRegistrationForm();
        switchToFrameByElement(RegistrationPage.iframe);
        waitForVisibilityOfElement(RegistrationPage.challengeImages);
        assertTrue(RegistrationPage.challengeImages.isDisplayed());
    }
}
