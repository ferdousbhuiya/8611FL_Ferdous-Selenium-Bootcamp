package TestFiles;

import PageLibrary.*;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestCustomizeCar extends BasePage {

    @Test
    public void testCustomizeCar(){
        HomePage homePage =new HomePage();
        BuildYourOwnPage buildYourOwnPage= new BuildYourOwnPage();
        IxSportActivityVehiclePage ixSportActivityVehiclePage = new IxSportActivityVehiclePage();
        CustomizePage customizePage = new CustomizePage();
        homePage.clickBuildYourOwnLink();
        buildYourOwnPage.clickSelect();
        ixSportActivityVehiclePage.clickCustomizeThisBuild();
        customizePage.customizeCar();
        switchToTab();
        waitForVisibilityOfElement(GetYourQuotePage.driverInformationText);
        assertTrue(GetYourQuotePage.driverInformationText.isDisplayed());
    }
}
