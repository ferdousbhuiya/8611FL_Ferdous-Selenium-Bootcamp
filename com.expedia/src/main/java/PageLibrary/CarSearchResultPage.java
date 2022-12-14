package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarSearchResultPage extends BasePage {

    @FindBy(xpath = "//div[@class='uitk-layout-grid-item uitk-layout-grid-item-columnspan-9']")
    public static WebElement carSearchResult;

    @FindBy(xpath = "//ol[@class='results-list no-bullet']/li")
    public List<WebElement> listOfAllCar;

    @FindBy(id = "app-captcha-pwa")
    public static WebElement securityPageVerification;

    @FindBy(xpath = "//div[contains(text(),'Stays')]")
    public WebElement blankspace;

    public CarSearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public void ReserveCar() {
        clickOnElement(blankspace);
        waitForVisibilityOfElement(carSearchResult);
        clickOnElement(listOfAllCar.get(3).findElement(By.tagName("a")));
    }
}
