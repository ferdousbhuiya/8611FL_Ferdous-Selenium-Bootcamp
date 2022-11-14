package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SignOutTest extends BasePage {
    @Test
    public void testSignOut(){
        HomePage homePage = new HomePage();
        homePage.singInToMyBmw()
                .fillOutLoginForm()
                .clickOnMyBmw()
                .clickLogoutButton();
        assertTrue(isElementVisible(LoginPage.loginButton));
    }

}
