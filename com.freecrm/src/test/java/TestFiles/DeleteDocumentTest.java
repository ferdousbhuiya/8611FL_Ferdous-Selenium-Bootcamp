package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class DeleteDocumentTest extends BasePage {

    @Test
    public void testDeleteDocument()  {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().deleteDocument();
        waitForVisibilityOfElement(UserAccountPage.fileWrapper);
        assertTrue(UserAccountPage.fileWrapper.isDisplayed());


    }

}
