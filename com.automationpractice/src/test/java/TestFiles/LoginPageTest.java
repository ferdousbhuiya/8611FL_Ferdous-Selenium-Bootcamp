
package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;

import static config.BaseConfig.properties;


public class LoginPageTest extends BasePage {
	private IndexPage indexPage= new IndexPage();
	private LoginPage loginPage= new LoginPage();
	private HomePage homePage= new HomePage();
	

	@Test
	public void loginTest(String uname, String pswd) throws Throwable {
		Log.startTestCase("loginTest");
		Log.info("user is going to click on SignIn");
		loginPage=indexPage.clickOnSignIn();
		Log.info("Enter Username and Password");
	    homePage=loginPage.login(properties.getProperty("username"), properties.getProperty("password"), homePage);
		homePage=loginPage.login(uname,pswd,homePage);
	    String actualURL=homePage.getCurrURL();
	    String expectedURL="http://automationpractice.com/index.php?controller=my-account";
	    Log.info("Verifying if user is able to login");
	    Assert.assertEquals(actualURL, expectedURL);
	    Log.info("Login is Success");
	    Log.endTestCase("loginTest");
	}

}
