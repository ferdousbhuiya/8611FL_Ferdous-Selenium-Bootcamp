package TestFiles;

import PageLibrary.ContactInformationPage;
import PageLibrary.EventAddingToCalendarPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddEventToCalendarTest extends BasePage {


    @Test
    public void EventAddingTest()
    {
        HomePage homePage =new HomePage();
        ContactInformationPage contactInformationPage = new ContactInformationPage();
        EventAddingToCalendarPage eventAddingToCalendarPage = new EventAddingToCalendarPage();
        homePage.navigateToLoginPage().login();
        eventAddingToCalendarPage.AddingEventToCalendar();
        waitForVisibilityOfElement(contactInformationPage.EventTitle);
        assertTrue(contactInformationPage.EventTitle.isDisplayed());

    }

    }


