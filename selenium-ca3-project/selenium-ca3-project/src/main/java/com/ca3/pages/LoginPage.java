package com.ca3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By heading = By.xpath("//*[normalize-space()='Login to your account']");
    private final By email = By.cssSelector("form[action='/login'] input[data-qa='login-email']");
    private final By password = By.cssSelector("form[action='/login'] input[data-qa='login-password']");
    private final By loginButton = By.cssSelector("form[action='/login'] button[data-qa='login-button']");
    private final By error = By.xpath("//*[contains(.,'Your email or password is incorrect!')]");

    public LoginPage(WebDriver driver) { super(driver); }

    public boolean isDisplayed() { return visible(heading).isDisplayed(); }

    public LoginPage login(String userEmail, String userPassword) {
        type(email, userEmail);
        type(password, userPassword);
        click(loginButton);
        return this;
    }

    public String getErrorMessage() { return visible(error).getText(); }
}
