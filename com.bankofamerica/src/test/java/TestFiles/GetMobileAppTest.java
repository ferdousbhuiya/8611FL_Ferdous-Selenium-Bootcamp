package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MobileBankingFeatures;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class GetMobileAppTest extends BasePage {

    @Test
    public void testToGetMobileApp() {
        HomePage homePage = new HomePage();
        homePage.clickOnlineBankingLink().selectDevice().getTheApp();
        assertTrue(MobileBankingFeatures.sendConfirmation.isDisplayed());
    }
}
