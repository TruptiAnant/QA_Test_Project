package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AddToCartSteps {


    WebDriver driver;
    LoginPage loginPage;
    ProductPage productsPage;

    @Given("I am logged in to the Sauce Demo site")
    public void i_am_logged_in_to_the_sauce_demo_site() {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("I add the first item to the cart")
    public void i_add_the_first_item_to_the_cart() {
        productsPage = new ProductPage(driver);
        productsPage.addFirstItemToCart();
    }

    @Then("the cart should have {int} item")
    public void the_cart_should_have_item(int itemCount) {
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(String.valueOf(itemCount), cartCount);

        driver.quit();
    }
}


