package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/FeatureFiles/AddToCart.feature"},plugin = {"pretty","html:target/cucumber-reports/report.html"},
        glue = {"StepDefinations"}
)
public class AddToCartRunner {

}
