package TestFiles;

import PageLibrary.HomeAndGardenPage;
import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddAnyItemToCartTest extends BasePage {
    @Test
    public void AddFurnitureToCartTest(){
        HomePage homePage = new HomePage();
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage();
        ItemPage itemPage = new ItemPage();
        homePage.NavigateToHomeAndGarden();
        homeAndGardenPage.addItemsToCart();
        itemPage.AddToCart();
        itemPage.NoThanks();
        assertTrue(isElementVisible(itemPage.removeButton));
    }

    @Test
    public void RemoveFurnitureFromCart(){
        HomePage homePage = new HomePage();
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage();
        ItemPage itemPage = new ItemPage();
        homePage.NavigateToHomeAndGarden();
        homeAndGardenPage.addItemsToCart();
        itemPage.AddToCart();
        itemPage.deleteFromCart();
        assertTrue(isElementVisible(itemPage.noItemInYourCartText));

    }
    @Test
    public void AddingASpecialDayItemToCart(){
        HomePage homePage = new HomePage();
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage();
        ItemPage itemPage = new ItemPage();
        homePage.NavigateToHomeAndGarden();
        homeAndGardenPage.SpecialDayItemAdd();
        itemPage.AddToCart();
        itemPage.clickYesContinueButton();
        assertTrue(isElementVisible(ItemPage.itemAddedToCartText));
    }
    @Test
    public void RemovingASpecialDayItemFromCartTest(){
        HomePage homePage = new HomePage();
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage();
        ItemPage itemPage = new ItemPage();
        homePage.NavigateToHomeAndGarden();
        homeAndGardenPage.SpecialDayItemAdd();
        itemPage.AddToCart();
        itemPage.clickYesContinueButton();
        itemPage.clickGoToCartButton();
        itemPage.clickRemoveButton();
        assertTrue(isElementVisible(ItemPage.noItemInYourCartText));
    }

}
