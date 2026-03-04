package tests;

import base.BaseTest;
import pages.SearchPage;
import org.testng.annotations.Test;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

    @Test
    public void searchAndOpenProduct(){

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("chai");
        SearchResultsPage resultsPage = new SearchResultsPage(driver);
        resultsPage.openFirstProduct();

        System.out.println("Product opened successfully.");
    }


}
