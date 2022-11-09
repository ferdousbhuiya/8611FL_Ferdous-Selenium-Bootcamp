package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'has been added to cart.')]")
    public static WebElement addedToCartText;

    @FindBy(xpath = "//div[@class='sc-gJqSRm dXBASI']/button")
    public WebElement continueButtonToChoosePlan;

    @FindBy(xpath = "//button[@id='gnav20-cart-icon']")
    public WebElement shoppingAccessorieslink;

    @FindBy(xpath = "//a[@id='gnav20-cart-list-item-1']")
    public WebElement MobileSolution;

    @FindBy (xpath = "//span[normalize-space()='Shop accessories']")
    public WebElement ShopAccessories;

    @FindBy(xpath = "//a[@aria-label='Go to next page.']//span[@class='StyledSpan-sc-dbm2b9-0 emkcpJ']")
    public WebElement nextbutton;

    @FindBy(xpath = "//span[normalize-space()='Lenovo Thinkvision M14t Mobile Monitor']")
    public WebElement LenovoMonior;
    //span[normalize-space()='Continue']
    @FindBy(xpath = "//span[normalize-space()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//h2[@class='fontSize_10 bold lineHeight24']")
    public WebElement orderSummary;



    public AccessoriesPage(){
        PageFactory.initElements(driver,this);
    }



    public void ordereditem()
    {
        safeClickOnElement(shoppingAccessorieslink);
        safeClickOnElement(MobileSolution);
        safeClickOnElement(ShopAccessories);
        scrollDown(nextbutton);
        safeClickOnElement(nextbutton);
        hoverOverElement(LenovoMonior);
        safeClickOnElement(LenovoMonior);
        scrollDown(continueButton);
        safeClickOnElement(continueButton);
    }

    public ExpressShoppingPage navigateToExpressCart(){
        waitForVisibilityOfElement(continueButtonToChoosePlan);
        clickOnElement(continueButtonToChoosePlan);
        return new ExpressShoppingPage();
    }
}
