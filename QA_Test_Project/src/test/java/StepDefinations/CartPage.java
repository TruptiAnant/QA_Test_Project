package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart(String productName) {
        driver.findElement(By.id("shopping_cart_container")).click();
        return driver.findElements(By.xpath("//div[text()='" + productName + "']")).size() > 0;
    }
}
