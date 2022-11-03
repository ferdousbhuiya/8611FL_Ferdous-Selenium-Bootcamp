
package TestFiles;

import PageLibrary.IndexPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;


public class IndexPageTest extends BasePage {
	private IndexPage indexPage= new IndexPage();
    

	
	@Test(groups = "Smoke")
	public void verifyLogo() throws Throwable {
		Log.startTestCase("verifyLogo");
		indexPage= new IndexPage();
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
		Log.endTestCase("verifyLogo");
	}
	
	@Test
	public void verifyTitle() {
		Log.startTestCase("verifyTitle");
		String actTitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
		Log.endTestCase("verifyTitle");
	}

	
}
