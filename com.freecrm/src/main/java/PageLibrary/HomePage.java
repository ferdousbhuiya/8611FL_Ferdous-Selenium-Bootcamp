package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {




    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li")
    public List<WebElement> navaBarLinks;

    public HomePage ()
    {
        PageFactory.initElements(driver, this);
    }

    public LoginPage navigateToLoginPage(){
        jsClickOnElement(navaBarLinks.get(0).findElement(By.tagName("a")));
        return new LoginPage();
    }

}
