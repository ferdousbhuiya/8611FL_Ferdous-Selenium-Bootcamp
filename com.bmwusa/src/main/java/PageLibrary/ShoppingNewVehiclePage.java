package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingNewVehiclePage extends BasePage {
    @FindBy(xpath = "//a[@href='/contact/inventory-contactdealer-series.html']")
    public WebElement contactDealer;
    @FindBy(xpath = "//span[contains(text(),'Select a Series')]")
    public static WebElement selectSeries;

    public ShoppingNewVehiclePage(){
        PageFactory.initElements(driver,this);
    }

}
