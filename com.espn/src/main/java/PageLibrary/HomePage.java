package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//li[@class='user hover']/div/div/ul/li[7]/a")
    public static WebElement signInButton;

    @FindBy(xpath = "//section[@class='col-one']//button[@class='button med'][normalize-space()='Sign Up']")
    public WebElement SignUpButton;
    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_fantasy']//span//span[@class='link-text'][normalize-space()='Fantasy']")
    public WebElement FantasyButton;

    @FindBy(xpath = "//li[@class='user hover']/div/div/ul/li[9]/a")
    public static WebElement signOutButton;

    @FindBy(xpath = "//section[@class='FavMgmt__Col FavMgmt__Col--Left flex flex-column']/div[1]/ul/li")
    public List<WebElement> suggestedFollowTeam;

    @FindBy(xpath = "//section[@class='FavMgmt__Col FavMgmt__Col--Right flex flex-column']/div[1]/ul[3]/li")
    public static List<WebElement> myLeaguesTable;

    @FindBy(xpath = "(//ul[@class = 'EditMgmt__List']/li)[15]") //Change the 15 for select different countries.
    public static WebElement editionList;

    @FindBy(xpath = "//header[@id='global-header']//ul[1]//ul[@class='account-management']/li[4]//a")
    public WebElement editionButton;

    @FindBy(xpath = "//section[@class='section section-primary']/div[1]//input")
    public WebElement emailInput;

    @FindBy(xpath = "//section[@class='section section-primary']/div[2]//input")
    public WebElement passwordInput;

    @FindBy(xpath = "//section[@class='section section-primary']/div[3]//button")
    public WebElement logInButton;

    //@FindBy(xpath = "//ul[@class='espn-en']/li")
    //nav[@id='global-nav']/ul/li

    @FindBy(xpath = "//nav[@id='global-nav']/ul/li")
    public List<WebElement> navBarList;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']")
    public WebElement soccer;

    @FindBy(xpath = "//a[@href='/nfl/scoreboard']")
    public WebElement scoreLink;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+watch+apps']")
    public WebElement appLink;
    @FindBy(xpath = "//a[@href='/nfl/schedule']")
    public WebElement scheduleLink;

    @FindBy(id = "global-user-trigger")
    public static WebElement userIcon;

    @FindBy(id = "disneyid-iframe")
    public WebElement signInIframe;

    @FindBy(xpath = "//a[@name='&lpos=hp-rightrail:image:2']")
    public WebElement videoLink;

    @FindBy(id = "main-container")
    public  static WebElement pauseVideo;

    @FindBy(xpath = "//header[@id='global-header']//ul/li[2]/div/div/ul[1]/li[5]//a")
    public WebElement espnProfileLink;

    @FindBy(xpath = "//header[@id='global-header']//ul[2]//a[@class='button sm open-favs']")
    public WebElement addFavoriteButton;

    @FindBy(id = "disneyid-iframe")
    public WebElement espnProfileIframe;

    @FindBy(id = "favorites-manager-iframe")
    public WebElement favoriteIframe;

    @FindBy(xpath = "//div[@class='lightbox-container']//iframe")
    public WebElement editionIframe;

    @FindBy(id = "phoneid-MOBILE")
    public WebElement phoneNumberInput;
    @FindBy(xpath = "//button[contains(text(),'Done')]")
    public WebElement doneButton;

    @FindBy(xpath = "//h2[contains(text(),'Verify your mobile number')]")
    public static WebElement verifyMobileText;

    @FindBy(xpath = "//span[@class='quicklinks_list__name'][normalize-space()='Kabaddi']")
    public WebElement FeaturedPlay;

    @FindBy(xpath = "//a[normalize-space()='Play']")
    public WebElement PlayVideoOfNFL;

    @FindBy(xpath = "//div[@class='PageFooter__QuickLinks']//span[@class='quicklinks_list__name'][normalize-space()='NFL PrimeTime']")
    public WebElement NFLLink;


    @FindBy(xpath = "//div[contains(@class,'global-user-container')]/ul/li")
    public List<WebElement> EditionListInSignInContainer;


    @FindBy(xpath = "(//span[@class='link-text' and text()='Scores'])[1]")
    public WebElement NBLScore;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void SiginUp()
    {
        moveToElementAndClick(SignUpButton);

    }
    public HomePage singIn()  {
        hoverOverElement(userIcon);
        moveToElementAndClick(signInButton);
        waitForVisibilityOfElement(signInIframe);
        switchToFrameByElement(signInIframe);
        sendKeysToElement(emailInput, excel.readStringArrays("Sheet1")[0][0]);
        sendKeysToElement(passwordInput, excel.readStringArrays("Sheet1")[0][1]);
        clickOnElement(logInButton);
        return new HomePage();
    }

    public void signOut() {
        hoverOverElement(userIcon);
        moveToElementAndClick(signOutButton);
    }

    public NflPage NBAScoreTesting() {
        hoverOverElement(navBarList.get(3));
        waitForVisibilityOfElement(scoreLink);
        moveToElementAndClick(scoreLink);
        return new NflPage();
    }

    public NflSchedulePage nflSchedule() {
        clickAnElementMatchingText(navBarList, "nba");
        //moveToElementAndClick(navBarList.get(3));
        waitForVisibilityOfElement(navBarList.get(4));
        moveToElementAndClick(NBLScore);
        return new NflSchedulePage();
    }

    public void VideoPlay() {
        jsClickOnElement(videoLink);
    }

    public void PauseVideo() {
        moveToElementAndClick(pauseVideo);
    }

    public ESPNAppPage downloadEspnApp() {
        hoverOverElement(navBarList.get(8));
        moveToElementAndClick(appLink);
        return new ESPNAppPage();
    }

    public SoccerPage navigateToSoccerPage() {
        clickOnElement(soccer);
        return new SoccerPage();
    }

    public void addPhoneNumberEspnProfile() {
        hoverOverElement(userIcon);
        jsClickOnElement(espnProfileLink);
        waitForVisibilityOfElement(espnProfileIframe);
        switchToFrameByElement(espnProfileIframe);
        clearSendKeysToElement(phoneNumberInput, GenerateData.mobilePhone());
        jsClickOnElement(doneButton);
    }

    public void addFavorite() {
        hoverOverElement(userIcon);
        jsClickOnElement(addFavoriteButton);
        waitForVisibilityOfElement(favoriteIframe);
        switchToFrameByElement(favoriteIframe);
        jsClickOnElement(suggestedFollowTeam.get(1).findElement(By.tagName("button")));
        jsClickOnElement(suggestedFollowTeam.get(2).findElement(By.tagName("button")));
        jsClickOnElement(suggestedFollowTeam.get(3).findElement(By.tagName("button")));
        jsClickOnElement(suggestedFollowTeam.get(4).findElement(By.tagName("button")));
        jsClickOnElement(suggestedFollowTeam.get(5).findElement(By.tagName("button")));
    }

    public void CountryEditionSelection()  {
        hoverOverElement(userIcon);
        jsClickOnElement(editionButton);
        waitForVisibilityOfElement(editionIframe);
        switchToFrameByElement(editionIframe);
        waitForVisibilityOfElement(editionList);
        moveToElementAndClick(editionList);
        waitForThePresenceOfTheElement(By.id("global-user-trigger"));
        hoverOverElement(userIcon);
    }
    public FantasyPage navigateToFantasyHome()
    {
    clickOnElement(FantasyButton);
    return new FantasyPage();
    }

    public void NFLVideoPlayTest()
    {
        clickOnElement(NFLLink);
        clickOnElement(PlayVideoOfNFL);
    }



    }
