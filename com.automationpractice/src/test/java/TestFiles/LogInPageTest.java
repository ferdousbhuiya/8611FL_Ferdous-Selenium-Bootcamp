package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.openqa.selenium.devtools.v96.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends BasePage {

    private IndexPage indexPage= new IndexPage();
    private LoginPage loginPage= new LoginPage();
    private HomePage homePage= new HomePage();


    @Test
    public void loginTest(String uname, String pswd) throws Throwable {

        loginPage=indexPage.clickOnSignIn();
        homePage=loginPage.login(uname,pswd,homePage);
        String actualURL=homePage.getCurrURL();
        String expectedURL="http://automationpractice.com/index.php?controller=my-account";
        Assert.assertEquals(actualURL, expectedURL);

    }
}
