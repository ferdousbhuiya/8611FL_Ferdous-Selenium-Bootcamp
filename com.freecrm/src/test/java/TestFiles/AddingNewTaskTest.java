package TestFiles;

import PageLibrary.ContactInformationPage;
import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddingNewTaskTest extends BasePage {

    @Test
    public void NewTaskAddingTest()
    {
        IndexPage indexPage = new IndexPage();
        HomePage homePage =new HomePage();
        ContactInformationPage contactInformationPage = new ContactInformationPage();
        homePage.navigateToLoginPage().login();
        indexPage.AddingNewTasks();
        waitForVisibilityOfElement(contactInformationPage.EventTitle);
        assertTrue(contactInformationPage.EventTitle.isDisplayed());
    }
}
