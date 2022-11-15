package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditEventCalendar extends BasePage {

    @Test
    public void testingEditEventCalendar()  {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().editEventCalendar();
        waitForVisibilityOfElement(UserAccountPage.eventNameDisplayed);
        assertTrue(UserAccountPage.eventNameDisplayed.isDisplayed());
    }
}
