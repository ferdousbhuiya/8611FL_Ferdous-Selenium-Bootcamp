package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ShoppingNewVehiclePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestShopNewVehicle extends BasePage {
    @Test
    public void testShopNewVehicle(){
        HomePage homePage = new HomePage();
        homePage.navigateToShoppingPage();
        waitForVisibilityOfElement(ShoppingNewVehiclePage.selectSeries);
        assertTrue(ShoppingNewVehiclePage.selectSeries.isDisplayed());
    }

}
