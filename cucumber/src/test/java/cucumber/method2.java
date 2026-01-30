package cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/feature"
			,glue= {"stepdefinitions"},monochrome=true,
			plugin= {"pretty","html:traget/HtmlReports.html",
	"json:target/JSONReports.xml"}
			)
public class method2 {

}
