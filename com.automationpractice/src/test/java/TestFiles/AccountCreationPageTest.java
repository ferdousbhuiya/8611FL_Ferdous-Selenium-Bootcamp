package TestFiles;

import PageLibrary.AccountCreationPage;
import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AccountCreationPageTest extends BasePage {
    private IndexPage indexPage;
    private LoginPage loginPage;
    private AccountCreationPage acountCreationPage;
    private HomePage homePage;





    @Test
    public void verifyCreateAccountPageTest(String email) throws Throwable {
        indexPage= new IndexPage();
        loginPage=indexPage.clickOnSignIn();
        boolean result=acountCreationPage.validateAcountCreatePage();
        Assert.assertTrue(result);
    }

    @Test
    public void createAccountTest(HashMap<String,String> hashMapValue) throws Throwable {
        indexPage= new IndexPage();
        loginPage=indexPage.clickOnSignIn();
        acountCreationPage.createAccount(
                hashMapValue.get("Gender"),
                hashMapValue.get("FirstName"),
                hashMapValue.get("LastName"),
                hashMapValue.get("SetPassword"),
                hashMapValue.get("Day"),
                hashMapValue.get("Month"),
                hashMapValue.get("Year"),
                hashMapValue.get("Company"),
                hashMapValue.get("Address"),
                hashMapValue.get("City"),
                hashMapValue.get("State"),
                hashMapValue.get("Zipcode"),
                hashMapValue.get("Country"),
                hashMapValue.get("MobilePhone"));
        homePage=acountCreationPage.validateRegistration();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", homePage.getCurrURL());
    }

}
