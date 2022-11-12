package TestFiles;

import PageLibrary.ProfitCalculator;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ProfitCalculatorTest extends BasePage {


    @Test
    public void profitcalculatorTesting()
    {
        ProfitCalculator profitCalculator = new ProfitCalculator();
        profitCalculator.ProfitCalculator();
        boolean flag = profitCalculator.LossOrProfitValue.isDisplayed();
        assertTrue(flag);

    }
}
