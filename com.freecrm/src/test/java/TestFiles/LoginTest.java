package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.LoginPage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BasePage {


    @Test
    public void testingLogOut()  {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().logOut();
        waitForVisibilityOfElement(LoginPage.loginButton);
        assertTrue(LoginPage.loginButton.isDisplayed());

    }

    @Test
    public void LogInTest()  {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login();
        waitForVisibilityOfElement(UserAccountPage.DisplayedUserName);
        assertTrue(UserAccountPage.DisplayedUserName.isDisplayed());
    }

}
