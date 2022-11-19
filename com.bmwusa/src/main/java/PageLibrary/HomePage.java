package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='globalnav-primary-dealer__mobile-nav-btn']")
    public WebElement MenuBar;


    @FindBy(xpath = "//ul[@class='globalnav-primary__links']/li[1]/button")
    public WebElement modelsLink;

    @FindBy(xpath = "//ul[@class='globalnav-primary__links']/li[2]/a")
    public WebElement buildYourOwnLink;

    @FindBy(xpath = "//ul[@class='globalnav-primary__links']/li[3]/button")
    public WebElement shoppingLink;

    @FindBy(xpath = "//div[@class='globalnav-primary-drop-down-nav__content globalnav-primary-drop-down-nav__grid-6-6']/div[2]/nav[1]//ul/li[2]/a")
    public WebElement estimatePaymentLink;
    @FindBy(xpath = "//div[@class='globalnav-primary-drop-down-nav__content globalnav-primary-drop-down-nav__grid-6-6']/div[2]/nav[1]//ul/li[4]/a")
    public WebElement shopBmwPartLink;
    @FindBy(xpath = "//div[@class='globalnav-primary-drop-down-nav__content globalnav-primary-drop-down-nav__grid-6-6']/div[2]/nav[2]//ul/li[1]/a")
    public WebElement leaseAndFinancingLink;

    @FindBy(xpath = "//div[@class='gm-style']//iframe")
    public static WebElement iframe;

    @FindBy(id = "zip_code")
    public WebElement zipCodeInputField;

    @FindBy(xpath = "//button[contains(text(),'Shop New')]")
    public WebElement shopNewButton;

    @FindBy(xpath = "//ul[@class='globalnav-primary__links']/li[4]/a")
    public WebElement bmwCertifiedLink;

    @FindBy(xpath = "//ul[@class='globalnav-primary__links']/li[5]/button")
    public WebElement ownerLink;

    @FindBy(xpath = "//div[@class='globalnav-primary-location-bar__flex-holder']/div[2]//a")
    public WebElement myBmwLink;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='globalnav-primary-drop-down-nav__flyout-content label-2--bold']/a[1]")
    public WebElement signInToMyBmw;


    @FindBy(id = "logOutMyBMW")
    public static WebElement logoutButton;

    public void clickOwnerLink() {
        waitForVisibilityOfElement(ownerLink);
        moveToElementAndClick(ownerLink);
    }

    public LoginPage clickOnSignInToMyBmw() {
        clickOnElement(signInToMyBmw);
        return new LoginPage();
    }

    public LoginPage singInToMyBmw() {
        clickOwnerLink();
        return clickOnSignInToMyBmw();
    }


    public ModelsPage clickModelsLink() {
        waitForVisibilityOfElement(modelsLink);
        moveToElementAndClick(modelsLink);
        return new ModelsPage();
    }

    public BuildYourOwnPage clickBuildYourOwnLink() {
        clickOnElement(buildYourOwnLink);
        return new BuildYourOwnPage();
    }

    public ShoppingNewVehiclePage navigateToShoppingPage() {
        waitForVisibilityOfElement(modelsLink);
        moveToElementAndClick(shoppingLink);
        clearSendKeysToElement(zipCodeInputField, GenerateData.zipCode());
        clickOnElement(shopNewButton);
        return new ShoppingNewVehiclePage();
    }

    public LoginPage navigateToLoginPage() {
        clickOnElement(myBmwLink);
        return new LoginPage();
    }

    public EstimatePaymentPage navigateToEstimatePaymentPage() {
        waitForVisibilityOfElement(shoppingLink);
        moveToElementAndClick(shoppingLink);
        waitForVisibilityOfElement(estimatePaymentLink);
        clickOnElement(estimatePaymentLink);
        return new EstimatePaymentPage();
    }

    public ShopBMWAccessoriesPage navigateToShopAccessoriesPage() {
        waitForVisibilityOfElement(shoppingLink);
        moveToElementAndClick(shoppingLink);
        clickOnElement(shopBmwPartLink);
        return new ShopBMWAccessoriesPage();
    }

    public LeaseAndFinancingPage navigateToLeaseAndFinancingPage() {
        waitForVisibilityOfElement(shoppingLink);
        moveToElementAndClick(shoppingLink);
        clickOnElement(leaseAndFinancingLink);
        return new LeaseAndFinancingPage();
    }

    public HomePage clickOnMyBmw() {
        waitForVisibilityOfElement(myBmwLink);
        clickOnElement(myBmwLink);
        return new HomePage();
    }

    public LoginPage clickLogoutButton() {
        clickOnElement(logoutButton);
        return new LoginPage();
    }
}
