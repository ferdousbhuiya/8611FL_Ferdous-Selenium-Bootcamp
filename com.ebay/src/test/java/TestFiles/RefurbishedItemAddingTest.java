package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class RefurbishedItemAddingTest extends BasePage {


    @Test
    public void RefurbishItemTest()
    {
        HomePage homePage = new HomePage();
        ItemPage itemPage = new ItemPage();
        homePage.AddRefurbishedItemToCart();
        itemPage.AddToCart();
        assertTrue(isElementVisible(ItemPage.itemAddedToCartText));
    }
}
