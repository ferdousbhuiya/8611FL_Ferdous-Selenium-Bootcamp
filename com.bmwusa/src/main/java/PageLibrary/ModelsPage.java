package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModelsPage extends BasePage {
    @FindBy(xpath = "//ul[@class='globalnav-primary-vehicles__filter']//li")
    public List<WebElement> filterModels;

    @FindBy(xpath = "//div[@class='globalnav-primary-vehicles__tab-holder']/div[2]/div/div[@class='globalnav-primary-vehicles__cars']/div")
    public List<WebElement> carModel;

    public ModelsPage() {
        PageFactory.initElements(driver, this);
    }

    public X4ModelPage filterModels() {
//        int max = filterModels.size()-1;
//        int min = 0;
//        int randomValue = (int) Math.floor(Math.random() * (max - min + 1) + min);
        clickOnElement(filterModels.get(1).findElement(By.tagName("button")));
        clickOnElement(carModel.get(2).findElement(By.tagName("a")));
        return new X4ModelPage();

    }

}
