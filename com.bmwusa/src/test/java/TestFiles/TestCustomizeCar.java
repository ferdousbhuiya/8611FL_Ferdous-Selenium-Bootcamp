package TestFiles;

import PageLibrary.GetYourQuotePage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestCustomizeCar extends BasePage {

    @Test
    public void testCustomizeCar(){
        HomePage homePage =new HomePage();
        homePage.clickBuildYourOwnLink().clickSelect().clickCustomizeThisBuild().customizeCar();
        switchToTab();
        waitForVisibilityOfElement(GetYourQuotePage.driverInformationText);
        assertTrue(GetYourQuotePage.driverInformationText.isDisplayed());
    }
}
