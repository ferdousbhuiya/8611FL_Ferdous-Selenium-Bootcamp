package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoesSelectionPage extends BasePage {
    @FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']/li")
    public List<WebElement> SelectionOfShoes;

    public ShoesSelectionPage() {
        PageFactory.initElements(driver, this);
    }

    public SelectedShoesPage PopularBrandSelect() {
        scrollDown(SelectionOfShoes.get(6));
        moveToElementAndClick(SelectionOfShoes.get(6));
        //clickOnElement(PopularBrands.get(3));
        return new SelectedShoesPage();
    }
}
