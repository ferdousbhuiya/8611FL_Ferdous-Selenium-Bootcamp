package TestFiles;

import PageLibrary.AccessoriesPage;
import PageLibrary.HomePage;
import PageLibrary.ShopBMWAccessoriesPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestShopBmwAccessories extends BasePage {

    @Test
    public void testShopBmwAccessories(){
        HomePage homePage =new HomePage();
        ShopBMWAccessoriesPage shopBmwAccessoriesPage=homePage.navigateToShopAccessoriesPage();
        switchToTab();
        shopBmwAccessoriesPage.navigateToAccessoriesPage();
        waitForVisibilityOfElement(AccessoriesPage.accessoriesHeader);
        assertTrue(AccessoriesPage.accessoriesHeader.isDisplayed());
    }
}
