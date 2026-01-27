package StepDefinationFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDef1 {
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String name) {
		System.out.println(name);
	}
	@When("I want to enter {int} id as idnum")
	public void idtest(int id) {
		System.out.println(id);
	}
	
	@And("I want to enter {double} as salary")
	public void saltest(double sal) {
		System.out.println(sal);
	}
	
}
