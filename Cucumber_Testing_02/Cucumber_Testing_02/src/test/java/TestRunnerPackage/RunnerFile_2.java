package TestRunnerPackage;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features= {"src/test/java/Feature_Cucumber_java"},
		glue="StepDefinationFile01",
		tags = "@tag1",
		plugin = {"pretty",
			    "html:target/cucumber-report.html",
			    "json:target/cucumber-report.json",
			    "junit:target/cucumber-report.xml"})
 
@Test
public class RunnerFile_2 extends AbstractTestNGCucumberTests {
}