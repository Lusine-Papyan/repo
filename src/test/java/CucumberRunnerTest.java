import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:report.json"},
        features = "src/test/resources/features"
        ,glue="steps"
)
public class CucumberRunnerTest {


}
