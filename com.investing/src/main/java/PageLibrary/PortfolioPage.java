package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class PortfolioPage extends BasePage {

    @FindBy(xpath = "//i[@class='topBarPortfolioIcon']")
    public WebElement PortfolioButton;

    @FindBy(xpath = "//a[@class='bold reg_ep_el sign_in_link']")
    public WebElement SignInInsidePortfolio;


    @FindBy(xpath = "//a[@id='signUPBtn']")
    public WebElement SignUpInsidePortfolio;


    public PortfolioPage()
    {
        PageFactory.initElements(driver, this);
    }


    public SigninPage signInThroughPortfolio()
    {
        HomePage homePage= new HomePage();
        safeClickOnElement(PortfolioButton);
        safeClickOnElement(SignInInsidePortfolio);
        String exstusername = excel.readStringArrays("Sheet1")[0][1];;
        String exstpswd = excel.readStringArrays("Sheet1")[0][3];;
        homePage.SignInforExistingAccount(exstusername, exstpswd);
        return new SigninPage();
    }

    public SigninPage signupfromPortfolioPage()
    {
        safeClickOnElement(PortfolioButton);
        safeClickOnElement(SignUpInsidePortfolio);
        HomePage homePage= new HomePage();
        String FirstName = GenerateData.firstName();
        String Lastname = GenerateData.lastName();
        String Email = GenerateData.email();
        String Password = "Aiyiuf86876@";
        homePage.SignUpForNewAccount(FirstName, Lastname, Email, Password);

        return new SigninPage();
    }
}
