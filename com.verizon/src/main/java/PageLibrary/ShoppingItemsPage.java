package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingItemsPage extends BasePage {
    @FindBy(xpath = "//a[@href='https://www.verizon.com/smartphones/samsung-galaxy-s22-ultra/']")
    public WebElement phone;

    @FindBy(xpath = "//button[.//span[text()='Continue']]")
    public WebElement continueButton;

    @FindBy(xpath = "//h2[@class='fontSize_10 bold lineHeight24']")
    public WebElement orderSummary;

    public ShoppingItemsPage() {
        PageFactory.initElements(driver, this);
    }


    public ChoosePhonePage PhoneSelection() {
        waitForVisibilityOfElement(phone);
        clickOnElement(phone);
        return new ChoosePhonePage();
    }

    public ExpressShoppingPage addChargerToCart() {
        jsClickOnElement(continueButton);
        return new ExpressShoppingPage();

    }

}
