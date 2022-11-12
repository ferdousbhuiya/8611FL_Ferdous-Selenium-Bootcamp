package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.StoreLocationResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class FindStoreLocationTest extends BasePage {

    @Test
    public void testStoresLocation() {
        HomePage homePage =new HomePage();
        homePage.searchStoreLocation().FindStoreLocation();
        assertTrue(isElementVisible(StoreLocationResultPage.mapPage));
    }
}
