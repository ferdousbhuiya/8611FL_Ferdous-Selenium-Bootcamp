package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddDocumentTest extends BasePage {

    @Test
    public void testAddingDocument()  {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().addDocument();
        waitForVisibilityOfElement(UserAccountPage.fileWrapper);
        assertTrue(UserAccountPage.fileWrapper.isDisplayed());

    }
}
