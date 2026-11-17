package com.ca3.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ca3.pages.HomePage;
import com.ca3.pages.ProductsPage;
import com.ca3.pages.CartPage;

class CartTest extends BaseTest {
    @Test
    void productCanBeAddedToCart() {
        ProductsPage products = new HomePage(driver).open().openProducts();
        assertTrue(products.isDisplayed());
        products.addFirstProductToCart();

        // The site opens an add-to-cart confirmation modal. Navigate to the cart page.
        CartPage cart = new HomePage(driver).openCart();
        assertTrue(cart.isDisplayed(), "Cart page should be displayed");
        assertTrue(cart.getItemCount() > 0, "Cart should contain at least one product");
    }
}
