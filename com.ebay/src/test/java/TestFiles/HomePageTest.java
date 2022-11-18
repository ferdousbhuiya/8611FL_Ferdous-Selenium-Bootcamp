package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SignUpPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomePageTest extends BasePage {

    @Test
    public void SignUpTest()
    {
        HomePage homePage = new HomePage();
        SignUpPage signUpPage = new SignUpPage();
        homePage.SignUp();
        waitForVisibilityOfElement(signUpPage.userNameDisplayed);
        String expected  = signUpPage.userNameDisplayed.getText();
        String actual = "Hi "+homePage.Firstname+"!";
        Assert.assertEquals(expected, actual);
    }
}
