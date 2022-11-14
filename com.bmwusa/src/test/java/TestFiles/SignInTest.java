package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SignInTest extends BasePage {

    @Test
    public void testSignIn(){
        HomePage homePage = new HomePage();
        homePage.singInToMyBmw()
                .fillOutLoginForm()
                .clickOnMyBmw();
        assertTrue(isElementVisible(HomePage.logoutButton));
    }
}
