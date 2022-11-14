package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BetterMoneyHabits extends BasePage {


    @FindBy(xpath = "//span[contains(.,'Better Money Habits®')]")
    public WebElement BetterMoneyHabits;
    @FindBy(xpath = "(//span[@class='title'][normalize-space()='Investing'])[2]")
    public WebElement InvestingButton;

    @FindBy(xpath = "//a[text()='Starting Out']")
    public WebElement StartingOutButton;

    @FindBy(xpath = "//a[@data-bactmln='Learn_More_Link']")
    public WebElement LearnMoreButton;

    @FindBy(xpath = "(//img[@role='img'])[1]")
    public WebElement MoneyHabitPageHeadingImage;

    public BetterMoneyHabits()
    {
        PageFactory.initElements(driver, this);
    }

    public void betterMoneyHabit()
    {
        moveToElementAndClick(BetterMoneyHabits);
        safeClickOnElement(InvestingButton);
        safeClickOnElement(StartingOutButton);
        safeClickOnElement(LearnMoreButton);

    }
}
