package TestFiles;

import PageLibrary.PortfolioPage;
import PageLibrary.SigninPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PortfolioPageTest extends BasePage {

    @Test
    public void portfolioSignIn()
    {
        SigninPage signinPage = new SigninPage();
        PortfolioPage portfolioPage = new PortfolioPage();
        portfolioPage.signInThroughPortfolio();
        assertTrue(signinPage.usernameTextDisplay.isDisplayed());
    }

    @Test
    public void portfolioSignUp()
    {
        SigninPage signinPage = new SigninPage();
        PortfolioPage portfolioPage = new PortfolioPage();
        portfolioPage.signupfromPortfolioPage();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Investing.com - Stock Market Quotes & Financial News");
    }
}
