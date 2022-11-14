package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestSignInUsingGoogleAccount extends BasePage {
    @Test
    public void testSignUpUsingGoogleAccount()  {
        HomePage homePage=new HomePage();
        homePage.signInWithGoogleAccount();
        switchToFrameByElement(HomePage.iframeLoginContainer);
        waitForVisibilityOfElement(HomePage.signInIntoYourAccountText);
        assertTrue(HomePage.signInIntoYourAccountText.isDisplayed());
    }

    @Test
    public void signinUsingAppleAccount()
    {
        HomePage homePage = new HomePage();
        homePage.signInWithAppleAccount();
        switchToFrameByElement(HomePage.iframeLoginContainer);
        waitForVisibilityOfElement(HomePage.signInIntoYourAccountText);
        assertTrue(HomePage.signInIntoYourAccountText.isDisplayed());


    }



}
