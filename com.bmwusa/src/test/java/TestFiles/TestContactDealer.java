package TestFiles;

import PageLibrary.DealerPage;
import PageLibrary.HomePage;
import PageLibrary.LeaseAndFinancingPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestContactDealer extends BasePage {
    @Test
    public void testContactDealer() throws SQLException {
        HomePage homePage =new HomePage();
        LeaseAndFinancingPage leaseAndFinancingPage = new LeaseAndFinancingPage();
        DealerPage dealerPage = new DealerPage();
        homePage.navigateToLeaseAndFinancingPage();
        leaseAndFinancingPage.contactDealer();
        dealerPage.getTheDealerForm();
        dealerPage.fillOutDealerForm();
        waitForVisibilityOfElement(DealerPage.thankYouMessage);
        assertTrue(DealerPage.thankYouMessage.isDisplayed());

    }
}
