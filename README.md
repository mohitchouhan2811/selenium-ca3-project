# Selenium CA3 Project

## Selenium-Based Website Testing Using Selenium WebDriver

**Course / Subject:** Software Testing & Quality Assurance (STQA)  
**Project Title:** Selenium-Based Website Testing Using Java, Selenium WebDriver and JUnit 5  
**System Under Test (SUT):** Automation Exercise Website  
**Testing Tool:** Selenium WebDriver with JUnit 5  

---

## 1. Project Objective

The objective of this project is to automate the testing of the Automation Exercise website using Selenium WebDriver, Java, and JUnit 5. This project demonstrates practical implementation of Software Testing and Quality Assurance concepts through automated web application testing.

The project covers:

- Functional Testing
- Automated UI Testing
- Page Object Model (POM)
- Navigation Testing
- Product Search Testing
- Cart Functionality Testing
- Login Testing
- Regression Testing

---

## 2. Technology Stack

| Component | Technology |
|------------|------------|
| Programming Language | Java |
| Automation Tool | Selenium WebDriver |
| Testing Framework | JUnit 5 |
| Build Tool | Maven |
| Browser | Google Chrome |
| IDE | Eclipse IDE |
| Design Pattern | Page Object Model (POM) |

---

## 3. System Architecture

```text
+------------------------+
|      JUnit 5 Tests     |
+------------+-----------+
             |
             v
+------------------------+
| Selenium WebDriver API |
+------------+-----------+
             |
             v
+------------------------+
|      ChromeDriver      |
+------------+-----------+
             |
             v
+------------------------+
| Automation Exercise UI |
| automationexercise.com |
+------------------------+
```

---

## 4. Target Application

**Automation Exercise**

https://automationexercise.com/

---

## 5. Website Modules Tested

### Home Page
- Verify homepage loads successfully
- Verify website logo visibility
- Verify page title

### Login Module
- Navigate to login page
- Verify login page availability

### Products Module
- Navigate to products page
- Search products
- Verify search results

### Cart Module
- Add products to cart
- Open cart page
- Verify cart functionality

---

## 6. Test Cases Implemented

| Test ID | Module | Description |
|----------|----------|------------|
| TC-HOME-001 | Home | Verify Home Page Loads |
| TC-HOME-002 | Home | Verify Website Logo |
| TC-LOGIN-001 | Login | Open Login Page |
| TC-PRODUCT-001 | Products | Open Products Page |
| TC-PRODUCT-002 | Products | Search Product |
| TC-CART-001 | Cart | Add Product To Cart |
| TC-CART-002 | Cart | Verify Cart Page |

---

## 7. Project Structure

```text
selenium-ca3-project
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.ca3.pages
│   │           ├── BasePage.java
│   │           ├── HomePage.java
│   │           ├── LoginPage.java
│   │           ├── ProductsPage.java
│   │           └── CartPage.java
│   │
│   └── test
│       └── java
│           └── com.ca3.tests
│               ├── BaseTest.java
│               ├── HomePageTest.java
│               ├── LoginTest.java
│               ├── ProductSearchTest.java
│               └── CartTest.java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## 8. Features Implemented

### Page Object Model (POM)
Separate page classes have been created for:
- Home Page
- Login Page
- Products Page
- Cart Page

### Selenium Components Used
- WebDriver
- ChromeDriver
- WebDriverWait
- ExpectedConditions
- Actions
- JavascriptExecutor

### Automation Features
- Explicit Waits
- Dynamic Element Handling
- Product Search Automation
- Cart Automation
- Browser Navigation
- Automated Assertions using JUnit 5

---

## 9. Installation and Setup

### Prerequisites

- Java JDK 17+
- Maven
- Google Chrome
- Eclipse IDE

### Clone Repository

```bash
git clone https://github.com/mohitchouhan2811/selenium-ca3-project.git
```

### Build Project

```bash
mvn clean install
```

### Execute Tests

```bash
mvn test
```

or

```text
Right Click Test Class
→ Run As
→ JUnit Test
```

---

## 10. Test Execution Results

| Module | Status |
|----------|----------|
| Home Page Testing | PASS |
| Login Testing | PASS |
| Product Search Testing | PASS |
| Cart Testing | PASS |

### Metrics Summary

- Total Automated Test Cases: 7+
- Test Framework: JUnit 5
- Automation Tool: Selenium WebDriver
- Design Pattern: Page Object Model
- Build Management: Maven

---

## 11. Team Members

| Name | USN |
|--------|--------|
| Mohit Chouhan | 20241ISE0035 |
| Pranay Gangadhar Bhat | 20241ISE0042 |

---

## 12. Course Details

**Software Testing & Quality Assurance (STQA)**

**Section:** 5ISE01

**B.Tech - Information Science & Engineering**

---

## 13. Future Enhancements

- Data Driven Testing using Excel Files
- Cross Browser Testing
- Selenium Grid Integration
- Allure Reporting
- GitHub Actions CI/CD Pipeline
- Screenshot Capture for Failed Tests
- Advanced UI Automation Scenarios

---

## Repository

GitHub Repository:  
https://github.com/mohitchouhan2811/selenium-ca3-project
