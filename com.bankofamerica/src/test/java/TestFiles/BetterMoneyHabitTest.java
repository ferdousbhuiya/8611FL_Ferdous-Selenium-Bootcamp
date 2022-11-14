package TestFiles;

import PageLibrary.BetterMoneyHabits;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class BetterMoneyHabitTest extends BasePage {

    @Test
    public void BetterMoneyHabitPageTest()
    {
        BetterMoneyHabits betterMoneyHabits = new BetterMoneyHabits();
        betterMoneyHabits.betterMoneyHabit();
        waitForThePresenceOfTheElement(By.xpath("(//img[@role='img'])[1]"));
        assertTrue(betterMoneyHabits.MoneyHabitPageHeadingImage.isDisplayed());
    }
}
