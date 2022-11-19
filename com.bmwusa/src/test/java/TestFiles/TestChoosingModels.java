package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.X4ModelPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestChoosingModels extends BasePage {
    @Test
    public void testChoosingModel(){
        HomePage homePage =new HomePage();
        homePage.clickModelsLink().filterModels();
        waitForVisibilityOfElement(X4ModelPage.theX4Title);
        assertTrue(X4ModelPage.theX4Title.isDisplayed());
    }

}
