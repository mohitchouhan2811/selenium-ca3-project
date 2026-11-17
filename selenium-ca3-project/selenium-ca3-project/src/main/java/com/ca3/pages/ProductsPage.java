
package com.ca3.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage {

    // Locators
	private final By heading =
	        By.cssSelector("h2.title.text-center");

    private final By searchBox =
            By.id("search_product");

    private final By searchButton =
            By.id("submit_search");

    private final By searchedHeading =
            By.xpath("//*[normalize-space()='Searched Products']");

    private final By productCards =
            By.cssSelector(".features_items .product-image-wrapper");

    private final By addToCartButton =
            By.cssSelector("a.add-to-cart");

    // Constructor
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    // Verify products page
    public boolean isDisplayed() {

        wait.until(
                ExpectedConditions.urlContains("products"));

        return visible(heading).isDisplayed();
    }


    // Search for a product
    public ProductsPage search(String product) {

        type(searchBox, product);

        click(searchButton);

        wait.until(
            ExpectedConditions.visibilityOfElementLocated(searchedHeading)
        );

        return this;
    }

    // Verify search results
    public boolean hasSearchResults() {

        wait.until(
            ExpectedConditions.visibilityOfElementLocated(searchedHeading)
        );

        List<WebElement> products = driver.findElements(productCards);

        return !products.isEmpty();
    }

    // Add first product to cart
    public void addFirstProductToCart() {

        // Wait until product cards are available
        wait.until(
            ExpectedConditions.presenceOfAllElementsLocatedBy(productCards)
        );

        // Get first product card
        WebElement firstCard =
                driver.findElements(productCards).get(0);

        // Scroll to product
        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            firstCard
        );

        // Hover over product card
        Actions actions = new Actions(driver);

        actions.moveToElement(firstCard).perform();

        // Find Add to Cart button inside the first card
        WebElement addButton =
                firstCard.findElement(addToCartButton);

        // Wait until button is visible
        wait.until(
            ExpectedConditions.visibilityOf(addButton)
        );

        // Scroll button into view
        js.executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            addButton
        );

        // Click using normal Selenium click first
        try {

            wait.until(
                ExpectedConditions.elementToBeClickable(addButton)
            ).click();

        } catch (org.openqa.selenium.ElementClickInterceptedException e) {

            // JavaScript fallback if advertisement overlaps the button
            js.executeScript(
                "arguments[0].click();",
                addButton
            );
        }
    }
}
