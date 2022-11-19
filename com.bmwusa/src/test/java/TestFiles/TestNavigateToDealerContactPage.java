package TestFiles;

import PageLibrary.DealerPage;
import PageLibrary.HomePage;
import PageLibrary.LeaseAndFinancingPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestNavigateToDealerContactPage extends BasePage {
    @Test
    public void testGetToDealerPageContact()  {
        HomePage homePage =new HomePage();
        LeaseAndFinancingPage leaseAndFinancingPage = new LeaseAndFinancingPage();
        DealerPage dealerPage = new DealerPage();
        homePage.navigateToLeaseAndFinancingPage();
        leaseAndFinancingPage.contactDealer();
        dealerPage.getTheDealerForm();

    }

}
