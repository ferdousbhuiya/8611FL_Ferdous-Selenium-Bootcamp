package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopBMWAccessoriesPage extends BasePage {
    @FindBy(xpath = "//section[@class='NewFmaJahreBtn']/div/a[1]")
    public WebElement shopNowButton;


    public ShopBMWAccessoriesPage(){
        PageFactory.initElements(driver,this);
    }
    public AccessoriesPage navigateToAccessoriesPage(){
        clickOnElement(shopNowButton);
        return new AccessoriesPage();
    }
}
