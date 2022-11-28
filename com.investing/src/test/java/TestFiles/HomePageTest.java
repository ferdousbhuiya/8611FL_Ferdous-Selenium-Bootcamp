package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SigninPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.GenerateData;

import static org.testng.AssertJUnit.assertFalse;
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
    public void SignUpTest()  {
        HomePage homePage= new HomePage();
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
        String actual = getTrimmedElementText(homePage.CandleStickPatternListHeader);
        Assert.assertEquals(actual, "Candlestick Patterns");
    }

    @Test
    public  void navigateToMarketIndicesTest()
    {
        HomePage homePage= new HomePage();
        homePage.marketindicesList();
        String actual = getTrimmedElementText(homePage.marketIndicesListHeading);
        Assert.assertEquals(actual, "United States - Financial Markets");
    }

    @Test (dataProvider = "DifferntCredentials")
    public void signingInwithDifferentCredentialsTest(String username, String password)
    {
        HomePage homePage = new HomePage();
        SigninPage signinPage = new SigninPage();
        homePage.SignInforExistingAccount(username, password);
        String actualText=signinPage.invaliduserNameText.getText().trim();
        Assert.assertEquals(actualText, "Wrong email or password. Try again.");

    }@DataProvider
    public Object[][] DifferntCredentials()
    {
        String [][] data;
        data = excel.readStringArrays("Sheet5");
        return data;
    }
}
