package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestNavigateToDealerContactPage extends BasePage {
    @Test
    public void testGetToDealerPageContact() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLeaseAndFinancingPage().contactDealer().getTheDealerForm();

    }

}
