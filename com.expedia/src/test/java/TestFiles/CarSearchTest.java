package TestFiles;

import PageLibrary.CarSearchResultPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class CarSearchTest extends BasePage {
    @Test
    public void testSearchingCar() {
        HomePage homePage =new HomePage();
        homePage.searchingCar();
        waitForVisibilityOfElement(CarSearchResultPage.carSearchResult);
        assertTrue(CarSearchResultPage.carSearchResult.isDisplayed());
    }

}
