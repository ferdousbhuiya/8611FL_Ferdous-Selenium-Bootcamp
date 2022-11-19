package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'ACCESSORIES')]")
    public static WebElement accessoriesHeader;
    public AccessoriesPage(){

        PageFactory.initElements(driver,this);
    }
}
