package TestFiles;

import PageLibrary.ContactInformationPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditContactTest extends BasePage {

    @Test
    public void testEditContactInfo()  {
        HomePage homePage =new HomePage();
        ContactInformationPage contactInformationPage = new ContactInformationPage();
        homePage.navigateToLoginPage().login().editContact();
        waitForVisibilityOfElement(contactInformationPage.contactName);
        assertTrue(contactInformationPage.contactName.isDisplayed());

    }
}
