package TestFiles;

import PageLibrary.AddToCartPage;
import PageLibrary.IndexPage;
import PageLibrary.OrderPage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.openqa.selenium.devtools.v96.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPageTest extends BasePage {

    private IndexPage index= new IndexPage();
    private SearchResultPage searchResultPage= new SearchResultPage();
    private AddToCartPage addToCartPage= new AddToCartPage();
    private OrderPage orderPage= new OrderPage();



    @Test
    public void verifyTotalPrice(String productName, String qty, String size) throws Throwable {
        searchResultPage=index.searchProduct(productName);
        addToCartPage=searchResultPage.clickOnProduct();
        addToCartPage.enterQuantity(qty);
        addToCartPage.selectSize(size);
        addToCartPage.clickOnAddToCart();
        orderPage=addToCartPage.clickOnCheckOut();
        Double unitPrice=orderPage.getUnitPrice();
        Double totalPrice=orderPage.getTotalPrice();
        Double totalExpectedPrice=(unitPrice*(Double.parseDouble(qty)))+2;
        Assert.assertEquals(totalPrice, totalExpectedPrice);
    }
}
