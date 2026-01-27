package StepDefinationFile01;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class Testcase001 {
	
	WebDriver driver;
	
	//Background:
	@Given("the user must be in chrome browser")
	public void Bg() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	//Scenario: Verify the Documentation
	@Given("The user is in cucumber home page")
	public void S1g() {
		
		driver.get("https://cucumber.io/");
		driver.manage().window().maximize();
	}
	
	@When("The user clicks on Documentation link")
	public void S1w() {
		WebElement doclink = driver.findElement(By.xpath("//*[@id=\"__docusaurus\"]/nav/div[1]/div[1]/a[2]"));
		doclink.click();
	}
	@Then("The user can view page content with What is Cucumber?")
	public void S1t() {
		
		WebElement cuc = driver.findElement(By.xpath("//h2[@id = 'what-is-cucumber']"));
		String word = cuc.getText();
		System.out.println(word);
	}
	
}