package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;
import java.util.List;

public class StoreLocationsPage extends BasePage {

    @FindBy(id = "storesData")
    public WebElement searchInput;

    @FindBy(xpath = "//ul[@id='autocomplete-options--stores']/li")
    public List<WebElement> resultSuggestionlist;

    public StoreLocationsPage()
    {
        PageFactory.initElements(driver, this);
    }


    public StoreLocationResultPage FindStoreLocation() {
        String zipCode = excel.readStringArrays("Sheet3")[0][0];


        clearSendKeysToElement(searchInput, zipCode);
       searchInput.sendKeys(Keys.BACK_SPACE);
        searchInput.sendKeys(Keys.BACK_SPACE);
        waitForThePresenceOfTheElement(By.xpath("//ul[@id='autocomplete-options--stores']/li[1]"));
        jsClickOnElement(resultSuggestionlist.get(0));
        return new StoreLocationResultPage();
    }
}
