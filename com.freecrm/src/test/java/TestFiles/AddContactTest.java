package TestFiles;

import PageLibrary.ContactInformationPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class AddContactTest extends BasePage {
    @Test
    public void testAddContact()  {
        HomePage homePage =new HomePage();
       ContactInformationPage contactInformationPage = new ContactInformationPage();
        homePage.navigateToLoginPage().login().addContact();
        contactInformationPage.fillOutContactInformation();
        waitForVisibilityOfElement(contactInformationPage.contactName);
        assertTrue(contactInformationPage.contactName.isDisplayed());


    }

}
