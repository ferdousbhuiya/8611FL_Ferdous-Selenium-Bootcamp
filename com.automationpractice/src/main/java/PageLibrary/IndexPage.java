package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {

    @FindBy(xpath = "//a[@class='login']")
    WebElement signInBtn;

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    WebElement myStoreLogo;

    @FindBy(id="search_query_top")
    WebElement searchProductBox;

    @FindBy(name="submit_search")
    WebElement searchButton;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickOnSignIn() throws Throwable {

        //basePage.wait(1000);
        signInBtn.click();

        //action.fluentWait(driver, signInBtn, 10);
        //action.click(driver, signInBtn);
        return new LoginPage();
    }

    public boolean validateLogo() throws Throwable {
        return myStoreLogo.isDisplayed();
        // return action.isDisplayed(driver, myStoreLogo);
    }

    public String getMyStoreTitle() {
        String myStoreTitel=driver.getTitle();
        return myStoreTitel;
    }

    public SearchResultPage searchProduct(String productName) throws Throwable {

        sendKeysToElement(searchProductBox, productName);
        //electFromDropdownByVisibleText(searchButton,productName);
        searchButton.click();
        //basePage.wait(1000);

        return new SearchResultPage();
		/*action.type(searchProductBox, productName);
		action.scrollByVisibilityOfElement(getDriver(), searchButton);
		action.click(driver, searchButton);
		Thread.sleep(3000);
		return new SearchResultPage();*/
    }
}
