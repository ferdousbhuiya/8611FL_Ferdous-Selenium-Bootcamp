package TestFiles;

import PageLibrary.*;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestGetQuote extends BasePage {
    @Test
    public void testGetQuote()  {
        HomePage homePage = new HomePage();
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();
        IxSportActivityVehiclePage ixSportActivityVehiclePage = new IxSportActivityVehiclePage();
        CustomizePage customizePage = new CustomizePage();
        GetYourQuotePage getYourQuotePage = new GetYourQuotePage();
        homePage.clickBuildYourOwnLink();
        buildYourOwnPage.clickSelect();
        ixSportActivityVehiclePage.clickCustomizeThisBuild();
        customizePage.customizeCar();
        switchToTab();
        getYourQuotePage.fillOutTheForm();

    }

}
