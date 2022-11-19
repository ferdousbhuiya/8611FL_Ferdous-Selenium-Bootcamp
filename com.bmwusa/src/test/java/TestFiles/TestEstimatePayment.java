package TestFiles;

import PageLibrary.EstimatePaymentPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestEstimatePayment extends BasePage {
    @Test
    public void testEstimatePayment(){
        HomePage homePage =new HomePage();
        homePage.navigateToEstimatePaymentPage().paymentEstimationForm();
        waitForVisibilityOfElement(EstimatePaymentPage.vehicleDisplay);
        assertTrue(EstimatePaymentPage.vehicleDisplay.isDisplayed());
    }

}
