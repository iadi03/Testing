package Bdd1;

import org.testng.annotations.Test; 


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/Bdd1"},
glue = "Bdd1"

)
	
	@Test
	public class Test_day1 extends AbstractTestNGCucumberTests{
	 
}
