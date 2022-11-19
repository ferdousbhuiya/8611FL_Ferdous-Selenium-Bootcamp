package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BasePage {
    BasePage basePage = new BasePage();

    @FindBy(id="quantity_wanted")
    private WebElement quantity;

    @FindBy(name="group_1")
    private WebElement size;

    @FindBy(xpath="//span[text()='Add to cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath="//*[@id='layer_cart']//h2/i")
    private WebElement addToCartMessag;

    @FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckOutBtn;

    public AddToCartPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterQuantity(String quantity1) throws Throwable {
        basePage.sendKeysToElement(quantity, quantity1);

        //action.type(quantity, quantity1);
    }

    public void selectSize(String size1) throws Throwable {
        basePage.selectFromDropdownByVisibleText(size, size1);
    }

    public void clickOnAddToCart() throws Throwable {
        addToCartBtn.click();
        // action.click(getDriver(), addToCartBtn);
    }

    public boolean validateAddtoCart() throws Throwable {
        basePage.wait(3000);
        return addToCartMessag.isDisplayed();
    }

    public OrderPage clickOnCheckOut() throws Throwable {
        basePage.wait(3000);
        proceedToCheckOutBtn.click();
        return new OrderPage();
    }
}
