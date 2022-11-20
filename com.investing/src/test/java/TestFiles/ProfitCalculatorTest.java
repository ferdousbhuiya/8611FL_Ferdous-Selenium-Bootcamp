package TestFiles;

import PageLibrary.ProfitCalculatorPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ProfitCalculatorTest extends BasePage {


    @Test
    public void profitcalculatorTesting()
    {
        ProfitCalculatorPage profitCalculatorPage = new ProfitCalculatorPage();
        profitCalculatorPage.calculateProfit();
        boolean flag = profitCalculatorPage.LossOrProfitValue.isDisplayed();
        assertTrue(flag);

    }
}
