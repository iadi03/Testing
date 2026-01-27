package Bdd1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class SmokeTest1 {
	@Given ("I am holding the calculator")
	public void step1() {
		System.out.println(" jkshr");
	}
	
    @When ("I enter the first number")
	public void step2() {
    	System.out.println("sfghd");
    }
    
    @And ("I click on + symbol")
	public void step3() {
    	System.out.println("sgfr");
    }
    
    @And ("I enter the second number")
	public void step4() {
    	System.out.println("rtsj");
    }
    
    @Then ("I must be able to view the sum of the numbers")
	public void step5() {
    	System.out.println("htee");
    }
}
