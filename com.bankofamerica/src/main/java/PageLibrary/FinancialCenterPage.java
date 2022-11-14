package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;
import java.time.Duration;

public class FinancialCenterPage extends BasePage {
    @FindBy(id = "q")
    public WebElement inputSearchField;

    @FindBy(id = "search-button")
    public WebElement searchButton;

    @FindBy(xpath = "//ul[@role='list']/li[1]/div/a[2]")
    public WebElement financialLocation;


    public FinancialCenterPage(){
        PageFactory.initElements(driver,this);
    }
    public LocationCenter searchFinancialCenter() {
        sendKeysToElement(inputSearchField, excel.readStringArrays("Sheet3")[0][0]);
        clickOnElement(searchButton);
        clickOnElement(financialLocation);
        return new LocationCenter();
    }

}
