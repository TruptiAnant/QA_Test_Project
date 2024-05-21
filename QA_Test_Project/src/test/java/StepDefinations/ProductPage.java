package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

        WebDriver driver;

        By firstAddToCartButton = By.cssSelector(".inventory_list .inventory_item:first-child button");

        public ProductPage(WebDriver driver) {
            this.driver = driver;
        }

        public void addFirstItemToCart() {
            driver.findElement(firstAddToCartButton).click();
        }
    }


