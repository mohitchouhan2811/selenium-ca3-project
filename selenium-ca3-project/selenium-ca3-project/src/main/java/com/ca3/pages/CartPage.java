package com.ca3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private final By cartTable = By.id("cart_info_table");
    private final By cartRows = By.cssSelector("#cart_info_table tbody tr");

    public CartPage(WebDriver driver) { super(driver); }

    public boolean isDisplayed() { return visible(cartTable).isDisplayed(); }

    public int getItemCount() { return driver.findElements(cartRows).size(); }
}
