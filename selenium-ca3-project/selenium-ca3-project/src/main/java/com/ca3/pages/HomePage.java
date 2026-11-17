package com.ca3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String URL = "https://automationexercise.com/";

    private final By logo = By.cssSelector("a[href='/'] img");
    private final By loginLink = By.cssSelector("a[href='/login']");
    private final By productsLink = By.cssSelector("a[href='/products']");
    private final By cartLink = By.cssSelector("a[href='/view_cart']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public boolean isDisplayed() {
        return !driver.findElements(logo).isEmpty();
    }

    public LoginPage openLogin() {
        click(loginLink);
        return new LoginPage(driver);
    }

    public ProductsPage openProducts() {
        click(productsLink);
        return new ProductsPage(driver);
    }

    public CartPage openCart() {
        click(cartLink);
        return new CartPage(driver);
    }
}