package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidLoginSteps {

        WebDriver driver;

        @Given("I am on the SauceDemo login page")
        public void i_am_on_the_saucedemo_login_page() {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://www.saucedemo.com/");
        }

        @When("I enter username {string} and password {string}")
        public void i_enter_username_and_password(String username, String password) {
            WebElement usernameField = driver.findElement(By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));

            usernameField.clear();
            usernameField.sendKeys(username);
            passwordField.clear();
            passwordField.sendKeys(password);
        }

        @And("I click the login button")
        public void i_click_the_login_button() {
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();
        }

        @Then("I should see an error message {string}")
        public void i_should_see_an_error_message(String expectedErrorMessage) {
            WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
            String actualErrorMessage = errorMessage.getText();
            Assert.assertTrue("Expected error message not found!", actualErrorMessage.contains(expectedErrorMessage));
            driver.quit();
        }
    }


