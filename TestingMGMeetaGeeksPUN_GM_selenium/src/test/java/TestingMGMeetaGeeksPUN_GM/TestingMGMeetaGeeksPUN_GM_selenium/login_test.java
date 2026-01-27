package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_test {
	
	@Test (dataProvider = "dp")

		public void f(String n, String s) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("user-name")).sendKeys(n);
		
		driver.findElement(By.id("password")).sendKeys(s);
		
		driver.findElement(By.id("login-button")).click();

	}
		@DataProvider
		
		public Object[][] dp() {
		    return new Object[][] {
		      new Object[] { "100", "emp1" },
		      new Object[] { "101", "emp2" },
		      new Object[] { "standard_user", "secret_sauce" },
		    };
	}

}
