package TestFiles;

import PageLibrary.VehiclePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SpecialOfferTest extends BasePage {

    @Test
    public void specialofferTest() {
        VehiclePage vehiclePage= new VehiclePage();
        boolean flag = vehiclePage.CheckSpecialOffer().ThanksForNewCarText.isDisplayed();
        assertTrue(flag);
    }
}
