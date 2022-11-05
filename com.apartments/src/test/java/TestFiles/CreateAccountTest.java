package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class CreateAccountTest extends BasePage {
    @Test
    public void testSignUp() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToCreateAnAccount();
        waitForVisibilityOfElement(HomePage.createAccountText);
        assertTrue(HomePage.createAccountText.isDisplayed());
    }

    @Test
    public void validateToMyAccount()
    {
        HomePage homePage = new HomePage();
        homePage.navigateToMyAccount();
        waitForVisibilityOfElement(HomePage.createAccountText);
        assertTrue(HomePage.createAccountText.isDisplayed());
    }
}
