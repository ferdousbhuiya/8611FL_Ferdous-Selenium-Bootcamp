package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndexPage extends BasePage {

    @FindBy(id = "headerMenuLink")
    public WebElement headerLink;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li")
    public List<WebElement> menuNavigationList;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public WebElement SignUpForNewAccount;


    @FindBy(xpath = "//a[contains(text(),'View More')]")
    public WebElement moreAppartment;

    @FindBy(xpath = "//body[1]/div[1]/header[1]/nav[1]/div[2]/a[1]/span[1]")
    public WebElement changeLaguage;

    @FindBy(xpath = "//span[contains(text(),'Español')]")
    public WebElement Espanol;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }



    public NewAccountPage CreateNewAccount()
    {
        clickOnElement(SignUpForNewAccount);
        return new NewAccountPage();
    }

    public HelpCenterPage navigeteToHelpCenter()
    {
        clickOnElement(headerLink);
        waitForVisibilityOfElement(menuNavigationList.get(6));
        clickOnElement(menuNavigationList.get(6));
        switchToTab();
        return new HelpCenterPage();
    }


    public MoreAppartmentPage searchMoreAppartment()
    {
        clickOnElement(moreAppartment);
        return new MoreAppartmentPage();
    }

    public EspanolPage changeLanguage()
    {
        clickOnElement(changeLaguage);
        waitForVisibilityOfElement(Espanol);
        hoverOverElement(Espanol);
        jsClickOnElement(Espanol);
        return new EspanolPage();
    }

}
