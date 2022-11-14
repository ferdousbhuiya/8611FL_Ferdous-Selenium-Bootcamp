package TestFiles;

import PageLibrary.CarShoppingPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchForCarLoanTest extends BasePage {

    @Test
    public void testSearchingForCar() {
        HomePage homePage = new HomePage();
        homePage.clickAutoLoanLink().shopForCar();
        assertTrue(CarShoppingPage.header.isDisplayed());
    }
}
