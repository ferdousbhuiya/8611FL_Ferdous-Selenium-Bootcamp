package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspanolPage extends BasePage {

    @FindBy(xpath = "//a[@data-label='English']")
    public WebElement SpanishPageText;
}
