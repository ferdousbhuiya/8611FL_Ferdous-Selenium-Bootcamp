package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement SigninfromHomePage;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }


    public void signintoRegistrationPage()
    {
        clickOnElement(SigninfromHomePage);
    }
}
