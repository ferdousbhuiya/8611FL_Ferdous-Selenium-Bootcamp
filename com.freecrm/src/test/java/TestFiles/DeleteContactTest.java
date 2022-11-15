package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class DeleteContactTest extends BasePage {
    @Test
    public void testDeleteContact() {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().deleteContact();
        waitForVisibilityOfElement(UserAccountPage.displayedContactName);
        assertTrue(UserAccountPage.displayedContactName.isDisplayed());
    }

}
