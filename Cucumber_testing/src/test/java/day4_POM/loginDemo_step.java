package day4_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginDemo_step {
	
	WebDriver driver = null;
	login_step login;
	
	
	
	@Given("browser is ready to open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_password(String name, String password) {
	    
		login = new login_step(driver);
		login.enterUsername(name);
		login.enterPassword(password);


	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
	    
		login = new login_step(driver);
		login.clickLogin();

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
