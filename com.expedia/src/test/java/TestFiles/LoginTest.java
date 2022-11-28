package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SignInPage;
import base.BasePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BasePage {

    @Test
    public void testingLogin()  {
        HomePage homePage = new HomePage();
        String uEmail = excel.readStringArrays("Sheet1")[0][1];
        String uPassword = excel.readStringArrays("Sheet1")[0][2];
        homePage.signIn().fillOutSignInForm(uEmail, uPassword);
        waitForVisibilityOfElement(SignInPage.verificationText);
        assertTrue(SignInPage.verificationText.isDisplayed());
    }


    @Test(dataProvider = "DifferentCredentials")
    public void loginwithincorrentCredential(String uEml, String uPaswd)  {
        HomePage homePage = new HomePage();
        homePage.signIn().fillOutSignInForm(uEml, uPaswd);
        waitForVisibilityOfElement(SignInPage.verificationText);
        assertTrue(SignInPage.verificationText.isDisplayed());
    }

    @DataProvider
    public Object[][] DifferentCredentials()
    {
        String [][] data;
        data = excel.readStringArrays("DifferentSignIn");
        return data;
    }
}
