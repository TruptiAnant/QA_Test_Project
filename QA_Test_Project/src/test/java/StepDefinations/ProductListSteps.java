package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


import static org.junit.Assert.assertTrue;


public class ProductListSteps {


        WebDriver driver;
        WebDriverWait wait;

        @Given("the user is on the SauceDemo login page")
        public void the_user_is_on_the_SauceDemo_login_page() {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get("https://www.saucedemo.com/");

        }

        @When("the user logs in with valid credentials")
        public void the_user_logs_in_with_valid_credentials() {

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
        }

        @Then("the user should see the product list")
        public void the_user_should_see_the_product_list() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item")));
            List<WebElement> products = driver.findElements(By.className("inventory_item"));
            assertTrue(products.size() > 0);
            driver.quit();
        }
    }


