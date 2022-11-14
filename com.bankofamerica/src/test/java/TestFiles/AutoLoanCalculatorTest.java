package TestFiles;

import PageLibrary.AutoLoanCalculator;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class AutoLoanCalculatorTest extends BasePage {

    @Test
    public void testingAutoLoanCalculator()  {
        HomePage homePage =new HomePage();
        homePage.clickAutoLoanCalculator().calculatePayment();
        assertTrue(AutoLoanCalculator.result.isDisplayed());
    }
}
