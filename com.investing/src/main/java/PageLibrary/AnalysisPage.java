package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalysisPage extends BasePage {

    @FindBy(xpath = "//h1[normalize-space()='Analysis & Opinion']")
    public WebElement SubHeadingOfAnalysisPage;

    public AnalysisPage()
    {
        PageFactory.initElements(driver, this);
    }
}
