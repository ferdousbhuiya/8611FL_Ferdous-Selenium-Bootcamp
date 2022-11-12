package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SigninPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

import static org.testng.AssertJUnit.assertTrue;

public class HomePageTest extends BasePage {

    @Test
    public void signingInTest()
    {
        HomePage homePage = new HomePage();
        SigninPage signinPage = new SigninPage();
        String username = excel.readStringArrays("Sheet1")[0][1];
        String password = excel.readStringArrays("Sheet1")[0][3];
        System.out.println("\n"+"******------------"+"\nThe ussername and password is as follows: "+username+" , "+password+"\n******------------\n");
        homePage.SignInforExistingAccount(username, password);
        assertTrue(signinPage.usernameTextDisplay.isDisplayed());
    }


    @Test
    public void SignUpTest() throws InterruptedException {
        HomePage homePage= new HomePage();
        SigninPage signinPage = new SigninPage();
        String FirstName = GenerateData.firstName();
        String Lastname = GenerateData.lastName();
        String Email = GenerateData.email();
        String Password = "Asdf378@";
        homePage.SignUpForNewAccount(FirstName, Lastname, Email, Password);
       String title = driver.getTitle();
        Assert.assertEquals(title, "Investing.com - Stock Market Quotes & Financial News");
    }

    @Test
    public void NavigateToTechnicalChartTest()
    {
        HomePage homePage= new HomePage();
        homePage.moveToTechnicalAnalysis();
        String actual = homePage.getTrimmedElementText(homePage.CandleStickPatternListHeader);
        Assert.assertEquals(actual, "Candlestick Patterns");
    }

    @Test
    public  void navigateToMarketIndicesTest()
    {
        HomePage homePage= new HomePage();
        homePage.marketindicesList();
        String actual = homePage.getTrimmedElementText(homePage.marketIndicesListHeading);
        Assert.assertEquals(actual, "United States - Financial Markets");
    }




}
