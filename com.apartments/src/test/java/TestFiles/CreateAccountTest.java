package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MyAccountsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class CreateAccountTest extends BasePage {
    @Test
    public void SignUpTest()  {
        HomePage homePage =new HomePage();
        homePage.navigateToCreateAnAccount();
        waitForVisibilityOfElement(HomePage.createAccountText);
        assertTrue(HomePage.createAccountText.isDisplayed());
    }

    @Test
    public void validateToMyAccount() throws SQLException, InterruptedException {
        HomePage homePage = new HomePage();
        homePage.signInUsingExistentAccount();
        homePage.navigateToMyAccount();
        String text = driver.getCurrentUrl();
        Assert.assertEquals(text, "https://www.apartments.com/my-account/#");
    }



}
