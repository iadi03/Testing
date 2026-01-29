package TestRunnerPackage;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:/Users/aditya.sah/eclipse-workspace/Cucumber_Testing_02/src/test/java/RunnerPackage"},
glue="StepDefination03",
tags = "@tag2",
plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json"
    },
    monochrome = true
)
public class Runnerfile_3 extends AbstractTestNGCucumberTests {
 
    // Enable parallel execution of scenarios if needed (optional)
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}