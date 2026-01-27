package Bbd2;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/Bbd2"},
glue = {"Bbd2"},
tags = "@tag6 or tag3",
plugin = {
	    "pretty",
	    "html:target/cucumber-report.html",
	    "json:target/cucumber-report.json"})
//tags = "@tag1 and @tag2"


	@Test
	public class Test_day_11 extends AbstractTestNGCucumberTests{
	 
}
