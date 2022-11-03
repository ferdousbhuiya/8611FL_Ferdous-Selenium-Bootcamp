
package TestFiles;

import PageLibrary.IndexPage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;


public class SearchResultPageTest extends BasePage {
	private IndexPage index;
	private SearchResultPage searchResultPage;
	

	
	@Test
	public void productAvailabilityTest(String productName) throws Throwable {
		Log.startTestCase("productAvailabilityTest");
		index= new IndexPage();
		searchResultPage=index.searchProduct(productName);
		boolean result=searchResultPage.isProductAvailable();
		Assert.assertTrue(result);
		Log.endTestCase("productAvailabilityTest");
	}

}
