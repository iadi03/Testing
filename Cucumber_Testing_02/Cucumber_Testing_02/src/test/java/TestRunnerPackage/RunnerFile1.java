package TestRunnerPackage;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/FeatureFile"},
glue = {"StepDefinationFile"},
tags = "@tag1",
plugin = {
	    "pretty",
	    "html:target/cucumber-reports/cucumber.html",
	    "json:target/cucumber-reports/CucumberTestReport.json",
	    "junit:target/cucumber-reports/CucumberTestReport.xml"
	    
})
//tags = "@tag1 and @tag2"


	@Test
	public class RunnerFile1 extends AbstractTestNGCucumberTests{
	 
}
