package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnPage extends BasePage {
    @FindBy(xpath = "//a[@title='iX Sports Activity Vehicle']")
    public WebElement selectButton;

    public BuildYourOwnPage(){
        PageFactory.initElements(driver,this);
    }

    public IxSportActivityVehiclePage clickSelect(){
        clickOnElement(selectButton);
        return new IxSportActivityVehiclePage();
    }

}
