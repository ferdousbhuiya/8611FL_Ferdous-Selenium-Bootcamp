package TestFiles;

import PageLibrary.*;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddShoesToCartTest extends BasePage {
    @Test
    public void SelectedShoesAddToCartTest(){
        HomePage homePage = new HomePage();
        DailyUsesItemPage dailyUsesItemPage = new DailyUsesItemPage();
        ShoesSelectionPage shoesSelectionPage = new ShoesSelectionPage();
        SelectedShoesPage selectedShoesPage = new SelectedShoesPage();
        ItemPage itemPage = new ItemPage();
        homePage.navigateToClothsAndAccessoriesPage();
        dailyUsesItemPage.navigateToShoesSelection();
        shoesSelectionPage.PopularBrandSelect();
        selectedShoesPage.selectShoes();
        itemPage.addItemsToCart();
        assertTrue(isElementVisible(itemPage.itemAddedToCartText ));

    }
    @Test
    public void BarandedShoesTest(){
        HomePage homePage = new HomePage();
        DailyUsesItemPage dailyUsesItemPage = new DailyUsesItemPage();
        ShoesSelectionPage shoesSelectionPage = new ShoesSelectionPage();
        SelectedShoesPage selectedShoesPage = new SelectedShoesPage();
        homePage.navigateToClothsAndAccessoriesPage();
        dailyUsesItemPage.navigateToShoesSelection();
        shoesSelectionPage.PopularBrandSelect();
        assertTrue(isElementVisible(selectedShoesPage.brandShoesName));
    }

    @Test
    public void RemoveFromCartTest(){
        HomePage homePage = new HomePage();
        DailyUsesItemPage dailyUsesItemPage = new DailyUsesItemPage();
        ShoesSelectionPage shoesSelectionPage = new ShoesSelectionPage();
        SelectedShoesPage selectedShoesPage = new SelectedShoesPage();
        ItemPage itemPage = new ItemPage();
        homePage.navigateToClothsAndAccessoriesPage();
        dailyUsesItemPage.navigateToShoesSelection();
        shoesSelectionPage.PopularBrandSelect();
        selectedShoesPage.selectShoes();
        itemPage.addItemsToCart();
        itemPage.RemoveItemsFromCart();
        assertTrue(isElementVisible(itemPage.cartIsEmptyText));
    }
}
