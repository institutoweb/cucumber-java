import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/ejemplo.feature",
        glue = "StepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-html-report.html"
        }
)
public class Proyecto extends AbstractTestNGCucumberTests {}
