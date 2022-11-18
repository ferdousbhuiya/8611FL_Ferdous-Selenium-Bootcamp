package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemPage extends BasePage {
    @FindBy(xpath = "//a[.//span[text()='Add to cart']]")
    public WebElement addToCartButton;

    @FindBy(id = "CUSTOMIZATION0-0-12-confirm-dialog-confirm")
    public WebElement yesContinueButton;
    @FindBy(xpath = "//a[.//span[text()='Add to cart']]")
    public WebElement addItemsToCartButton;
    @FindBy(xpath = "//h2[contains(text(),'1 item added to cart')]")
    public static WebElement itemAddedToCartText;

    @FindBy(xpath = "//div[@class='vi_oly_clz_cntr']/button")
    public WebElement closeButton;

    @FindBy(xpath = "//button[contains(text(),'No thanks')]")
    public WebElement notThanksButton;

    @FindBy(xpath = "//div[@class='listsummary']/div[2]/span[2]//button")
    public static WebElement removeButton;

    @FindBy(xpath = "//div[@class='listsummary']/div[2]/span[2]//button")
    public static WebElement dontHaveAnyItemText;

    @FindBy(xpath = "//div[@class='font-title-3']")
    public static WebElement noItemInYourCartText;

    @FindBy(xpath = "//h2[contains(text(),'Your cart is empty')]")
    public static WebElement cartIsEmptyText;

    @FindBy(xpath = "//div[@class='gh-minicart-body']/div[1]//button")
    public WebElement shoppingCartRemoveButton;

    @FindBy(xpath = "//div[@class='app-atc-layer-redesign-content-wrapper ']/div[2]/a[2]")
    public WebElement goToCartButton;

    @FindBy(xpath = "//ul[@id='gh-eb']/li")
    public List<WebElement> rightNavBar;


    public ItemPage() {
        PageFactory.initElements(driver, this);
    }

    public ItemPage AddToCart() {
        clickOnElement(addToCartButton);
        return new ItemPage();
    }

    public void NoThanks() {
        clickOnElement(notThanksButton);
    }

    public ItemPage addToCartWithNoThankYouButton() {
        waitForVisibilityOfElement(addToCartButton);
        clickOnElement(addToCartButton);
        waitForVisibilityOfElement(notThanksButton);
        clickOnElement(notThanksButton);
        return new ItemPage();
    }

    public void removeItemFromCart() {
        waitForVisibilityOfElement(removeButton);
        clickOnElement(removeButton);
    }

    public ItemPage addItemsToCart() {
        waitForVisibilityOfElement(addItemsToCartButton);
        clickOnElement(addItemsToCartButton);
        return new ItemPage();
    }


    public void RemoveItemsFromCart() {
        clickOnElement(closeButton);
        hoverOverElement(rightNavBar.get(4));
        waitForVisibilityOfElement(shoppingCartRemoveButton);
        clickOnElement(shoppingCartRemoveButton);
    }

    public void deleteFromCart() {
        NoThanks();
        clickOnElement(removeButton);
    }

    public ItemPage clickYesContinueButton() {
        clickOnElement(yesContinueButton);
        return new ItemPage();
    }
    public ItemPage clickGoToCartButton(){
        clickOnElement(goToCartButton);
        return new ItemPage();
    }
    public void clickRemoveButton(){
        clickOnElement(removeButton);
    }
}
