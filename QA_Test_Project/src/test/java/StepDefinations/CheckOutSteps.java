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

public class CheckOutSteps {

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productsPage;

    @Given("I am on the  login page")
    public void i_am_on_the_saucedemo_login_page() {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");


    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
       /* driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");*/
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
       // driver.findElement(By.id("login-button")).click();
    }

    @And("I add an item to the cart")
    public void i_add_an_item_to_the_cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("I proceed to checkout")
    public void i_proceed_to_checkout() {
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
    }

    @And("I enter the checkout information")
    public void i_enter_the_checkout_information() {
        driver.findElement(By.id("first-name")).sendKeys("Ram");
        driver.findElement(By.id("last-name")).sendKeys("Krishna");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
    }

    @And("I finish the checkout process")
    public void i_finish_the_checkout_process() {
        driver.findElement(By.id("finish")).click();
    }

    @Then("I should see the order confirmation message")
    public void i_should_see_the_order_confirmation_message() {
        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));
        Assert.assertEquals("Thank you for your order !", confirmationMessage.getText());
        driver.quit();
    }
}



