package Runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/dsAlgoReport.html" }, // reporting purpose
		monochrome = false, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/Features" }, // location of feature files
		glue = { "StepDefinition", "ApplicationHooks" }) // location of step definition files

public class testRunner extends AbstractTestNGCucumberTests {
//	@DataProvider(parallel = false)
//	public Object[][] scenarios() {
//
//		return super.scenarios();
//	}

}
