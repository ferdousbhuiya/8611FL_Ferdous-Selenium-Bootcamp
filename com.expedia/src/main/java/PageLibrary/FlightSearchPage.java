package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FlightSearchPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Choose departing flight')]")
    public static WebElement chooseDepartingText;

    @FindBy(xpath = "//ul[@data-test-id='listings']/li")
    public List<WebElement> listOfFlight;

    @FindBy(xpath = "//ul[@data-test-id='listings']")
    public  WebElement signInLink;

    @FindBy(xpath = "//ul[@data-test-id='listings']")
    public static WebElement farSelectedText;

    @FindBy(xpath = "//ul[@class='uitk-carousel-item-container mounted']/li[1]//button[@stid='select-button']")
    public WebElement selectFareButton;


    public FlightSearchPage() {
        PageFactory.initElements(driver, this);
    }

    public FlightSearchPage selectFlight() {
        //page take too long to load
        webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(35));
        webDriverWait.until(ExpectedConditions.visibilityOf(signInLink));
        jsClickOnElement(listOfFlight.get(1).findElement(By.tagName("button")));
        return new FlightSearchPage();
    }
    public ChooseFarePage selectFare(){
        waitForVisibilityOfElement(selectFareButton);
        jsClickOnElement(selectFareButton);
        return new ChooseFarePage();
    }


}
