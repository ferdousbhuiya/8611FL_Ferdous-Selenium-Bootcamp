package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import PageLibrary.SearchResultPage;
import PageLibrary.WomenUsesItems;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddToCartTest extends BasePage {
    @Test
    public void AddToCartTest()  {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        ItemPage itemPage = new ItemPage();
        homePage.searchForItems();
        searchResultPage.selectItem();
        itemPage.AddToCart();
        boolean flag = isElementVisible(homePage.numberOfItem);
        String text = homePage.numberOfItem.getText();
        Assert.assertEquals(text,"1");
    }

    @Test
    public void AddingWatchToCartTest(){
        HomePage homePage = new HomePage();
        WomenUsesItems womenUsesItems = new WomenUsesItems();
        ItemPage itemPage = new ItemPage();
        homePage.NavigateToJeweleryPage();
        womenUsesItems.addWatchToCart();
        itemPage.AddToCart();
        assertTrue(isElementVisible(ItemPage.itemAddedToCartText));
    }

    @Test
    public void RemovingItemFromCartTest() {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        ItemPage itemPage = new ItemPage();
        homePage.searchForItems();
        searchResultPage.selectItem();
        itemPage.AddToCart();
        itemPage.removeItemFromCart();
        assertTrue(isElementVisible(itemPage.dontHaveAnyItemText));
    }

}
