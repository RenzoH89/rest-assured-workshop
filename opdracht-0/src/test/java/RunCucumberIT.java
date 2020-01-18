import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberIT {
}
