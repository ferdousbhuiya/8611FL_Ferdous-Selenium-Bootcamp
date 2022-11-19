package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(xpath="//span[text()='My wishlists']")
    private WebElement myWishList;

    @FindBy(xpath = "//span[text()='Order history and details']")
    private WebElement orderHistory;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public boolean validateMyWishList() throws Throwable {

        return myWishList.isDisplayed();
        //return action.isDisplayed(driver, myWishList);
    }

    public boolean validateOrderHistory() throws Throwable {
        return orderHistory.isDisplayed();
        // return action.isDisplayed(driver, orderHistory);
    }

    public String getCurrURL() throws Throwable {
        String homePageURL = driver.getCurrentUrl();
        // String homePageURL=action.getCurrentURL(driver);
        return homePageURL;
    }
}
