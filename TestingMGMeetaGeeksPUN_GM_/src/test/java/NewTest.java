import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	@BeforeTest
	
	public void BeforeTestExecute() {
		
		System.out.println("This will execute before the Test");
		
	}

	@AfterTest
	  public void AfterTestExecute() {
		System.out.println("This will after before the Test");

	}
	
	@BeforeClass
	
	public void BeforeTestClass() {
		System.out.println("Before class");
	}
		
	@AfterClass
	public void AfterTestClass() {
		
		System.out.println("After class");

		
	}
	
	@BeforeMethod
	
	public void BeforeMethodTest() {
		
		System.out.println("Before Method");
		
	}
	
	@AfterMethod
	
	public void AfterMethodTest() {
		System.out.println("After Method");
		
	}
	
	@BeforeSuite
	
	public void BeforeSuiteTest() {
		System.out.println("BeforeSuiteTest");
		
	}
	
	@AfterSuite
	
	public void AfterSuiteTest() {
		System.out.println("AfterSuiteTest");
		
	}
	
	


 }
