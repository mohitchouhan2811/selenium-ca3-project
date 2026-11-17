package com.ca3.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ca3.pages.HomePage;

class HomePageTest extends BaseTest {
    @Test
    void homePageShouldLoad() {
        HomePage home = new HomePage(driver).open();
        assertTrue(home.isDisplayed(), "Home page logo should be visible");
        assertTrue(home.getTitle().toLowerCase().contains("automation"));
    }
}
