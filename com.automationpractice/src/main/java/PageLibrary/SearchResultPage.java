package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {

    @FindBy(xpath="//*[@id=\"center_column\"]//img")
    private WebElement productResult;

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isProductAvailable() throws Throwable {

        return productResult.isDisplayed();
        //return action.isDisplayed(driver, productResult);
    }

    public AddToCartPage clickOnProduct() throws Throwable {

        productResult.click();
        //action.click(driver, productResult);
        return new AddToCartPage();
    }
}
