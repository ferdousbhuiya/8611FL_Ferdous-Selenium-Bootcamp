package TestFiles;

import PageLibrary.ContactInformationPage;
import PageLibrary.EventAddingToCalendarPage;
import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddNewDealTest extends BasePage {

    @Test
    public void NewDealTest()
    {
        IndexPage indexPage = new IndexPage();
        HomePage homePage =new HomePage();
        ContactInformationPage contactInformationPage = new ContactInformationPage();
        homePage.navigateToLoginPage().login();
        indexPage.AddingDealsToCalendar();
        waitForVisibilityOfElement(contactInformationPage.EventTitle);
        assertTrue(contactInformationPage.EventTitle.isDisplayed());
    }



}
