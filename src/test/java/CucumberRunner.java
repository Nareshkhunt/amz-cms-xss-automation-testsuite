import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        dryRun = false,
        strict = true,
        tags = " @smoke",
        plugin = "json:target/cucumber.json")
public class CucumberRunner {
}
