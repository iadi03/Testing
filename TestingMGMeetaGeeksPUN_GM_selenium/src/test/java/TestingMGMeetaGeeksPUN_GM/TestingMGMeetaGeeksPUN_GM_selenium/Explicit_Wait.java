package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
 
import junit.framework.Assert;
 
public class Explicit_Wait {
	WebDriver driver;
 

		
		@Test
		public void Explicit_Synd() {
			driver.get("https://www.orangetravels.in/#/");
			WebElement ignore = driver.findElement(By.xpath("//button[@data-dismiss='model]"));
		}
		
		public static void Waiting_Implicit(int tm) {
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(tm));
		}
		
		
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		    wait.until(d -> revealed.isDisplayed());
}