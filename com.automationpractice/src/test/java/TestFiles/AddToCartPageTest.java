package TestFiles;

import PageLibrary.AddToCartPage;
import PageLibrary.IndexPage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BasePage {

    private IndexPage index;
    private SearchResultPage searchResultPage;
    private AddToCartPage addToCartPage;



    @Test
    public void addToCartTest(String productName, String qty, String size) throws Throwable {
        index= new IndexPage();
        searchResultPage=index.searchProduct(productName);
        addToCartPage=searchResultPage.clickOnProduct();
        addToCartPage.enterQuantity(qty);
        addToCartPage.selectSize(size);
        addToCartPage.clickOnAddToCart();
        boolean result=addToCartPage.validateAddtoCart();
        Assert.assertTrue(result);

    }

}
