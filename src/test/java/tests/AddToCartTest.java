package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddToCartTest extends BaseTest {

    @Test
    public void searchAndAddProductToCart() {

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("chai");

        SearchResultsPage resultsPage = new SearchResultsPage(driver);
        resultsPage.openFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();

        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickCheckout();

        Assert.assertTrue(cartPage.isProductDisplayed());

        System.out.println("Product successfully added to cart.");
    }
}