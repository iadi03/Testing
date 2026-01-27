package Bbd2;
 
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
 
public class Hooks {
	@Before
	public void testBefore() {
		System.out.println("Before test");
	}
	@After
	public void testAfter() {
		System.out.println("After test");
	}
	@Before("@tag6")
	public void testBefore_tag() {
		System.out.println("Before tag1 test");
	}
	@After("@tag6")
	public void testAfter_tag() {
		System.out.println("After tag1 test");
	}
	//conditional hooks
	@Before("@tag6 and not @tag3")
	public void test_Before_tag() {
		System.out.println("Before tag1 not tag2 test");
	}
	@After("@tag6 and not @tag3")
	public void test_After_tag() {
		System.out.println("After tag1 not tag2 test");
	}
	//For steps
	@BeforeStep
	public void test_Before_Step() {
		System.out.println("Before Step");
	}
	@AfterStep
	public void test_After_Step() {
		System.out.println("After Step");
	}
}