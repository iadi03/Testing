package TestRunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
 
@CucumberOptions(
    features = "C:/Users/aditya.sah/eclipse-workspace/Cucumber_Testing_02/src/test/java/ExcelFeature",
    glue = "Excel_File",
    tags = "@signup",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json"
    },
    monochrome = true
)
public class ExcelFile extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() { return super.scenarios(); }
}