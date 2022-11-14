package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;

public class FindYourDreamHomePage extends BasePage {

    @FindBy(id = "Criteria/Location")
    public WebElement searchInputField;
    @FindBy(id = "broker-warning-confirm")
    public static WebElement result;
    @FindBy(id = "search-submit-button")
    public WebElement searchButton;

    public FindYourDreamHomePage(){
        PageFactory.initElements(driver,this);
    }

    public void searchingForHomeLoan() {
        sendKeysToElement(searchInputField, excel.readStringArrays("Sheet3")[0][0]);
        clickOnElement(searchButton);

    }
}
