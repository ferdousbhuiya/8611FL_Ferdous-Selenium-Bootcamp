package TestFiles;

import PageLibrary.AccessoriesPage;
import PageLibrary.ChoosePhonePage;
import PageLibrary.HomePage;
import PageLibrary.ShoppingItemsPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddItemsToCartTest extends BasePage {

    @Test
    public void testChoosingPlan(){
        ChoosePhonePage choosePhonePage = new ChoosePhonePage();
        HomePage homePage = new HomePage();
        ShoppingItemsPage shoppingItemsPage = new ShoppingItemsPage();
        homePage.shoppingSmartPhone();
        shoppingItemsPage.PhoneSelection();
        choosePhonePage.addPhoneToCart();
        assertTrue(isElementVisible(AccessoriesPage.addedToCartText));
    }


    @Test
    public void navigateToInternationalServiceTest()
    {
        HomePage homePage= new HomePage();
        homePage.NavigateToInternationalService();
        String intText = driver.getCurrentUrl();

        Assert.assertEquals(intText, "https://www.verizon.com/plans/international/");
    }


    @Test
    public void shoppingfromHomepage()
    {
        ShoppingItemsPage shoppingItemsPage = new ShoppingItemsPage();
        AccessoriesPage accessoriesPage = new AccessoriesPage();
        accessoriesPage.ordereditem();
        waitForThePresenceOfTheElement(By.xpath("//h2[@class='fontSize_10 bold lineHeight24']"));
        boolean flag = shoppingItemsPage.orderSummary.isDisplayed();
        assertTrue(flag);
    }

}
