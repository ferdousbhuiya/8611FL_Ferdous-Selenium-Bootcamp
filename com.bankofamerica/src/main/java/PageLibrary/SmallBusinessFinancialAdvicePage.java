package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallBusinessFinancialAdvicePage extends BasePage {
    @FindBy(xpath = "//h1[@role='heading']")
    public static WebElement BusinessPageHeading;
    public SmallBusinessFinancialAdvicePage(){
        PageFactory.initElements(driver,this);
    }

}
