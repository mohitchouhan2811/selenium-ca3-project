package com.ca3.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ca3.pages.HomePage;
import com.ca3.pages.ProductsPage;

class ProductSearchTest extends BaseTest {
    @Test
    void searchingForDressShouldShowResults() {
        ProductsPage products = new HomePage(driver).open().openProducts();
        assertTrue(products.isDisplayed(), "All Products page should be displayed");
        products.search("dress");
        assertTrue(products.hasSearchResults(), "Search results should be displayed");
    }
}
