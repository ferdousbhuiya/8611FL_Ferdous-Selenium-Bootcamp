package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LeaseAndFinancingPage extends BasePage {
    @FindBy(xpath = "//form[@class='zip-location__search__form ng-pristine ng-valid']/input")
    public WebElement zipCodeField;

    @FindBy(xpath = "//form[@class='zip-location__search__form ng-pristine ng-valid']/button")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@href='/contact/dealer-offers.html']")
    public WebElement contactDealerButton;


    public LeaseAndFinancingPage() {
        PageFactory.initElements(driver, this);
    }

    public DealerPage contactDealer() throws SQLException {
        String query="SELECT zipcode FROM locations.zipcode where id=1;";
        sendKeysToElement(zipCodeField,db.executeQueryReadOne(query).toString());
        clickOnElement(searchButton);
        retryingFindClick(By.xpath("//a[@href='/contact/dealer-offers.html']"));
        return new DealerPage();
    }

}
