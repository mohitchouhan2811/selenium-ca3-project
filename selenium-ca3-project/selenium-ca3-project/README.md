# Selenium-Based Website Testing with Java, JUnit 5 and POM

Automated UI testing framework for [Automation Exercise](https://automationexercise.com/).

## Stack
- Java 17
- Selenium WebDriver 4
- JUnit 5
- Maven
- Page Object Model (POM)

## Automated scenarios
1. Home page loads.
2. Products page opens.
3. Search for a product and verify results.
4. Invalid login displays an error.
5. Add a product to the cart and verify the cart.

## Structure
```text
src/main/java/com/ca3/pages/
  BasePage.java
  HomePage.java
  LoginPage.java
  ProductsPage.java
  CartPage.java
src/test/java/com/ca3/tests/
  BaseTest.java
  HomePageTest.java
  LoginTest.java
  ProductSearchTest.java
  CartTest.java
pom.xml
README.md
.gitignore
```

## Requirements
Install JDK 17+, Eclipse IDE with Maven support, and Google Chrome.

## Import into Eclipse
1. Extract this ZIP.
2. Select File → Import → Maven → Existing Maven Projects.
3. Browse to the extracted `selenium-ca3-project` folder.
4. Select `pom.xml`, then Finish.
5. Right-click the project → Maven → Update Project.

## Run
Right-click an individual test class → Run As → JUnit Test.

Or open a terminal in the project root and run:
```bash
mvn clean test
```

Selenium Manager (included with Selenium 4) manages the browser driver automatically.

## Notes
- Tests use public demo data; no real purchases are made.
- Invalid-login testing uses deliberately incorrect credentials.
- Website HTML and locators may change. Update the relevant Page Object if the live site changes.
- Do not commit real passwords or private account details.
