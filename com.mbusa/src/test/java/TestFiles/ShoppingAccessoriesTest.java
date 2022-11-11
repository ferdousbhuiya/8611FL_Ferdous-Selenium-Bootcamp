package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ShoppingAccessoriesTest extends BasePage {

    @Test
    public void AccessoriesShoppingTest()
    {HomePage homePage = new HomePage();
        boolean flag = homePage.AccessoriesShopping()
                .accessoriesPageheading.isDisplayed();
        assertTrue(flag);
    }
}
