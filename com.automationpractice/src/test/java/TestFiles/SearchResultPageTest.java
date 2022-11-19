package TestFiles;

import PageLibrary.IndexPage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.openqa.selenium.devtools.v96.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultPageTest extends BasePage {

    private IndexPage index;
    private SearchResultPage searchResultPage;



    @Test
    public void productAvailabilityTest(String productName) throws Throwable {
        index= new IndexPage();
        searchResultPage=index.searchProduct(productName);
        boolean result=searchResultPage.isProductAvailable();
        Assert.assertTrue(result);
    }
}
