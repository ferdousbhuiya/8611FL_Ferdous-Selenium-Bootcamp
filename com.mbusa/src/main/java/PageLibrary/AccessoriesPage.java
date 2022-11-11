package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage extends BasePage {

    @FindBy(xpath = "//h1[@class='vehicle-accessories__title']")
    public WebElement accessoriesPageheading;

    public AccessoriesPage()
    {
        PageFactory.initElements(driver, this);
    }
}
