
package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;


public class HomePageTest extends BasePage {
	private IndexPage indexPage= new IndexPage();
	private LoginPage loginPage= new LoginPage();
	private HomePage homePage= new HomePage();


	
	@Test
	public void wishListTest(String uname, String pswd) throws Throwable {
		Log.startTestCase("wishListTest");
		loginPage=indexPage.clickOnSignIn();
		homePage=loginPage.login(uname,pswd,homePage);
		boolean result=homePage.validateMyWishList();
		Assert.assertTrue(result);
		Log.endTestCase("wishListTest");
	}
	
	@Test
	public void orderHistoryandDetailsTest(String uname, String pswd) throws Throwable {
		Log.startTestCase("orderHistoryandDetailsTest");
		loginPage=indexPage.clickOnSignIn();
		homePage=loginPage.login(uname,pswd,homePage);
		boolean result=homePage.validateOrderHistory();
		Assert.assertTrue(result);
		Log.endTestCase("orderHistoryandDetailsTest");
	}
	
}
