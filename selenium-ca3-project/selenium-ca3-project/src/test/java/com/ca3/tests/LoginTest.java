package com.ca3.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ca3.pages.HomePage;
import com.ca3.pages.LoginPage;

class LoginTest extends BaseTest {
    @Test
    void invalidLoginShouldDisplayError() {
        LoginPage login = new HomePage(driver).open().openLogin();
        assertTrue(login.isDisplayed(), "Login form should be displayed");
        login.login("invalid-ca3-user@example.com", "WrongPassword123");
        assertTrue(login.getErrorMessage().contains("incorrect"),
                "Invalid credentials should produce an error");
    }
}
