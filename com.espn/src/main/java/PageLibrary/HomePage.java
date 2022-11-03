package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
///html/body/div[5]/div[2]/header/nav[1]/ul/li[11]/a/span/span[1]
    @FindBy(xpath = "//body[@class='index desktop page-context-top prod']/div[@id='global-viewport']/div[@id='header-wrapper']/header[@id='global-header']/nav[@id='global-nav']/ul[@class='espn-en']/li[@class='pillar logo fantasy fantasy']/a[@itemprop='url']/span/span[1] ")
    WebElement FantasyButton;

    @FindBy(xpath = "/html/body/div[5]/div[2]/header/nav[1]/ul/li[9]/div/ul[1]/li[1]/a/span/span[1][1]")
    WebElement FantasyHomeLink;

public HomePage(){
    PageFactory.initElements(driver, this);
}

public FantasyPage navigateToFantasyHome()
{
    clickOnElement(FantasyButton);
    return new FantasyPage();
}



}
