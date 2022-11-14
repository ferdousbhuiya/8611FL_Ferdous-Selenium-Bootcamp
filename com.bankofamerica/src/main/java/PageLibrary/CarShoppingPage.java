package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarShoppingPage extends BasePage {
    @FindBy(xpath = "//h3[@class='display-3 m-0 widget-heading']")
    public static WebElement header;
    public CarShoppingPage(){
        PageFactory.initElements(driver,this);


    }

}
