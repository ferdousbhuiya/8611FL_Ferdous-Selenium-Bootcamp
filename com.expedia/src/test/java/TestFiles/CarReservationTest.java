package TestFiles;

import PageLibrary.CarSearchResultPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class CarReservationTest extends BasePage {

    @Test
    public void testReservingCar() {
        HomePage homePage =new HomePage();
        homePage.searchingCar().ReserveCar();
        switchToTab();
        waitForVisibilityOfElement(CarSearchResultPage.securityPageVerification);
        assertTrue(CarSearchResultPage.securityPageVerification.isDisplayed());

    }
}
