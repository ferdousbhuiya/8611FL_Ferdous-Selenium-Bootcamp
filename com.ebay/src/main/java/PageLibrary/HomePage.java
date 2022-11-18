package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul/li[3]")
    public WebElement motorsButton;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul/li[7]")
    public WebElement clothingAndAccessoriesLink;

    @FindBy(xpath = "//table[@class='gh-tbl2']/tbody/tr[1]/td[1]//input[1]")
    public WebElement searchInput;

    @FindBy(xpath = "//table[@class='gh-tbl2']/tbody/tr[1]/td[3]//input[1]")
    public WebElement searchButton;

    @FindBy(id="gh-cart-n")
    public static WebElement numberOfItem;

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']/li")
    public List<WebElement> MenuBar;
    @FindBy(xpath = "//a[contains(text(),'register')]")
    public WebElement RegisterButton;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordInput;

    @FindBy(xpath = "//button[@id='EMAIL_REG_FORM_SUBMIT']")
    public WebElement submitButton;

    @FindBy(xpath = "//body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li")
    public List<WebElement> subMenuOfReFurbished;

    @FindBy(xpath = "//ul[@class='srp-refine__category__list']/li")
    public List<WebElement> CertifiedReburbishedSubMenu;

    @FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']/li")
    public List<WebElement> SelectRefurbishedItem;

    public String Searchitem = excel.readStringArrays("Sheet2")[1][0];


    public String Firstname = GenerateData.firstName();


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public MotorsPage addVehicle() {
        waitForVisibilityOfElement(motorsButton);
        clickAnElementMatchingText(MenuBar, "Motors");
        return new MotorsPage();
    }

    public SearchResultPage searchForItems() {
        waitForVisibilityOfElement(searchInput);
        sendKeysToElement(searchInput, Searchitem );
        moveToElementAndClick(searchButton);
        return new SearchResultPage();

    }
    public DailyUsesItemPage navigateToClothsAndAccessoriesPage(){
        waitForVisibilityOfElement(clothingAndAccessoriesLink);
        clickAnElementMatchingText(MenuBar, "Clothing & Accessories");
        return new DailyUsesItemPage();
    }
    public WomenUsesItems NavigateToJeweleryPage(){
        clickAnElementMatchingText(MenuBar, "Jewelry & Watches");
        return  new WomenUsesItems();
    }
    public HomeAndGardenPage NavigateToHomeAndGarden(){
        clickAnElementMatchingText(MenuBar, "Home & Garden");
        return new HomeAndGardenPage();
    }

    public SignUpPage SignUp()
    {
        clickOnElement(RegisterButton);
        sendKeysToElement(FirstName, Firstname);
        sendKeysToElement(LastName, GenerateData.lastName());
        sendKeysToElement(emailInput, GenerateData.email());
        sendKeysToElement(PasswordInput, GenerateData.password());
        clickOnElement(submitButton);
        return new SignUpPage();
    }

    public void AddRefurbishedItemToCart()
    {
        clickAnElementMatchingText(MenuBar, "eBay Refurbished");
        clickAnElementMatchingText(subMenuOfReFurbished, "Certified Refurbished");
        clickAnElementMatchingText(CertifiedReburbishedSubMenu, "Laptops & Netbooks");
        int re = randomnumber(12);
        clickOnElement(SelectRefurbishedItem.get(re));
    }
}
