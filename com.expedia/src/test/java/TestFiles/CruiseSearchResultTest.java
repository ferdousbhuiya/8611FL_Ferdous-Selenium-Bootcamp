package TestFiles;

import PageLibrary.CruiseSearchResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CruiseSearchResultTest extends BasePage {

    @Test
    public void CruiseSearchingValidation() {
        CruiseSearchResultPage cruiseSearchResultPage = new CruiseSearchResultPage();
        cruiseSearchResultPage.SelectCruise();
        waitForVisibilityOfElement(cruiseSearchResultPage.CruiseSearch);
        assertTrue(cruiseSearchResultPage.CruiseSearch.isDisplayed());
    }
}
