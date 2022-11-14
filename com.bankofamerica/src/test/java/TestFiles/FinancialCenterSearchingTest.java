package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.LocationCenter;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class FinancialCenterSearchingTest extends BasePage {
    @Test
    public void testingSearchingFinancialCenter()  {
        HomePage homePage =new HomePage();
        homePage.clickFinancialCenterLink().searchFinancialCenter();
        assertTrue(LocationCenter.locationCenterName.isDisplayed());

    }

}
