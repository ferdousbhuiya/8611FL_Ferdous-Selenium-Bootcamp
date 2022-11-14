package TestFiles;

import PageLibrary.DealerPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestContactDealer extends BasePage {
    @Test
    public void testContactDealer() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLeaseAndFinancingPage().contactDealer().getTheDealerForm().fillOutDealerForm();
        waitForVisibilityOfElement(DealerPage.thankYouMessage);
        assertTrue(DealerPage.thankYouMessage.isDisplayed());

    }
}
