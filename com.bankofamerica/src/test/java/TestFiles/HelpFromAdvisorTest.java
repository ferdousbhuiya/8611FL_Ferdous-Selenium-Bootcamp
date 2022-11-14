package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.WealthManagementPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class HelpFromAdvisorTest extends BasePage {

    @Test
    public void testConnectingWithMerrillAdvisor()  {
        HomePage homePage= new HomePage();
        WealthManagementPage wealthManagementPage = new WealthManagementPage();
        homePage.clickWealthManagementLink().fillOutConnectForm();
        waitForVisibilityOfElement(wealthManagementPage.confirmationMessage);
        assertTrue(WealthManagementPage.confirmationMessage.isDisplayed());
    }
}
