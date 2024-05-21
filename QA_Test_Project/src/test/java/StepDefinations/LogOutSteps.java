package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogOutSteps {


    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();


        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());
    }

    @When("the user logs out")
    public void the_user_logs_out() {
        inventoryPage.clickMenuButton();
        inventoryPage.clickLogoutButton();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        driver.quit();
    }
}


