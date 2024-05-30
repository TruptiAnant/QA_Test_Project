# QA_Test_Project


Pre Interview QA test By Trupti Anant

# Introduction

This repository containssolid foundation for automating tests using Cucumber and BDD principles for the website 'www.SauceDemo.com'. 
Automated test scenarios written in Gherkin syntax using cucumber framwork.

The test scenarios cover the following functionalities:

-Login Test (both successful and unsuccessful attempts)
-Product List Test (verifying products are listed correctly after login)
-Add to Cart Test (adding an item to the shopping cart)
-Checkout Process Test (the entire checkout process from adding an item to completing the purchase)
-Logout Test (ensuring the logout functionality works)

# Technical Stack

-Programming language Java
-Build tool Maven
-Cucumber framwork

# Setup Instructions

- Clone this repository to your local machine.
- Install dependencies using `mvn install`.
- Ensure you have the latest version of Firefox installed.


# Running the Tests

- Open a terminal and navigate to the project directory.
- Run the tests using `mvn test`.

# Viewing Reports

- After running the tests, view the HTML test report generated in the Target folder.Inside target folder view the cucumber-reports file.

# Folder Structure
- `FeatureFiles`: Contains the Gherkin feature files.
- `StepDefinations`: Contains the step definitions for the Gherkin steps.
- 'Runner': This folder have all the Runner files for asociated feature files.

# Test Design Approach

- Each feature file corresponds to a specific functionality of the Saucedemo website.
- Step definitions are implemented in separate files to maintain modularity and readability.
- Page Object Models (POMs) are used to abstract interactions with website elements, enhancing test maintainability.

# Assumptions

-  Stable internet connection.
- Tests are designed to run on Firefox browser.
  

