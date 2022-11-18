package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import PageLibrary.WomenUsesItems;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddJewelleryToCartTest extends BasePage {

    @Test
    public void AddingJewelleryToCartTest(){
        HomePage homePage = new HomePage();
        ItemPage itemPage = new ItemPage();
        WomenUsesItems womenUsesItems = new WomenUsesItems();
        homePage.NavigateToJeweleryPage();
        womenUsesItems.clickFineJewelry();
        switchToTab();
        itemPage.AddToCart();
        itemPage.NoThanks();
        assertTrue(isElementVisible(itemPage.removeButton));
    }

    @Test
    public void RemovingJewelleryFromCartTest(){
        HomePage homePage = new HomePage();
        ItemPage itemPage = new ItemPage();
        WomenUsesItems womenUsesItems = new WomenUsesItems();
        homePage.NavigateToJeweleryPage();
        womenUsesItems.clickFineJewelry();
        switchToTab();
        itemPage.AddToCart();
        itemPage.deleteFromCart();
        assertTrue(isElementVisible(itemPage.noItemInYourCartText));
    }

}
